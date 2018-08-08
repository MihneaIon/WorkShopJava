package conection;

import java.sql.*;

public class ConectionToMySQL {


    public static void main(String[] args) {

        try (Connection connection1 = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=InchirieriMasini;integratedSecurity=true");) { // try with resources

            // select

//            Statement query = connection1.createStatement();
//            query.executeQuery("select * from Champ ");
//
//            ResultSet rs = query.executeQuery("select * from Champ ");
//            while (rs.next()) {
//                System.out.println(rs.getString(3));
//            }


            // insert

            Statement query = connection1.createStatement();
//            int raw = query.executeUpdate("insert into Champ(Nume) values('Sefa')");
//            System.out.println("....." + raw);
//            System.out.println("");


            ResultSet rs = query.executeQuery("select * from Persoane ");
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }


        } catch (SQLException e) {
            e.printStackTrace();

        }


    }
}

