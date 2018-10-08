package com.lunivore.examples.typealiasing

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import com.lunivore.examples.tyepaliasing.casuallyGreet
import com.lunivore.examples.tyepaliasing.formallyGreet

class TypealiasTest {
    @Test fun `casual greeting should greet casually`() {
        assertThat(casuallyGreet("Darren"), equalTo("Hello Darren!"))
    }

    @Test fun `formal greeting should greet formally`() {
        assertThat(formallyGreet("Mr", "Darren"), equalTo("Greetings Mr Darren."))
    }
}