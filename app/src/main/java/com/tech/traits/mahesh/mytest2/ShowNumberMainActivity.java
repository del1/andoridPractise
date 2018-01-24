package com.tech.traits.mahesh.mytest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ShowNumberMainActivity extends AppCompatActivity {
    TextView txtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        txtNumber= findViewById(R.id.txtNumber);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_number_main);
        Bundle bundle= getIntent().getExtras();
        if(bundle !=null)
        {
            Log.d("bundle", "onCreate: "+bundle.getString("currentNumber"));
           // Toast.makeText(getApplicationContext(), "RemoveItem :"+bundle.getString("currentNumber"), Toast.LENGTH_SHORT).show();
            txtNumber.setText(bundle.getString("currentNumber").toString());
        }

    }
}
