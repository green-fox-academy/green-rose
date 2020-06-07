package Sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum s = new Sum();

    @Test
    void toSum(){
        Integer[] numbers = new Integer[] { 1, 2, 3 };

        assertSame(6,s.toSum(new Integer[] { 1, 2, 3 }));
    }
}