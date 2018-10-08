package com.lunivore.examples.typealiasing

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import tyepaliasing.Honorific
import tyepaliasing.Person
import tyepaliasing.casuallyGreet
import tyepaliasing.formallyGreet

class TypealiasTest {
    @Test fun `casual greeting should greet casually`() {
        assertThat(casuallyGreet(Person("Darren")), equalTo("Hello Darren!"))
    }

    @Test fun `formal greeting should greet formally`() {
        assertThat(formallyGreet(Person("Darren"), Honorific("Mr")), equalTo("Greetings Mr Darren."))
    }
}