package com.bot.redsun.moneykeeper.Utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bot.redsun.moneykeeper.ObjectModel.TransactionModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by sonpham on 5/15/16.
 */
public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "myMoney";

    private static final String TABLE_TRANSACTION = "tblTransaction";

    public static final String KEY_ID = "id";
    public static final String KEY_TYPE = "transtype";
    public static final String KEY_AMOUNT = "amount";
    public static final String KEY_CREATEDATE = "createdate";
    public static final String KEY_DES = "description";
    public static final String KEY_STATUS = "status";
    public static final String KEY_CATEGORY = "category";
    public static final String KEY_USER = "userid";

    private SQLiteDatabase mDb;


    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_TRANSACTION + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_TYPE + " INT,"
                + KEY_AMOUNT + " INT," + KEY_CREATEDATE + " TEXT," + KEY_DES + " TEXT," + KEY_STATUS + " int" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TRANSACTION);
        onCreate(db);
    }


    public void addShop(TransactionModel trans) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current time => " + c.getTime());

        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(c.getTime());

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_TYPE, trans.getType());
        values.put(KEY_AMOUNT, trans.getAmount());
        values.put(KEY_CREATEDATE, trans.getCreatedate());
        values.put(KEY_DES, trans.getDescription());
        values.put(KEY_STATUS, trans.getStatus());
        values.put(KEY_CATEGORY,trans.getCategory());
        values.put(KEY_USER,trans.getUserid());
        db.insert(TABLE_TRANSACTION, null, values);

        db.close();
    }

    public Cursor fetchAllTransaction() {

        Cursor mCursor = mDb.query(TABLE_TRANSACTION, new String[] {KEY_ID,
                        KEY_TYPE, KEY_AMOUNT, KEY_CREATEDATE, KEY_STATUS},
                null, null, null, null, null);

        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }


}
