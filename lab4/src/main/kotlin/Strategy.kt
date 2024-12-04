package org.example

interface PaymentStrategy {
    fun pay(amount: Double)
}
class CreditCardPayment(private val cardNumber: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using Credit Card (Number: $cardNumber)")
    }
}

class PayPalPayment(private val email: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using PayPal (Email: $email)")
    }
}

class CryptoPayment(private val walletAddress: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using Crypto (Wallet: $walletAddress)")
    }
}

class ShoppingCart(private var paymentStrategy: PaymentStrategy) {
    fun setPaymentStrategy(strategy: PaymentStrategy) {
        paymentStrategy = strategy
    }
    fun checkout(amount: Double) {
        paymentStrategy.pay(amount)
    }
}