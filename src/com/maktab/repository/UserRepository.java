package com.maktab.repository;

import com.maktab.domain.User;

import java.sql.*;

public class UserRepository {
    private Connection connection;
    private User user;

    public UserRepository() {
    }

    public UserRepository(Connection connection, User user) {
        this.connection = connection;
        this.user = user;
    }

    public UserRepository(Connection connection) {
        this.connection = connection;
    }

    public void insertInto(User user) throws SQLException {
        String query = "insert into onlineshop.user ( fullname , username , password , email , mobilenum , address) values (? , ? , ? , ? , ? , ? )";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1 , user.getFullName());
        preparedStatement.setString(2 , user.getUserName());
        preparedStatement.setString(3 , user.getPassword());
        preparedStatement.setString(4, user.getEmail());
        preparedStatement.setString(5 , user.getMobileNum());
        preparedStatement.setString(6 , String.valueOf(user.getAddress()));
        preparedStatement.executeUpdate();

    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
