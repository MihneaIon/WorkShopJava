package read;

import models.Type;
import models.Vehicle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {


    public static List<Vehicle> read() throws Exception {
        List<Vehicle> myVehicleList = new ArrayList<>();
        File myFile = new File("D:\\JavaFolder\\CursPractica-Joi\\src\\text1.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));
        String st;
        String[] splitStrings;
        int i = 0;
        while ((st = bufferedReader.readLine()) != null) {
            splitStrings = st.split(" ");
            Type myType=Type.valueOf(splitStrings[4]);
            Vehicle auxVehicle = new Vehicle(Integer.parseInt(splitStrings[0]),
                    Integer.parseInt(splitStrings[1]), splitStrings[2], splitStrings[3],myType);
            myVehicleList.add(auxVehicle);
        }
        return myVehicleList;
    }
}
