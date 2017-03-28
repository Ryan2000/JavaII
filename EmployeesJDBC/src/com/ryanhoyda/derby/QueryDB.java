package com.ryanhoyda.derby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;


public class QueryDB {
	
    private static final String CONNECTION_URL = "jdbc:derby:employees";

    public static void main(String [] args) throws SQLException {
        new QueryDB();
    }

    private Connection connection;

    public QueryDB() throws SQLException {
        Optional<Connection> connectionOptional = connectToDb(CONNECTION_URL);
        if(connectionOptional.isPresent()){
            this.connection = connectionOptional.get();
            queryDb();
            this.connection.close();
        }
    }

    private void queryDb() {
        final String SQL = "select * from JDBC.inventory";
        try {
            ResultSet resultSet = connection.createStatement().executeQuery(SQL);
            while(resultSet.next()){
                int id = resultSet.getInt("INVENTORY_ID");
                String itemName = resultSet.getString("ITEM_NAME");
                double price = resultSet.getDouble("ITEM_PRICE");

                System.out.format("Item Id - %d \t Item Name - %s \t Item Price - %f\n", id, itemName, price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Optional<Connection> connectToDb(String jdbcUrl){
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            return Optional.of(DriverManager.getConnection(jdbcUrl));
        } catch (Exception e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
}