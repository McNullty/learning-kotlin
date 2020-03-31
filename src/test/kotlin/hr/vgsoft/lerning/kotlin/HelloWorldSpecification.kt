package hr.vgsoft.lerning.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloWorldSpecification {

    // Looking at webpage https://www.baeldung.com/junit-5-kotlin

    @Test fun `Checking simple string constant`() {
        val expectedString = "Hello World!"

        assertEquals(expectedString, "Hello World!")
    }

    @Test fun `Example asserting Exception is thrown`() {
        Assertions.assertThrows(ArithmeticException::class.java) {
            5 / 0
        }
    }
}