package com.example.kevinariza.celularesapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OptionCellphone extends AppCompatActivity {
    private ListView listView;
    private Resources resources;
    private String option[];
    private Intent intent;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_cellphone);
        listView = (ListView)findViewById(R.id.OptionCellphone);
        resources = this.getResources();
        option = resources.getStringArray(R.array.optionReports);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,option);
        b =new Bundle();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        intent = new Intent(OptionCellphone.this,ListCellphone.class);
                        b.putString("optionMenu", String.valueOf(i));
                        intent.putExtras(b);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(OptionCellphone.this,ListCellphone.class);
                        b.putString("optionMenu", String.valueOf(i));
                        intent.putExtras(b);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(OptionCellphone.this,ListCellphone.class);
                        b.putString("optionMenu", String.valueOf(i));
                        intent.putExtras(b);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(OptionCellphone.this,ListCellphone.class);
                        b.putString("optionMenu", String.valueOf(i));
                        intent.putExtras(b);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
