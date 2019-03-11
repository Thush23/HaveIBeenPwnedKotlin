package com.example.HaveIBeenPawnedKotlin.repo

import com.example.HaveIBeenPawnedKotlin.data.DataSource

class PwnedRepository(private val remoteDataSource: DataSource): DataSource {
    override fun getListofBreaches(domainName: String)=
        remoteDataSource.getListofBreaches(domainName)
    }

