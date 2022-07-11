package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CxnDB {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/egunivdb?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true", JDBC_USR = "root", JDBC_PWD = "1234";

    public static Connection getCxn() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USR, JDBC_PWD);
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement stmt) throws SQLException {
        stmt.close();
    }

    public static void close(Connection cxn) throws SQLException {
        cxn.close();
    }
}
