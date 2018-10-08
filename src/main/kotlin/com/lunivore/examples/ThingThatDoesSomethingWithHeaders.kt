package com.lunivore.examples

import io.vertx.ext.web.client.HttpRequest

class ThingThatDoesSomethingWithHeaders {
    fun manipulate(request: HttpRequest<Any>): HttpRequest<Any> {
        val newRequest = request.timeout(1000)
        val ourCookie = newRequest.headers().get("ItsACookie")
        newRequest.putHeader("ItsACookie", ourCookie.replace("1", "2"))
        return request
    }

}