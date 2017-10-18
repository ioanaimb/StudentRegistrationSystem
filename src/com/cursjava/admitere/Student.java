package com.cursjava.admitere;

import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    int id;
    String firstName;
    String lastName;
    int years;

    public Student(int id, String firstName, String lastName, int years) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.years = years;
    }

    public void saveStudent(Statement myStmt) {
        String insertDb = "insert into student"
                + "(id,firstname,lastname,year)"
                + "values ("
                + this.id + ", '" + this.firstName + "','" +
                this.lastName + "'," + this.years + ")";
        try {
            myStmt.executeUpdate(insertDb);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
