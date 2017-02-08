package com.bot.redsun.moneykeeper.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bot.redsun.moneykeeper.R;

/**
 * Created by redsu on 08/02/2017.
 */

public class CreateTransFragments extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_createtrans, container, false);

        return rootView;
    }

}