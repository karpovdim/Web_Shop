package by.karpov.shop;

import by.karpov.shop.pool.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Run {
    public static void main(String[] args) throws SQLException {
        final Connection connection = ConnectionManager.getConnection();
        final PreparedStatement preparedStatement = connection.prepareStatement("CREATE DATABASE IF NOT EXISTS name");
        preparedStatement.execute();
        connection.close();
        final Connection connection1 = ConnectionManager.getConnection();
        final PreparedStatement preparedStatement1 = connection1.prepareStatement("CREATE TABLE names(nam varchar(25));");
        preparedStatement1.execute();


    }
}
