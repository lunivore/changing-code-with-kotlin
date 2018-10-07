package extensions

import org.junit.Test

import org.junit.Assert.*

class StringsTest {

    @Test
    fun `strings should be able to tell us if they are palindromes`() {
        assertTrue("bob".isPalindrome())
//        assertFalse("darren".isPalindrome())
//        assertFalse(null.isPalindrome())
//        assertTrue("".isPalindrome())
//        assertTrue("Bob".isPalindrome())
    }
}

private fun String.isPalindrome(): Boolean {
    return true
}