package org.example

interface Charger {
    fun chargeWithLightning()
}

class USBCharger {
    fun chargeWithUSB() {
        println("Charging with USB")
    }
}

class USBToLightningAdapter(private val usbCharger: USBCharger) : Charger {
    override fun chargeWithLightning() {
        usbCharger.chargeWithUSB()
        println("Adapter converting USB to Lightning")
    }
}