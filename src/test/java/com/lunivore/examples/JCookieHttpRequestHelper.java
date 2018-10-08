package com.lunivore.examples;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonObject;
import io.vertx.core.streams.ReadStream;
import io.vertx.ext.web.client.HttpRequest;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.codec.BodyCodec;

/**
 * Try this in Kotlin, but use Mockito for the things we're not interested in!
 */
public class JCookieHttpRequestHelper<T> implements HttpRequest<T> {
    private MultiMap headers = MultiMap.caseInsensitiveMultiMap();

    @Override
    public MultiMap headers() {
        return headers;
    }

    @Override
    public HttpRequest<T> putHeader(String name, String value) {
        headers.add(name, value);
        return this;
    }

    @Override
    public HttpRequest<T> method(HttpMethod value) {
        return null;
    }

    @Override
    public HttpRequest<T> port(int value) {
        return null;
    }

    @Override
    public <U> HttpRequest<U> as(BodyCodec<U> responseCodec) {
        return null;
    }

    @Override
    public HttpRequest<T> host(String value) {
        return null;
    }

    @Override
    public HttpRequest<T> virtualHost(String value) {
        return null;
    }

    @Override
    public HttpRequest<T> uri(String value) {
        return null;
    }

    @Override
    public HttpRequest<T> ssl(boolean value) {
        return null;
    }

    @Override
    public HttpRequest<T> timeout(long value) {
        return null;
    }

    @Override
    public HttpRequest<T> addQueryParam(String paramName, String paramValue) {
        return null;
    }

    @Override
    public HttpRequest<T> setQueryParam(String paramName, String paramValue) {
        return null;
    }

    @Override
    public HttpRequest<T> followRedirects(boolean value) {
        return null;
    }

    @Override
    public MultiMap queryParams() {
        return null;
    }

    @Override
    public HttpRequest<T> copy() {
        return null;
    }

    @Override
    public void sendStream(ReadStream<Buffer> body, Handler<AsyncResult<HttpResponse<T>>> handler) {

    }

    @Override
    public void sendBuffer(Buffer body, Handler<AsyncResult<HttpResponse<T>>> handler) {

    }

    @Override
    public void sendJsonObject(JsonObject body, Handler<AsyncResult<HttpResponse<T>>> handler) {

    }

    @Override
    public void sendJson(Object body, Handler<AsyncResult<HttpResponse<T>>> handler) {

    }

    @Override
    public void sendForm(MultiMap body, Handler<AsyncResult<HttpResponse<T>>> handler) {

    }

    @Override
    public void send(Handler<AsyncResult<HttpResponse<T>>> handler) {

    }
}
