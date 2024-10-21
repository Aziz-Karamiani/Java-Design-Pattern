package com.pegah.DependencyInversion;

public class PostgreSQLConnection implements DBConnectionInterface{
    @Override
    public int connect() {
        return 1;
    }
}
