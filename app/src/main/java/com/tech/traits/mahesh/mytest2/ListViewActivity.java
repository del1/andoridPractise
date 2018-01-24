package com.tech.traits.mahesh.mytest2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        //String numbers[]={"Fist","two","three","four","five","six","seven"};
        final List<String> numbers1 = new ArrayList<>();
        for (int i=0;i<1000;i++)
        {
            numbers1.add("numbers"+i);
        }
       // ListAdapter ListAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, numbers);
        ArrayAdapter<String> ListAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,numbers1);
        final ListView listView= findViewById(R.id.List_view);
        listView.setAdapter(ListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String itemValue=(String)listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Position :"+position+"  ListItem :"+itemValue, Toast.LENGTH_SHORT).show();
                Object toRemove=listView.getAdapter().getItem(position);
                Toast.makeText(getApplicationContext(), "RemoveItem :"+toRemove, Toast.LENGTH_SHORT).show();
                Object adapter= listView.getAdapter();
                Intent intent = new Intent(ListViewActivity.this,ShowNumberMainActivity.class);
                intent.putExtra("currentNumber",itemValue);
                startActivity(intent);
            }
        });
    }
}
