package org.example

data class Car(
    val brand: String,
    val engine: String,
    val color: String,
    val seats: Int
)

class CarBuilder {
    private var brand: String = "Default Brand"
    private var engine: String = "Default Engine"
    private var color: String = "Default Color"
    private var seats: Int = 4

    fun setBrand(brand: String): CarBuilder {
        this.brand = brand
        return this
    }

    fun setEngine(engine: String): CarBuilder {
        this.engine = engine
        return this
    }

    fun setColor(color: String): CarBuilder {
        this.color = color
        return this
    }

    fun setSeats(seats: Int): CarBuilder {
        this.seats = seats
        return this
    }

    fun build(): Car {
        return Car(brand, engine, color, seats)
    }
}