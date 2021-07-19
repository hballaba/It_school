package ru.sbrf.shool.h2;

import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.DeleteDbFiles;

import java.sql.*;

public class DataBase {

    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:./src/main/java/ru/sbrf/shool/h2/test";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "sa";



    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DeleteDbFiles.execute("./src/main/java/ru/sbrf/shool/h2/", "test", false);

        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL(DB_CONNECTION);
        ds.setUser("sa");
        ds.setPassword("sa");

        PreparedStatement createSpecies;
        PreparedStatement insertSpecies;
        PreparedStatement selectSpecies;

        PreparedStatement createAnimal;
        PreparedStatement insertAnimal;
        PreparedStatement selectAnimal;


        Class.forName(DB_DRIVER);

        try(Connection connection = DriverManager.getConnection(DB_CONNECTION,DB_USER, DB_PASSWORD)){
            String createSP = "CREATE TABLE species(id int primary key, name varchar(255))";
            String insertSP = "INSERT INTO species" + "(id, name) values" + "(?,?)";
            String selectSP = "SELECT * FROM species WHERE id = ?";
            String selectSPALL = "SELECT * FROM species";
            String selectSPIdName = "SELECT id, name FROM species";

            createSpecies = connection.prepareStatement(createSP);
            createSpecies.executeUpdate();
            createSpecies.close();

            insertSpecies = connection.prepareStatement(insertSP);

            insertSpecies.setInt(1,1);
            insertSpecies.setString(2, "Bob");
            insertSpecies.executeUpdate();
            insertSpecies.setInt(1,2);
            insertSpecies.setString(2, "Bib");
            insertSpecies.executeUpdate();
            insertSpecies.close();

            selectSpecies = connection.prepareStatement(selectSP);
             selectSpecies.setInt (1,1);
             ResultSet rs =  selectSpecies.executeQuery();
             while (rs.next()) {
                System.out.println("Id "+rs.getInt("id")+" Name "+rs.getString("name"));
            }
            selectSpecies.setInt (1,2);
            rs =  selectSpecies.executeQuery();
            while (rs.next()) {
                System.out.println("Id "+rs.getInt("id")+" Name "+rs.getString("name"));
            }
            selectSpecies.close();

            System.out.println();
            selectSpecies = connection.prepareStatement(selectSPALL);


            rs =  selectSpecies.executeQuery();
            while (rs.next()) {
                System.out.println("Id "+rs.getInt("id")+" Name "+rs.getString("name"));
            }
            selectSpecies.close();

            System.out.println();

            selectSpecies = connection.prepareStatement(selectSPIdName);

            rs =  selectSpecies.executeQuery();
            while (rs.next()) {
                Integer id = 0;
                String name = "";
                if (rs.getObject(1) instanceof Integer) {
                    id = (Integer) rs.getObject(1);
                }
                if (rs.getObject(2) instanceof String) {
                    name = (String) rs.getObject(2);
                }
                System.out.println("Id = " + id + " name = " + name);
            }
        }
    }
}




//1. Создайте prepareStatementSELECT * FROM species WHERE id = ?
//2. Установите параметр в 1, выведите результат
//3. Установите параметр в 2, выведите результат


//Сделайте SELECT * из таблиц species и animal, выведите значение всех столбцов и строк в консоль.


//1. Выполните SQL ‘SELECT id, name FROM species’
//2. Используя getObject() извлеките данные из столбцов каждой стороки
//3. Используя instanceof типизируйте
//4. Выведите в консоль