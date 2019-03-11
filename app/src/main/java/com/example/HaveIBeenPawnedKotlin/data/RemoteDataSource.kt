package com.example.HaveIBeenPawnedKotlin.data

import com.example.HaveIBeenPawnedKotlin.BASE_URL
import com.example.HaveIBeenPawnedKotlin.net.HaveIBeenPawnedService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

//IMPLEMENTING THE DATASOURCE INTERFACE TO GET THE RESULT..WORKING BY LAZY(NEED TO LOOK INTO IT)

class RemoteDataSource : DataSource {

    private val haveIBeenPawnedService: HaveIBeenPawnedService by lazy {
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()
        retrofit.create(HaveIBeenPawnedService::class.java)
    }

    override fun getListofBreaches(domainName: String)
            = haveIBeenPawnedService.getListofBreaches(domainName)
    }

