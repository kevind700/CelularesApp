package com.example.kevinariza.celularesapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ListCellphone extends AppCompatActivity {
    private TableLayout table;
    private ArrayList<Cellphone> cellphones;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cellphone);
        table = (TableLayout)findViewById(R.id.Table);
        cellphones = Data.obtener();
        resources = this.getResources();
        Bundle b = getIntent().getExtras();
        String option = b.getString("optionMenu");

        for (int i = 0; i < cellphones.size() ; i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            if (option.equals("0")){
                c1.setText(""+cellphones.get(i).getTrademark());
                c2.setText(""+cellphones.get(i).getCapacity());
                c3.setText(""+cellphones.get(i).getColor());
                c4.setText(""+cellphones.get(i).getOs());
                c5.setText(""+cellphones.get(i).getPrice());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);
                table.addView(fila);
            }else if (option.equals("1")){
                if (cellphones.get(i).getTrademark().equals(resources.getString(R.string.samsung)) && cellphones.get(i).getColor().equals(resources.getString(R.string.black)) && cellphones.get(i).getOs().equals(resources.getString(R.string.android))){
                    c1.setText(""+cellphones.get(i).getTrademark());
                    c2.setText(""+cellphones.get(i).getCapacity());
                    c3.setText(""+cellphones.get(i).getColor());
                    c4.setText(""+cellphones.get(i).getOs());
                    c5.setText(""+cellphones.get(i).getPrice());

                    fila.addView(c1);
                    fila.addView(c2);
                    fila.addView(c3);
                    fila.addView(c4);
                    fila.addView(c5);
                    table.addView(fila);
                }
            }else if (option.equals("2")){
                if (cellphones.get(i).getTrademark().equals(resources.getString(R.string.samsung)) && (cellphones.get(i).getCapacity() >= 2 && cellphones.get(i).getCapacity() <= 4)){
                    c1.setText(""+cellphones.get(i).getTrademark());
                    c2.setText(""+cellphones.get(i).getCapacity());
                    c3.setText(""+cellphones.get(i).getColor());
                    c4.setText(""+cellphones.get(i).getOs());
                    c5.setText(""+cellphones.get(i).getPrice());

                    fila.addView(c1);
                    fila.addView(c2);
                    fila.addView(c3);
                    fila.addView(c4);
                    fila.addView(c5);
                    table.addView(fila);
                }
            }else if (option.equals("3")){
                if (cellphones.get(i).getTrademark().equals(resources.getString(R.string.apple)) && cellphones.get(i).getColor().equals(resources.getString(R.string.black))){
                    c1.setText(""+cellphones.get(i).getTrademark());
                    c2.setText(""+cellphones.get(i).getCapacity());
                    c3.setText(""+cellphones.get(i).getColor());
                    c4.setText(""+cellphones.get(i).getOs());
                    c5.setText(""+cellphones.get(i).getPrice());

                    fila.addView(c1);
                    fila.addView(c2);
                    fila.addView(c3);
                    fila.addView(c4);
                    fila.addView(c5);
                    table.addView(fila);
                }
            }
        }
    }
}
