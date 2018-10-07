package com.lunivore.examples;

import io.vertx.ext.web.client.HttpRequest;

/**
 * Your mission, should you choose to accept it, is to roll out your own stub / mock version
 * of a VertX HttpRequest.
 *
 * You want to put items into the header, and get items out...
 *
 * ...but you want to respond to all other requests as if to a mock. So all other
 * methods need to delegate to Mockito.
 *
 * After you've done it, try it in Kotlin, but use the "by" keyword, overriding only
 * the header methods.
 */
public class JCookieHttpRequestHelper<T> { // add "implements HttpRequest<T>" here
}
