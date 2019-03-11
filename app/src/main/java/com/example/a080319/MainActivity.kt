package com.example.a080319

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.a080319.data.DataSource
import com.example.a080319.data.RemoteDataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSource: DataSource = RemoteDataSource()
        dataSource.getListofBreaches("Adobe")
    }
}
