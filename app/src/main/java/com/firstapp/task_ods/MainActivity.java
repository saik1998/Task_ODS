package com.firstapp.task_ods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.firstapp.task_ods.Adapter.TaskAdapter;
import com.firstapp.task_ods.Model.TaskModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TaskAdapter taskAdapter;
    TaskModel taskModel;
    List<TaskModel> taskModelList = new ArrayList<>();
    ListView list1;

    TextView textView;

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1 = findViewById(R.id.list_view);
        taskAdapter = new TaskAdapter(this, taskModelList);
        list1.setAdapter(taskAdapter);


        loadUserData();

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("namekey",taskModelList.get(i).getName());
                intent.putExtra("numberkey",taskModelList.get(i).getNumber());
                intent.putExtra("locationkey",taskModelList.get(i).getLocation());
                intent.putExtra("imagekey",taskModelList.get(i).getImage());
                startActivity(intent);
            }
        });

    }

    private void loadUserData() {

        taskModel = new TaskModel(R.drawable.img, R.drawable.ic_baseline_call_24, "99089432");
        taskModelList.add(taskModel);

        taskModel = new TaskModel(R.drawable.img, R.drawable.ic_baseline_call_24, "932742318");
        taskModelList.add(taskModel);

        taskModel = new TaskModel(R.drawable.img, R.drawable.ic_baseline_call_24, "312er323e1");
        taskModelList.add(taskModel);

        taskModel = new TaskModel(R.drawable.img, R.drawable.ic_baseline_call_24, "31232342");
        taskModelList.add(taskModel);

        taskModel = new TaskModel(R.drawable.img, R.drawable.ic_baseline_call_24, "32132423");
        taskModelList.add(taskModel);

        taskModel = new TaskModel(R.drawable.img, R.drawable.ic_baseline_call_24, "4232r432");
        taskModelList.add(taskModel);

        taskAdapter.notifyDataSetChanged();




            }
}




