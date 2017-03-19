package com.mycompany.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rock on 2/8/2017.
 */
public class CustomAdapter extends BaseAdapter {



    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter(MainActivity mainActivity, String[] andverslist, int[] andversImages) {


        result=andverslist;
        context=mainActivity;
        imageId=andversImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return result.length;
    }

    public Object getItem(int position) {


        return position;
    }

    @Override
    public long getItemId(int position) {


        return position;
    }
    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.gridview_xml, parent,false);
        holder.tv=(TextView) rowView.findViewById(R.id.textView);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView);

        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });

        return rowView;
    }

}

