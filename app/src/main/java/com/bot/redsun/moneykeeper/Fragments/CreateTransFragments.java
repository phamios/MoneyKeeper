package com.bot.redsun.moneykeeper.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.bot.redsun.moneykeeper.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by redsu on 08/02/2017.
 */

public class CreateTransFragments extends Fragment implements AdapterView.OnItemSelectedListener  {
    Button bttSubmit;
    EditText txtAmount;
    EditText txtDescription;
    Spinner sp;

    int Amount;
    String Description;
    String type;
    int intType;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_createtrans, container, false);
        sp = (Spinner)rootView.findViewById(R.id.moneyType);
        sp.setOnItemSelectedListener(this);
        List<String> categories = new ArrayList<String>();
        categories.add(getString(R.string.selecttype1));
        categories.add(getString(R.string.selecttype2));

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(dataAdapter);


        // Creating adapter for spinner
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1, int pos, long text) {
                type = sp.getSelectedItem().toString();
                intType = pos;
            }
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

        // Get value from Template
        txtAmount = (EditText)rootView.findViewById(R.id.txtAmount);
        txtDescription = (EditText)rootView.findViewById(R.id.txtDescription);


        bttSubmit = (Button) rootView.findViewById(R.id.bttSubmit);
        bttSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return rootView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();

        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}