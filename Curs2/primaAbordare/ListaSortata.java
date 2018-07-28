package primaAbordare;

import java.util.Comparator;

public class ListaSortata implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
