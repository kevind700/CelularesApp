package com.example.kevinariza.celularesapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Report extends AppCompatActivity {
    private ListView listView;
    private Resources resources;
    private String option[];
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        listView = (ListView)findViewById(R.id.OptionReports);
        resources = this.getResources();
        option = resources.getStringArray(R.array.option);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,option);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        intent = new Intent(Report.this,ListCellphone.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
