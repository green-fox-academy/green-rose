public class Colors {
    public static void main(String[] args) {
        String[][] colors = new String [3][];
        colors [0] = new String[]{"lime", "forest green", "pale green", "spring green"};
        colors [1] = new String[]{"orange red", "red", "tomato"};
        colors [2] = new String[]{"orchid", "violet", "pink", "hot pink"};
        for (String[] ColorL: colors
             ) {
            for (String Color: ColorL
                 ) {
                System.out.print(Color+", ");
            }
            System.out.println();
        }
    }

}
