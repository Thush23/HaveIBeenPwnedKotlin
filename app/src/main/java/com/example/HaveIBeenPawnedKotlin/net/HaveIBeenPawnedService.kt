package com.example.HaveIBeenPawnedKotlin.net

import com.example.HaveIBeenPawnedKotlin.data.Breach
import com.example.HaveIBeenPawnedKotlin.ENDPOINT
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

//THIRD STAGE, IMPLEMENTING THE SERVICE CALL FOR SITENAME, OBSERVABLE CALL IS BEING MADE TO BREACH CLASS
interface HaveIBeenPawnedService{
    @GET(ENDPOINT)
    fun getListofBreaches (@Query("siteName")siteName: String): Observable<List<Breach>>
}