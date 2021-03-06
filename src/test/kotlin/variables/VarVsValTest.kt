package variables

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class VarVsValTest {
    @Test
    fun `should demonstrate the difference between var and val`() {
        val theThing = VarVsVal("Mutable", 10)

//        theThing.immutableValue = 20 // Cannot change a val property

        theThing.mutableValue = "Changed!"

        assertThat(theThing.mutableValue, equalTo("Changed!"))

    }
}