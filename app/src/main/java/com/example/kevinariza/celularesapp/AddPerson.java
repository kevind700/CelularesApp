package com.example.kevinariza.celularesapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AddPerson extends AppCompatActivity {
    private EditText price;
    private Spinner trademarks, oss, colors, capacities;
    private Resources resources;
    private String trademark[], os[], color[], capacity[];
    private ArrayAdapter<String> trademarkOpt, osOpt, colorOpt, capacityOpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);

        trademarks = (Spinner)findViewById(R.id.cmbTrademarks);
        oss = (Spinner)findViewById(R.id.cmbSystems);
        colors = (Spinner)findViewById(R.id.cmbColors);
        capacities = (Spinner)findViewById(R.id.cmbCapacities);
        price = (EditText)findViewById(R.id.txtPrice);
        resources = this.getResources();

        trademark = getResources().getStringArray(R.array.trademarks);
        os = getResources().getStringArray(R.array.systems);
        color = getResources().getStringArray(R.array.colors);
        capacity = getResources().getStringArray(R.array.capacities);

        trademarkOpt = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, trademark);
        osOpt = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, os);
        colorOpt = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, color);
        capacityOpt = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, capacity);

        trademarks.setAdapter(trademarkOpt);
        oss.setAdapter(osOpt);
        colors.setAdapter(colorOpt);
        capacities.setAdapter(capacityOpt);
    }

    public void guardar(View view){
        String mark, os, color;
        int capacity;
        double price2;
        if (validate()) {
            mark = trademarks.getSelectedItem().toString();
            os = oss.getSelectedItem().toString();
            color = colors.getSelectedItem().toString();
            capacity = Integer.parseInt(capacities.getSelectedItem().toString());
            price2 = Double.parseDouble(price.getText().toString());

            Cellphone c = new Cellphone(mark, capacity, color, os, price2);
            c.guardar();
            Toast.makeText(this, resources.getString(R.string.message_successful), Toast.LENGTH_SHORT).show();
        }
    }

    public boolean validate(){
        if (Integer.parseInt(price.getText().toString()) == 0){
            price.setError(resources.getString(R.string.message_error_not0));
            return false;
        }
        clearCamp();
        return true;
    }

    public void clear(View v){
        price.setText("");
        trademarks.setSelection(0);
        oss.setSelection(0);
        colors.setSelection(0);
        capacities.setSelection(0);
    }

    public void clearCamp(){
        price.setText("");
        trademarks.setSelection(0);
        oss.setSelection(0);
        colors.setSelection(0);
        capacities.setSelection(0);
    }
}
