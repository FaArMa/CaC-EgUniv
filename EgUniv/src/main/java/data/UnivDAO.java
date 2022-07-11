package data;

import static data.CxnDB.getCxn;
import static data.CxnDB.close;
import entity.Stu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UnivDAO {
    private static final String SQL_CREATE = "INSERT INTO stu(name, surname, sex, nationality, dni, birth) VALUES (?, ?, ?, ?, ?, ?)",
    SQL_READ = "SELECT * FROM stu",
    SQL_UPDATE = "UPDATE stu SET name = ?, surname = ?, sex = ?, nationality = ?, dni = ?, birth = ? WHERE (id = ?)",
    SQL_DELETE = "DELETE FROM stu WHERE id = ?";
    
    public List<Stu> read() {
        Connection cxn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Stu S;
        List<Stu> SS = new ArrayList();
        try {
            cxn = getCxn();
            stmt = cxn.prepareStatement(SQL_READ);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2), surname = rs.getString(3);
                char sex = rs.getString(4).charAt(0);
                String nationality = rs.getString(5);
                int dni = rs.getInt(6);
                String birth = rs.getString(7);
                S = new Stu(id, name, surname, sex, nationality, dni, birth);
                SS.add(S);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(cxn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return SS;
    }

    public int create(Stu S) {
        Connection cxn = null;
        PreparedStatement stmt = null;
        int rec = 0;
        try {
            cxn = getCxn();
            stmt = cxn.prepareStatement(SQL_CREATE);
            stmt.setInt(1, S.getId());
            stmt.setString(2, S.getName());
            stmt.setString(3, S.getSurname());
            stmt.setString(4, String.valueOf(S.getSex()));
            stmt.setString(5, S.getNationality());
            stmt.setInt(6, S.getDni());
            stmt.setString(7, S.getBirth());
            rec = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(cxn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return rec;
    }

    public int update(Stu S){
        Connection cxn = null;
        PreparedStatement stmt = null;
        int rec = 0;
        try {
            cxn = getCxn();
            stmt = cxn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, S.getName());
            stmt.setString(2, S.getSurname());
            stmt.setString(3, String.valueOf(S.getSex()));
            stmt.setString(4, S.getNationality());
            stmt.setInt(5, S.getDni());
            stmt.setString(6, S.getBirth());
            stmt.setInt(7, S.getId());
            rec = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                close(stmt);
                close(cxn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return rec;
    }

     public int delete(Stu S){
        Connection cxn = null;
        PreparedStatement stmt = null;
        int rec = 0;
        try {
            cxn = getCxn();
            stmt = cxn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, S.getId());
            rec = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                close(stmt);
                close(cxn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return rec;
    }
}
