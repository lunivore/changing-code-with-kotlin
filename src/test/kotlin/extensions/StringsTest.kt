package extensions

import org.junit.Test

import org.junit.Assert.*

class StringsTest {

    @Test
    fun `strings should be able to tell us if they are palindromes`() {
        assertTrue("bob".isPalindrome)
        assertFalse("darren".isPalindrome)
        assertTrue("".isPalindrome)
//        assertFalse(null.isPalindrome())
//        assertTrue("Bob".isPalindrome())
    }
}

private val String.isPalindrome: Boolean get() {
    return this.reversed() == this
}