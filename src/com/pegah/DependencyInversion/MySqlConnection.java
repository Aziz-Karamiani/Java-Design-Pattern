package com.pegah.DependencyInversion;

class MySqlConnection implements DBConnectionInterface {
    public int connect() {
        return 1;
    }
}
