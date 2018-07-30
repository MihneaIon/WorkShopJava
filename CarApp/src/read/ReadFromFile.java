package read;

import models.Person;
import models.Type;
import models.Vehicle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadFromFile {

    public static List<Vehicle> readVehicles() throws Exception {
        List<Vehicle> myVehicleList = new ArrayList<>();
        File myFile = new File("src\\vehicles.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));
        String st;
        String[] splitStrings;
        int i = 0;
        while ((st = bufferedReader.readLine()) != null) {
            splitStrings = st.split(",");
            Type myType = Type.valueOf(splitStrings[1].trim());
            Vehicle auxVehicle = new Vehicle(splitStrings[0].trim(),
                    myType, splitStrings[2].trim(), Integer.parseInt(splitStrings[3].trim()), splitStrings[4].trim());
            myVehicleList.add(auxVehicle);
        }
        return myVehicleList;
    }

    public static List<Person> readPerson() throws Exception {
        List<Person> myPersonList = new ArrayList<>();
        File myFile = new File("src\\persoane.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));
        String st;
        String[] splitStrings;
        int i = 0;
        while ((st = bufferedReader.readLine()) != null) {
            splitStrings = st.split(",");
            String prelucrezCNP = splitStrings[0].substring(0, 7);
            Date date = new Date();
            Date driverLicence = new Date();
            String inDate = "";
            SimpleDateFormat myYear = new SimpleDateFormat("yyyy");
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            if (prelucrezCNP.charAt(0) == '1' || prelucrezCNP.charAt(0) == '2') {
                inDate = prelucrezCNP.substring(5, 7) + "-" + prelucrezCNP.substring(3, 5) + "-" + "19" + prelucrezCNP.substring(1, 3);
            } else if (prelucrezCNP.charAt(0) == '5' || prelucrezCNP.charAt(0) == '6') {
                inDate = prelucrezCNP.substring(5, 7) + "-" + prelucrezCNP.substring(3, 5) + "-" + "20" + prelucrezCNP.substring(1, 3);
            }
            try {
                System.out.println(inDate);
                date = formatter.parse(inDate);
                System.out.println(formatter.format(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                driverLicence = myYear.parse(splitStrings[4]);
                System.out.println(myYear.format(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Person myPerson = new Person(splitStrings[0].trim(), splitStrings[1].trim(), splitStrings[2].trim(), splitStrings[3].trim(), date, driverLicence);
        }
        return myPersonList;
    }
}
