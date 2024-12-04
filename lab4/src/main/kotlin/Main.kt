package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val cart = ShoppingCart(CreditCardPayment("1234-5678-9012-3456"))

    cart.checkout(150.0)

    cart.setPaymentStrategy(PayPalPayment("user@example.com"))
    cart.checkout(200.0)

    cart.setPaymentStrategy(CryptoPayment("0xABCDEF123456"))
    cart.checkout(300.0)


    val loggerChain = InfoLogger(
        DebugLogger(
            ErrorLogger(null)
        )
    )

    loggerChain.logMessage(LogLevel.INFO, "This is an informational message.")
    loggerChain.logMessage(LogLevel.DEBUG, "This is a debug message.")
    loggerChain.logMessage(LogLevel.ERROR, "This is an error message.")
    loggerChain.logMessage(4, "This message will not be handled.")



    val employeeCollection = EmployeeCollection()
    employeeCollection.addEmployee(Employee(1, "Alice", "Developer"))
    employeeCollection.addEmployee(Employee(2, "Bob", "Designer"))
    employeeCollection.addEmployee(Employee(3, "Charlie", "Manager"))

    val iterator = employeeCollection.createIterator()

    while (iterator.hasNext()) {
        val employee = iterator.next()
        println("Employee [ID: ${employee.id}, Name: ${employee.name}, Position: ${employee.position}]")
    }
}