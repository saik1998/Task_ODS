package com.firstapp.task_ods.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.firstapp.task_ods.Model.TaskModel;
import com.firstapp.task_ods.R;

import java.util.ArrayList;
import java.util.List;

public class TaskAdapter extends BaseAdapter {
    Context context;
    List<TaskModel> taskModelList=new ArrayList<>();
    LayoutInflater layoutInflater;

    public TaskAdapter(Context context, List<TaskModel> taskModelList) {
        this.context = context;
        this.taskModelList = taskModelList;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return taskModelList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        View root=layoutInflater.inflate(R.layout.custom_contact,null);


        ImageView img=root.findViewById(R.id.cartoon_image);

        TextView name1=root.findViewById(R.id.student_name);

        ImageView callicon=root.findViewById(R.id.message_icon);


//        TextView contactname=root.findViewById(R.id.name);
//
//        TextView contactNumber=root.findViewById(R.id.number);
//
//        TextView contactLocation=root.findViewById(R.id.Location);


        //img.setImageResource(taskModelList.get(i).getImage());

        name1.setText(taskModelList.get(i).getName());

        callicon.setImageResource(taskModelList.get(i).getImage());

        img.setImageResource(taskModelList.get(i).getImage());



        return root;
    }
}
