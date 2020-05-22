public class SubStr {

    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:

        //  should print: `17`
        System.out.println(subStr("this is what I'm searching in", "searching"));

        //  should print: `-1`
        System.out.println(subStr("this is what I'm searching in", "not"));
    }

    public static int subStr(String input, String q) {

        //return input.indexOf(q);:-)
        int lengthOfInput = input.length();
        int lengthOfQ = q.length();
        for (int i = 0; i < lengthOfInput-lengthOfQ; i++) {
            if (input.substring(i, i+lengthOfQ).compareTo(q)==0) return i;
        }
        return -1;
    }

    }
