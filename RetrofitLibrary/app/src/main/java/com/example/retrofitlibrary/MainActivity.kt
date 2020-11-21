package com.example.retrofitlibrary

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        featchData()
    }


    fun featchData(){

        val url="https://jsonplaceholder.typicode.com/"
        val retrofit= Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val Api:ApiInterface=retrofit.create(ApiInterface::class.java)
        val call=Api.getdata()
        var item=call.enqueue(object:Callback<ArrayList<data>> {
            override fun onFailure(call: Call<ArrayList<data>>, t: Throwable) {
             text1.text="لم يتم الاتصال"
            }

            override fun onResponse(
                call: Call<ArrayList<data>>,
                response: Response<ArrayList<data>>
            ) {
                text1.text="تم اللاتصال بالسيرفر"
            }

        }


        )


    }
}


