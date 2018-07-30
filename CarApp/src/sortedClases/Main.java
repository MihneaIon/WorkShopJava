package sortedClases;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;


public class Main
{

    public static void main(String[] args) {

        List<String> myList=new ArrayList<>();
        myList.add("adaca");
        myList.add("adfra");
        myList.add("aa");

        List<Integer> myIntegerList=new ArrayList<>();
        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(3);
        myIntegerList.add(4);


        Collections.sort(myList,new ExpandSoretedBrand());
        for (String aux: myList)
        {
            System.out.println(aux);
        }

        Collections.sort(myIntegerList,new ExpandSoretedManufacturingYear());
        for (Integer aux: myIntegerList)
        {
            System.out.println(aux);
        }


    }

    }
