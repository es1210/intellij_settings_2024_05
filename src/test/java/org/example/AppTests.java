package org.example;

import org.junit.jupiter.api.Test;

public class AppTests {
    @Test
    void t1(){
        asserThat(new App().plus(10,20)).isEqualsTo(30);
    }
}
