package com.example.a080319.repo

import com.example.a080319.data.Breach
import com.example.a080319.data.DataSource
import com.example.a080319.data.RemoteDataSource
import io.reactivex.Observable

class PwnedRepository(private val remoteDataSource: DataSource): DataSource{
    override fun getListofBreaches(domainName: String): Observable<List<Breach>> {
        return remoteDataSource.getListofBreaches(domainName)
    }

}