package sortedClases;

import models.Vehicle;

class ExpandSoretedBrand implements Sorted<String> {


    public int compare(String a1, String a2) {
        if (a1.hashCode() == a2.hashCode())
            return 0;
        else if (a1.hashCode() > a2.hashCode())
            return 1;

        return -1;
    }
}

class ExpandSoretedManufacturingYear implements Sorted<Integer> {
    public int compare(Integer a1, Integer a2) {
        return a1.compareTo(a2);
    }
}


