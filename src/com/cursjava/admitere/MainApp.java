package com.cursjava.admitere;

import java.sql.*;

/* Clasa principala de unde incepe aplicatia sa se execute*/
public class MainApp {
    static int studentCount = 1;
    public static void main(String[] args) {
        // Deschide prima fereastra - Welcome
        String dbUrl = "jdbc:postgresql:admin";
        String user = "postgres";
        String password = "student";

        try {
            Connection myConn = DriverManager.getConnection(dbUrl, user, password);
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from student");
            while (myRs.next()) {
                studentCount++;
            }
            new WelcomeGUI(myStmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
