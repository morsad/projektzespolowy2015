package projektzespolowy;

import java.sql.*;
import java.util.ArrayList;

public class Slownik {

    public static Object[] getTitles() throws SQLException {
        Statement stmt;
        String host = "jdbc:derby://localhost:1527/Baza";
        String uName = "admin93";
        String uPass = "admin";

        Connection con = DriverManager.getConnection(host, uName, uPass);

        stmt = con.createStatement();

        String query = "select NAZWA_SLOWNIKA from ADMIN93.LISTA_SLOWNIKOW";
        ArrayList<String> suma = new ArrayList<>();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String nazw = rs.getString("NAZWA_SLOWNIKA");
            suma.add(nazw);
        }
        Object[] list = suma.toArray();
        return list;

    }

}
