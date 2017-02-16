package com.bot.redsun.moneykeeper.Adapter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bot.redsun.moneykeeper.ObjectModel.TransactionModel;

import java.util.ArrayList;

/**
 * Created by redsu on 10/02/2017.
 */

public class HistoryListAdapter extends BaseAdapter {
    private ArrayList<TransactionModel> mTransaction = new ArrayList<>(0);
    private Context mContext;
    boolean connected = false;
    private ProgressDialog progressDialog;
    private Activity currentAct;
    int position;

    public HistoryListAdapter(Context c,Activity activity) {
        mContext = c;
        currentAct = activity;
    }

    public void setData(ArrayList<TransactionModel> data)
    {
        mTransaction = data;
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return mTransaction.size();
    }

    @Override
    public TransactionModel getItem(int mposition) {
        position = mposition;
        return mTransaction.get(position);

    }

    @Override
    public long getItemId(int mposition) {
        position = mposition;
        return position;

    }

    @Override
    public View getView(int mposition, View convertView, ViewGroup parent) {
        position = mposition;
        View rowView = convertView;
        HistoryListAdapter.TransactionHolder allEventHolder = new HistoryListAdapter.TransactionHolder();


        return null;
    }

    class TransactionHolder {

        ImageView banner;
        TextView eName;
        TextView eDate;
        TextView eType;
        ImageView eiconType;
        ImageView efavorite;
        LinearLayout linearLayout;
        LinearLayout linearstatus;
        LinearLayout sbookLabel;
        ImageView eticket;
        ImageView checkedin;
        TextView userStatus;
        RelativeLayout frameevent;
    }

}
