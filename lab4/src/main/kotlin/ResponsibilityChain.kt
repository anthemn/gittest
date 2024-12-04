package org.example

abstract class Logger(private val next: Logger?) {
    abstract fun logMessage(level: Int, message: String)

    protected fun passToNext(level: Int, message: String) {
        next?.logMessage(level, message)
    }
}

object LogLevel {
    const val INFO = 1
    const val DEBUG = 2
    const val ERROR = 3
}

class InfoLogger(next: Logger?) : Logger(next) {
    override fun logMessage(level: Int, message: String) {
        if (level == LogLevel.INFO) {
            println("INFO: $message")
        } else {
            passToNext(level, message)
        }
    }
}

class DebugLogger(next: Logger?) : Logger(next) {
    override fun logMessage(level: Int, message: String) {
        if (level == LogLevel.DEBUG) {
            println("DEBUG: $message")
        } else {
            passToNext(level, message)
        }
    }
}

class ErrorLogger(next: Logger?) : Logger(next) {
    override fun logMessage(level: Int, message: String) {
        if (level == LogLevel.ERROR) {
            println("ERROR: $message")
        } else {
            passToNext(level, message)
        }
    }
}

