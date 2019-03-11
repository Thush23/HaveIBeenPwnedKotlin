package com.example.a080319.net

import com.example.a080319.data.Breach
import com.example.a080319.data.ENDPOINT
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

//THIRD STAGE, IMPLEMENTING THE SERVICE CALL FOR SITENAME, OBSERVABLE CALL IS BEING MADE TO BREACH CLASS
interface HaveIBeenPawnedService{
    @GET(ENDPOINT)
    fun getListofBreaches (@Path("siteName")siteName: String): Observable<List<Breach>>
}