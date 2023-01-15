package com.example.denysenkojetpackcompose

import androidx.lifecycle.ViewModel
import com.example.denysenkojetpackcompose.model.Car
import kotlinx.coroutines.flow.MutableStateFlow

class CarData: ViewModel() {
    private val _anime = MutableStateFlow<List<Car>>(emptyList())
    val anime = _anime

    fun getById(id: String): Car {
        return _anime.value.filter { it.id == id }.first()
    }

    init {
        _anime.value = mutableListOf(
            Car(
                "1",
                "M440",
                "BMW",
                R.drawable.m4,
                2005,
                "The M4 Competition xDrive Convertible is equipped with a 3.0-liter BMW M TwinPower Turbo inline 6-cylinder gasoline engine.",
            ),
            Car(
                "2",
                "Civic",
                "Honda",
                R.drawable.civic_type_r,
                2022,
                "With a turbocharged and intercooled 2.0-liter VTEC® engine that delivers 315 horsepower* and 310 pound-feet of torque,* "
            ),
            Car(
                "3",
                "Supra",
                "Toyota",
                R.drawable.m4,
                1999,
                "Used Toyota Supra for Sale on carmax.com. Search used cars, research vehicle models, and compare cars, all online at carmax.com.",
            ),
            Car(
                "4",
                "Mustang",
                "Ford",
                R.drawable.mustang,
                2012,
                "description",
            ),
            Car(
                "1",
                "M440",
                "BMW",
                R.drawable.m4,
                2005,
                "The M4 Competition xDrive Convertible is equipped with a 3.0-liter BMW M TwinPower Turbo inline 6-cylinder gasoline engine.",
            ),
            Car(
                "2",
                "Civic",
                "Honda",
                R.drawable.civic_type_r,
                2022,
                "With a turbocharged and intercooled 2.0-liter VTEC® engine that delivers 315 horsepower* and 310 pound-feet of torque,* "
            ),
            Car(
                "3",
                "Supra",
                "Toyota",
                R.drawable.m4,
                1999,
                "Used Toyota Supra for Sale on carmax.com. Search used cars, research vehicle models, and compare cars, all online at carmax.com.",
            ),
            Car(
                "4",
                "Mustang",
                "Ford",
                R.drawable.mustang,
                2012,
                "description",
            )
        )
    }
}