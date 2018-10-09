package bykeyword

import com.lunivore.examples.JCookieHttpRequestHelper
import com.lunivore.examples.ThingThatDoesSomethingWithHeaders
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import io.vertx.core.MultiMap
import io.vertx.ext.web.client.HttpRequest
import org.junit.Test
import org.mockito.Matchers.any
import org.mockito.Mockito
import org.mockito.Mockito.stub

inline fun <reified T: Any> mock() = Mockito.mock(T::class.java)

class ThingThatDoesSomethingWithHeadersTest {

    @Test
    fun `should change the cookie in the header`() {

        // Given a request coming from another service
        val request = JCookieHttpRequestHelper<Any>()

//        val request = mock<HttpRequest<Any>>()
//        stub(request.timeout(1000)).toReturn(request)

        // With a cookie in the header that we want to change
        request.putHeader("ItsACookie", "CookieValue1")

        // When we manipulate the cookie
        val newRequest = ThingThatDoesSomethingWithHeaders().manipulate(request)

        // Then it should be changed accordngly
        val newCookie = newRequest.headers()["ItsACookie"]
        assertThat("CookieValue2", equalTo(newCookie))
    }

}

/**
 * It would be much easier if we could just use a real hashmap for the cookies.
 */
//class KCookieHttpRequestHelper<T>() : HttpRequest<T> {
//
//
//}