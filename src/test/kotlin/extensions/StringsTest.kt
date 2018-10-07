package extensions

import org.junit.Test

import org.junit.Assert.*

class StringsTest {

    @Test
    fun `strings should be able to tell us if they are palindromes`() {
        // simple palindrome
        assertTrue("bob".isPalindrome)
        // not a palindrome
        assertFalse("darren".isPalindrome)
        // edge case, let's say the empty string is a palindrome
        assertTrue("".isPalindrome)
        // but null is not
        assertFalse(null.isPalindrome)
        // ignore case
        assertTrue("Bob".isPalindrome)
    }
}

private val String?.isPalindrome: Boolean get() {
    if (this == null) return false
    return this.reversed().equals(this, true)
}