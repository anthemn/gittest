package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val singleton1 = Singleton.getInst()
    singleton1.data = "Data"
    println(singleton1.data)

    val singleton2 = Singleton.getInst()
    println(singleton2.data)

    singleton2.data = "Updated Data"
    println(singleton1.data)

    val textFactory = TextMessageFactory("Factory Method")
    val textMessage = textFactory.createMessage()
    println(textMessage.getContent())

    val imageFactory = ImageMessageFactory("https://url.com/image.png")
    val imageMessage = imageFactory.createMessage()
    println(imageMessage.getContent())

    println("Elf:")
    val elfFactory = ElfFactory()
    setupGame(elfFactory)

    println("\nOrc:")
    val orcFactory = OrcFactory()
    setupGame(orcFactory)

    val sportsCar = CarBuilder()
        .setBrand("Ferrari")
        .setEngine("V8")
        .setColor("Red")
        .setSeats(2)
        .build()

    val familyCar = CarBuilder()
        .setBrand("Toyota")
        .setEngine("Hybrid")
        .setColor("Blue")
        .setSeats(5)
        .build()

    println("Sports Car: $sportsCar")
    println("Family Car: $familyCar")
}