package org.example

interface Message {
    fun getContent(): String
}

class TextMessage(private val text: String) : Message {
    override fun getContent(): String {
        return "Text Message: $text"
    }
}

class ImageMessage(private val url: String) : Message {
    override fun getContent(): String {
        return "Image Message: $url"
    }
}

abstract class MessageFactory {
    abstract fun createMessage(): Message
}

class TextMessageFactory(private val text: String) : MessageFactory() {
    override fun createMessage(): Message {
        return TextMessage(text)
    }
}

class ImageMessageFactory(private val url: String) : MessageFactory() {
    override fun createMessage(): Message {
        return ImageMessage(url)
    }
}