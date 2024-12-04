package org.example

class Singleton private constructor() {

    var data: String = "Default Data"

    companion object {

        private val instance: Singleton by lazy {
            Singleton()
        }
        fun getInst(): Singleton {
            return instance
        }
    }
}