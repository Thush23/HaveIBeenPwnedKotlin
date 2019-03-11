package com.example.HaveIBeenPawnedKotlin.home

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.HaveIBeenPawnedKotlin.data.Breach
import com.example.HaveIBeenPawnedKotlin.data.RemoteDataSource
import com.example.HaveIBeenPawnedKotlin.repo.PwnedRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class HomeViewModel: ViewModel(){
    private val repository = PwnedRepository(RemoteDataSource())

    private val breachesObservable = MutableLiveData<List<Breach>>()

    private val compositeDisposable = CompositeDisposable()

    fun getBreachesObservable() = breachesObservable

    fun getData(domainName: String){
        if(domainName.isEmpty()) throw IllegalStateException("Please specify a valid domain")

       compositeDisposable.add(repository.getListofBreaches(domainName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({breachesObservable.value = it}, {throwable -> throwable.printStackTrace()}))

    }
}