package org.example;


import java.sql.*;

public class VartotojasDAO {

    public static final String URL = "jdbc:mysql://localhost:3306/knygu_rezervacija";

    public static void kurti(Vartotojas vartotojas){

        String query = "INSERT INTO vartotojai(`vardas`, `pavarde`, `elPastoAdresas`, `role`, `pseudonimas`, `slaptazodis`) " +        "VALUES(?,?,?,?,?,?)";


        try {
            Connection connection = DriverManager.getConnection(URL, "root", "");

            //kreipiames i susikurta prisijungimą prie DB perduodami auksciau aprasytą užklausą
            PreparedStatement preparedStatement = connection.prepareStatement(query);


            //rekomendacija siekiant išvengti SQL injekcijų - t.y. užklausos užklausoje.
            // Kai įsilaužia - užbaigia programuotojo užklausą
            // select ir noriu to kas užklausoje - jie savo ir tai kas yra užklausoje. taip jis išgauna duomenis)
            preparedStatement.setString(1, vartotojas.getVardas());
            preparedStatement.setString(2, vartotojas.getPavarde());
            preparedStatement.setString(3, vartotojas.getElPastoAdresas());
            preparedStatement.setInt(4, vartotojas.getRole());
            preparedStatement.setString(5, vartotojas.getPseudonimas());
            preparedStatement.setString(6, vartotojas.getSlaptazodis());


            //executeUpdate metodas bus naudojamas kai norėsime sukurti naują įrašą, redaguoti ir trinti esamą įrašą DB-ėje.
            //Įvykdoma užklausa DB-ėje (INSERT, UPDATE, DELETE ir t.t.)

            //nauju irasu kurimui, esamu redagavimui ir senu trynimui
            preparedStatement.executeUpdate();


            System.out.println("Pavyko įterpti naują įrašą į DB.");

            //geroji praktika - atlikus užklausą uždaryti prisijungimus prie DB.
            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {

//            throwables.printStackTrace();

            System.out.println("Įvyko klaida kuriant naują įrašą DB-ėje. Plačiau: " + throwables.getMessage());
        }
    } //čia create metodo galas

}
//        String query = "INSERT INTO `sb_airports`(`biz_name`, `address`, `city`, `asda`, `population`) VALUES ('Kauno oro uostas','Karmėlava','Kaunas','300000');";
//        String query = "INSERT INTO `sb_airports`(`biz_name`, `address`, `city`, `asda`, `population`) VALUES ('"+airport.getBizname()+"','"+airport.getAddress()+"','"+airport.getCity()+"','"+airport.getPopulation()+')";
//        String query = "INSERT INTO `sb_airports`(`biz_name`, `address`, `city`, `population`) " +        "VALUES('"+airport.getBizName()+"', '"+airport.getAddress()+"', '"+airport.getCity()+"', '"+airport.getPopulation()+"')";
//int vartotojoId, String vardas, String pavarde, String elPastoAdresas, int role, String pseudonimas, String slaptazodis