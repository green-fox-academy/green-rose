package Apples;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple a = new Apple();
    @org.junit.jupiter.api.Test
    void sayApple() {
        //Apple a = new Apple();
        assertSame("Apple",a.sayApple());
    }
}