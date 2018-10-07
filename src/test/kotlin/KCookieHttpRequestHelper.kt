package com.lunivore.examples

import io.vertx.ext.web.client.HttpRequest
import org.mockito.Mockito
import org.mockito.Mockito.mock

/**
 * Your mission, should you choose to accept it, is to roll out your own stub / mock version
 * of a VertX HttpRequest.
 *
 * You want to put items into the header, and get items out...
 *
 * ...but you want to respond to all other requests as if to a mock. So all other
 * methods need to delegate to Mockito.
 *
 * Before you've done this, try it in Java. Then come back here and do it in Kotlin
 * but use the "by" keyword, overriding only the header methods.
 *
 * Hint: You'll need the line commented out, because of generics.
 */
inline fun <reified T: Any> mock() = Mockito.mock(T::class.java)

class KCookieHttpRequestHelper() : HttpRequest<Any> by mock() {


}