package org.example

abstract class Shape(protected val drawAPI: DrawAPI) {
    abstract fun draw()
}

class Circle(private val x: Int, private val y: Int, private val radius: Int, drawAPI: DrawAPI) : Shape(drawAPI) {
    override fun draw() {
        drawAPI.drawCircle(x, y, radius)
    }
}

class Square(private val x: Int, private val y: Int, private val side: Int, drawAPI: DrawAPI) : Shape(drawAPI) {
    override fun draw() {
        drawAPI.drawSquare(x, y, side)
    }
}

interface DrawAPI {
    fun drawCircle(x: Int, y: Int, radius: Int)
    fun drawSquare(x: Int, y: Int, side: Int)
}

class ScreenDrawAPI : DrawAPI {
    override fun drawCircle(x: Int, y: Int, radius: Int) {
        println("Drawing Circle on Screen: Center=($x, $y), Radius=$radius")
    }

    override fun drawSquare(x: Int, y: Int, side: Int) {
        println("Drawing Square on Screen: Top-left=($x, $y), Side=$side")
    }
}

class PrinterDrawAPI : DrawAPI {
    override fun drawCircle(x: Int, y: Int, radius: Int) {
        println("Printing Circle: Center=($x, $y), Radius=$radius")
    }

    override fun drawSquare(x: Int, y: Int, side: Int) {
        println("Printing Square: Top-left=($x, $y), Side=$side")
    }
}