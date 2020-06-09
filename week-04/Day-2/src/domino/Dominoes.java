package domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
        Collections.sort(dominoes);
        System.out.println(dominoes);
        List<Domino> sortedDomino = new ArrayList<>();
        boolean answer = sortDomino(sortedDomino,dominoes);

        System.out.println("Chain?: "+ answer);
        System.out.println(sortedDomino);

    }

    public static boolean sortDomino(List<Domino> sortedDomino, List<Domino> dominoes) {
      
        for (int i = 0; i < dominoes.size(); i++) {
            Domino domino = dominoes.get(i);

                if (sortedDomino.isEmpty() ||
                        domino.getLeftSide() == sortedDomino.get(sortedDomino.size()-1).getRightSide()) {
                    sortedDomino.add(domino);
                    dominoes.remove(domino);
                    if (!sortDomino(sortedDomino, dominoes)) {
                        dominoes.add(i,domino);
                        sortedDomino.remove(domino);
                    }

                }
            // ToDo: add swap logic!


        }
        return (dominoes.size()==0);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(3, 1));
        return dominoes;
    }
}