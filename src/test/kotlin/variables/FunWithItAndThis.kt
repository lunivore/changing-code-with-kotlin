package com.lunivore.examples.variables

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class FunWithItAndThis {
    @Test
    fun `should see how long we can go without a variable other than it and this`() {
        val pipedInts = with(listOf(1, 2, 3)) {
            this.joinToString ("|")
        }

        assertThat(pipedInts, equalTo("1|2|3"))

        val commaSeparated = listOf("a", "b", "c")
            .map { it.toUpperCase() }
//            .map{ String::toString } // Common pitfall {} instead of ()
            .run { this.sorted().reversed() }
            .run { this.joinToString(",") }

        assertThat(commaSeparated, equalTo("C,B,A"))
    }
}