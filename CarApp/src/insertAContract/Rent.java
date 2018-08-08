package insertAContract;

import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Rent {

    private GregorianCalendar startDate;
    private GregorianCalendar endtDate;
    private int nrKilometers;
    private String nrMasina;


    public void readReatedList() throws Exception {
        FileWriter fileWriter;
        BufferedReader bufferedReader;
        String text = "";

        try {
            try {

                File myFile = new File("src\\inchirieri.txt");
                bufferedReader = new BufferedReader(new FileReader(myFile));
                String[] splitStrings;
                while ((text = bufferedReader.readLine()) != null) {
                    splitStrings = text.split(", ");

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeARent() {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter("src\\inchirieri.txt", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter=new PrintWriter(bufferedWriter);
            printWriter.write("aici");
        }catch (Exception e)
        {

        }
    }

    public static void main(String[] args) {

        Rent myRent=new Rent();
        myRent.writeARent();
    }


}
