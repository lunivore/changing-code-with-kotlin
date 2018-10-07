package com.lunivore.examples.variables

import org.junit.Test

class FunWithItAndWith {
    @Test fun `should see how long we can go without a variable other than it and this`() {
        listOf("a", "b", "c")
            .map { it.toUpperCase() }
            .map{String::toString} // Common pitfall




//            .apply { this.sorted().reversed() }
//            .run { joinToString(",")}
    }
}