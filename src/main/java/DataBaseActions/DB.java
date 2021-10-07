package DataBaseActions;

import java.sql.*;

public class DB extends GenerateData {

    public static String name = null;
    public static String LastName = null;
    public static String Email = null;
    public static String Phone = null;
    public static String Password = null;
    public static String Address = null;
    public static String City = null;
    public static String Zip = null;

    String insert = "insert into users (firstName, lastName, phone, password,address,email,country,state,city,zip)"
            + " values ( ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

    String url = "jdbc:sqlserver://localhost:1433;databaseName=users";
    String user = "user1";
    String password1 = "admin";


    public DB getConnection() {

        try {
            Connection conn = DriverManager.getConnection(url, user, password1);

            Statement stmt = conn.createStatement();



        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return this;
    }







    public DB insertData(){

        try {
        Connection conn = DriverManager.getConnection(url, user, password1);

        PreparedStatement pstmt = conn.prepareStatement(insert,
                Statement.RETURN_GENERATED_KEYS);


        pstmt.setString(1, GenerateData.firstName);
        pstmt.setString(2, GenerateData.lastName);
        pstmt.setString(3, GenerateData.number);
        pstmt.setString(4, GenerateData.password);
        pstmt.setString(5, GenerateData.address);
        pstmt.setString(6, GenerateData.email);
        pstmt.setString(7, GenerateData.country);
        pstmt.setString(8, GenerateData.state);
        pstmt.setString(9, GenerateData.city);
        pstmt.setString(10, GenerateData.shortZip);
        pstmt.executeUpdate();


    }catch(SQLException ex) {
        System.out.println(ex.getMessage());
    }

    return this;

}




    public DB getData(){

        try {
            Connection conn = DriverManager.getConnection(url, user, password1);

            String select = "SELECT * FROM users";

            Statement stmt1= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = stmt1.executeQuery(select);

            rs.last();


            name = rs.getString("firstName");
            LastName = rs.getString("lastName");
            Email = rs.getString("email");
            Phone = rs.getString("phone");
            Password = rs.getString("password");
            Address = rs.getString("address");
            City = rs.getString("city");
            Zip = rs.getString("zip");


        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return this;
    }
}





