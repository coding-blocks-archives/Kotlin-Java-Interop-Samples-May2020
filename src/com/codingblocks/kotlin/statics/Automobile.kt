package com.codingblocks.kotlin.statics

class Automobile private constructor(
    val name: String,
    val wheels: Int,
    val seats: Int,
    val fuelCapacity: Float
) {
    override fun toString(): String {
        return "Automobile(name='$name', wheels=$wheels, seats=$seats, fuelCapacity=$fuelCapacity)"
    }

    companion object {
        @JvmStatic
        fun createFor(pax: Int, dist: Float): Automobile {
            return if (pax < 4) {
                if (dist < 40) Automobile("Auto", 3, 3, 12.5f)
                else Automobile("Car", 4, 4, 45.5f)
            } else {
                if (dist < 500) Automobile("Tempo", 4, 20, 100.0f)
                else Automobile("Volvo", 8, 54, 600.0f)
            }

        }
    }

}