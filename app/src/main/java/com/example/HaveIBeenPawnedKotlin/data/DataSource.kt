package com.example.HaveIBeenPawnedKotlin.data

import io.reactivex.Observable

//SECOND STAGE DEFINING THE CONTRACT, DECLARING THE CALLING NAME...

interface DataSource{
    fun getListofBreaches(domainName: String): Observable<List<Breach>>

}