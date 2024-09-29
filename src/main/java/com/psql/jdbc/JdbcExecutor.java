package com.psql.jdbc;

import com.psql.jdbc.dao.CustomerDao;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcExecutor {

    public static void main(String[] args) {

        DatabaseConnection dbc = new DatabaseConnection("localhost", "hplussport", "postgres", "Sunny@123");

        try {

            Connection connection = dbc.getConnection();

            CustomerDao customerDao = new CustomerDao(connection);

//            Customer c1 = new Customer();
//            c1.setFirstName("mukhtesh");
//            c1.setLastName("pendem");
//            c1.setEmail("mukhteshpendem31@gmail.com");
//            c1.setCity("nallajerla");
//            c1.setId(1);
//            c1.setAddress("opposite jio office");
//            c1.setPhone("6304894373");
//            c1.setZipCode("534112");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
