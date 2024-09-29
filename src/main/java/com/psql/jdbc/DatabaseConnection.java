package com.psql.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;

public class DatabaseConnection {

    private final String url;
    private final Properties properties;
    public DatabaseConnection(String host, String databaseName, String username, String password){

        this.url = "jdbc:postgresql://"+host+"/"+databaseName;
        this.properties  = new Properties();
        this.properties.setProperty("user",username);
        this.properties.setProperty("password",password);



    }
    public Connection getConnection() throws SQLException {

        return DriverManager.getConnection(this.url,this.properties);
    }

}
