package com.sophiamoraes.ic_teste

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random


class ForecastRepository {
    private val _weeklyForecast = MutableLiveData<List<DailyForecast>>()
    val weeklyForecast: LiveData<List<DailyForecast>> = _weeklyForecast

    fun loadForecast(bemail: String){
        val RandomValues = List(7) {Random().nextFloat().rem(100)*100}
        val forecastItems = RandomValues.map {temp ->
            DailyForecast(temp,"Partly Cloudy")
        }
        _weeklyForecast.setValue(forecastItems)
    }
}