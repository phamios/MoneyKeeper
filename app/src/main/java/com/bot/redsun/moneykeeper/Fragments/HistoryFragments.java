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

public class HistoryFragments extends Fragment  {

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

        View rootView = inflater.inflate(R.layout.fragment_history, container, false);




        return rootView;
    }


}
