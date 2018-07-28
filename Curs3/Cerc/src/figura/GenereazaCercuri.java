package Figura;

import genereazRandomRaza.GenerezRaza;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GenereazaCercuri {

    private Set<Figura> mySet = new TreeSet<>();

    public Set<Figura> initializare() {

        boolean check = true;

        Double raza = null;
        while (check) {
            raza = GenerezRaza.returnRandom();
            if (raza > 2) {
                Figura figure = new Cerc(raza);
                mySet.add(figure);
            }
            else
            {
                check=false;
            }
        }
        return mySet;
    }

    public void display() {
        Iterator<Figura> itr = mySet.iterator();
        while (itr.hasNext()) {
            Figura myFigure = itr.next();
            System.out.println(myFigure);

        }

    }

    public void figuraUtil() {
        Set<Figura> setFiguri = mySet;
        Iterator<Figura> itr = mySet.iterator();
        while (itr.hasNext()) {
            Figura myFigure = itr.next();
            System.out.println(myFigure.aria());

        }
    }
}
