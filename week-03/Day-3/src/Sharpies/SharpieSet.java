package Sharpies;

import Sharpies.Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    public List<Sharpie> listSharpie = new ArrayList<Sharpie>();

    public int countUsable(){
        int i = 0;
        for (Sharpie sharpie: listSharpie) {
            if (sharpie.inkAmount>0) i++;
        }
        return i;
    }

    public void removeTrash(){
        for (Sharpie sharpie: listSharpie) {
            if (sharpie.inkAmount>0) listSharpie.remove(sharpie);
        }
    }
}