package dao; import java.sql.*; import util.db;
public class UserDAO { public boolean login(String u,String p){try{PreparedStatement ps=db.getConnection().prepareStatement("SELECT * FROM users WHERE username=? AND password=?");ps.setString(1,u);ps.setString(2,p);return ps.executeQuery().next();}catch(Exception e){return false;}} }
