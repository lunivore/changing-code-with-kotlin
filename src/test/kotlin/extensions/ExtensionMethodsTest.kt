package extensions

import org.junit.Test

import org.junit.Assert.*

class ExtensionMethodsTest {

    @Test
    fun `strings should be able to tell us if they are palindromes`() {

        assertTrue("xyx".isPalindrome())


        // simple palindrome
        assertTrue("bob".isPalindrome())
        // not a palindrome, switch to property style
        assertFalse("bolton".palindromic)
        // edge case, let's say the empty string is a palindrome
        assertTrue("".palindromic)
        // but null is not
        assertFalse(null.palindromic)
        // ignore case
//        assertTrue("Bob".palindromic)
    }
}

private val String?.palindromic: Boolean
    get() { return isPalindrome()}

private fun String?.isPalindrome(): Boolean {
    if (this == null) return false
    else return this == this.reversed()
}