import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Test {
    // settings
    Statement stmt;
    // constructor
    public Test() throws Exception {
        // 1.1 org.mariaDB.jdbc.Driver 불러오기
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/java_pjt";
        String user = "root";
        String password = "1111";
        System.out.println(1);
        // 1.2. connect 객체 만들기
        Connection conn = DriverManager.getConnection(url, user, password);

        System.out.println(2);

        // 1.3. statement 객체 만들기

        stmt= conn.createStatement();
        System.out.println(3);
    }

    // functions
    //// 2. UserTableCreate
    public void UserTableCreate() throws SQLException {
        String sql = "CREATE TABLE USER_TABLE(\n" +
                "\tUSER_ID INT PRIMARY KEY AUTO_INCREMENT,\n" +
                "\tNAME VARCHAR(255) NOT NULL,\n" +
                "\tID VARCHAR(255) NOT NULL,\n" +
                "\tPW VARCHAR(255) NOT NULL,\n" +
                "\tACCESS VARCHAR(255) NOT NULL\n" +
                ");";

        stmt.executeUpdate(sql);
    }
    //// 3. VideoTableCreate
    public void VideoTableCreate() throws SQLException {
        String sql ="CREATE TABLE VIDEO_TABLE(\n" +
                "\tVIDEO_ID INT PRIMARY KEY AUTO_INCREMENT,\n" +
                "\tTITLE VARCHAR(255) NOT NULL,\n" +
                "\tURL VARCHAR(255) NOT NULL\n" +
                "\t)";


        stmt.executeUpdate(sql);
    }
    //// 4. FavoriteTableCreate
    public void FavoriteTableCreate() throws SQLException {
        String sql ="CREATE TABLE FAVORITE_TABLE(\n" +
                "    USER_ID INT,\n" +
                "    VIDEO_ID INT,\n" +
                "    PRIMARY KEY(USER_ID, VIDEO_ID),\n" +
                "    FOREIGN KEY(USER_ID) REFERENCES USER_TABLE(USER_ID),\n" +
                "    FOREIGN KEY(VIDEO_ID) REFERENCES VIDEO_TABLE(VIDEO_ID)\n" +
                ")";

        stmt.executeUpdate(sql);

    }

    public void UserTableInsert(){
        String sql =""
        stmt.executeUpdate(sql);
    }
}
