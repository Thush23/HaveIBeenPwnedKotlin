package com.example.HaveIBeenPawnedKotlin.data

import com.google.gson.annotations.SerializedName

//FIRST STAGE (DECLARE THE NAME)

data class Breach(@SerializedName("Name")val name: String,
                  @SerializedName("BreachDate") val breachDate: String,
                 @SerializedName ("Description") val description: String)