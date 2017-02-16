package com.bot.redsun.moneykeeper.Utils;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.sonpham.mymoney.Constants;

/**
 * Created by sonpham on 5/15/16.
 */
public class TransactionDbAdapter {

    public static final String KEY_ID = "id";
    public static final String KEY_TYPE = "transtype";
    public static final String KEY_AMOUNT = "amount";
    public static final String KEY_CREATEDATE = "createdate";
    public static final String KEY_DES = "description";
    public static final String KEY_STATUS = "status";

    private static final String TAG = "CountriesDbAdapter";
    private DatabaseHelper mDbHelper;
    private SQLiteDatabase mDb;

    private static final String DATABASE_NAME = "myMoney";
    private static final String SQLITE_TABLE = "tblTransaction";
    private static final int DATABASE_VERSION = 1;

    private final Context mCtx;

    private static final String DATABASE_CREATE =
            "CREATE TABLE if not exists " + SQLITE_TABLE + " (" +
                    KEY_ID + " integer PRIMARY KEY autoincrement," +
                    KEY_TYPE + "," +
                    KEY_AMOUNT + "," +
                    KEY_CREATEDATE + "," +
                    KEY_DES + "," +
                    KEY_STATUS + "," +
                    " UNIQUE (" + KEY_ID +"));";

    private static class DatabaseHelper extends SQLiteOpenHelper {

        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.w(TAG, DATABASE_CREATE);
            db.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + SQLITE_TABLE);
            onCreate(db);
        }
    }

    public TransactionDbAdapter(Context ctx) {
        this.mCtx = ctx;
    }

    public TransactionDbAdapter open() throws SQLException {
        mDbHelper = new DatabaseHelper(mCtx);
        mDb = mDbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        if (mDbHelper != null) {
            mDbHelper.close();
        }
    }


    public boolean deleteAllTransaction() {

        int doneDelete = 0;
        doneDelete = mDb.delete(SQLITE_TABLE, null , null);
        Log.w(TAG, Integer.toString(doneDelete));
        return doneDelete > 0;

    }

    public float getTotal(){
        Cursor mCount= mDb.rawQuery(Constants.DB.QUERY.GET_TOTAL_QUERY, null);
        mCount.moveToFirst();
        float count= mCount.getFloat(0);
        return count;
    }

    public float getLost(){
        Cursor mCount= mDb.rawQuery(Constants.DB.QUERY.GET_TOTAL_LOST, null);
        mCount.moveToFirst();
        float count= mCount.getFloat(0);
        return count;
    }

    public float getProfit(float a, float b){
        return a-b;
    }


    public Cursor fetchAllTransaction() {

        Cursor cursor = mDb.rawQuery(Constants.DB.QUERY.GET_ALL_TRANSACTION, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        return cursor;
    }

    public Cursor getDetails(int id){
        Cursor cursor = mDb.rawQuery(Constants.DB.QUERY.GET_DETAILS_TRANSACTION,null);
        if(cursor != null){
            cursor.moveToFirst();
        }
        return cursor;
    }



}
