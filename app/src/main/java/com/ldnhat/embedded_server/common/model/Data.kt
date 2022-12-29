package com.ldnhat.embedded_server.common.model

import com.ldnhat.embedded_server.enums.HumidityMeasure
import com.ldnhat.embedded_server.enums.TemperatureMeasure

data class Data(
    val id : String,
    val temperature: String,
    val humidity: String,
    val position: String,
    val amountOfRain: String,
    val createdAt: String,
    val humidityMeasure: HumidityMeasure,
    val temperatureMeasure: TemperatureMeasure
)