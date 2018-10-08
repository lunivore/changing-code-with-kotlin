package com.lunivore.examples.dataclasses

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

data class SimpleThing(val id: String, val name: String)

class DataClassesTest {
    @Test fun `should demonstrate data classes`() {
        // Normal constructor
        val exampleA = SimpleThing("123", "aName")

        // Named params (out of order)


//        assertThat(exampleA, equalTo(exampleB).not())

        // Copy method - exampleC


//        assertThat(exampleC, equalTo(exampleA))

        assertThat(exampleA.toString(), equalTo("SimpleThing(id=123, name=aName)"))
    }
}