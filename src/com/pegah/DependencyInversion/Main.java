package com.pegah.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dependency Inversion...");

        MySqlConnection mySqlConnection = new MySqlConnection();
        PostgreSQLConnection postgreSQLConnection = new PostgreSQLConnection();

        PasswordReminder passwordReminder = new PasswordReminder(mySqlConnection);
//        PasswordReminder passwordReminder = new PasswordReminder(postgreSQLConnection);
    }
}
