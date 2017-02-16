package com.bot.redsun.moneykeeper.Interface;

/**
 * Created by sonpx on 2/16/17.
 */
import com.bot.redsun.moneykeeper.ObjectModel.TransactionModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TransactionServices {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<List<TransactionModel>> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<List<TransactionModel>> getAnswers(@Query("tagged") String tags);

}
