package de.sandstormmedia.groovyDevelopmentCli

import org.junit.Test

import static org.junit.Assert.assertEquals

class HelloWorldTest {
    @Test
    public void toString_test() {
        assertEquals "incorrect toString() result", "Hello World!", new HelloWorld().toString()

    }
}
