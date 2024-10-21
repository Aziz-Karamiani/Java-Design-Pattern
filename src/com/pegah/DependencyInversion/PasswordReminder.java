package com.pegah.DependencyInversion;

class PasswordReminder {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection)
    {
        this.dbConnection = dbConnection;
    }
}
