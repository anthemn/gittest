package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val image1: Image = ProxyImage("image1.jpg")
    val image2: Image = ProxyImage("image2.jpg")

    image1.display()
    image1.display()

    image2.display()


    val screenDrawAPI: DrawAPI = ScreenDrawAPI()
    val printerDrawAPI: DrawAPI = PrinterDrawAPI()

    val circle = Circle(10, 20, 15, screenDrawAPI)
    val square = Square(30, 40, 20, printerDrawAPI)

    circle.draw()
    square.draw()

    val anotherCircle = Circle(50, 60, 30, printerDrawAPI)
    anotherCircle.draw()


    val usbCharger = USBCharger()
    val charger: Charger = USBToLightningAdapter(usbCharger)
    charger.chargeWithLightning()
}