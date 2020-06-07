package Sum;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum {

    public static Integer toSum(Integer[] list) {
        Integer answer = 0;
        for (Integer i:list) {
            answer+=i;
        }
        return answer;
    }

}
