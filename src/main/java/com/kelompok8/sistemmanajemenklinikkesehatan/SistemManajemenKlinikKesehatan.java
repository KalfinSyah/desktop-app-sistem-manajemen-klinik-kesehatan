package com.kelompok8.sistemmanajemenklinikkesehatan;
import java.sql.Connection;
/**
 *
 * @author kalfi
 */
public class SistemManajemenKlinikKesehatan {

    public static void main(String[] args) {
        Connection connection = DbConn.getConnection();
        new LoginForm(connection);
    }
}
