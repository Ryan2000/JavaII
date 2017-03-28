package com.ryanhoyda.derby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CreateDB {
	
    public static void main(String [] args) throws SQLException{
        new CreateDB();
    }
	
	private static final String CONNECTION_URL = "jdbc:derby:employees;create=true";
	private Connection connection;
	
    public CreateDB() throws SQLException {
        Optional<Connection> connectionOptional = connectToDb(CONNECTION_URL);
        if(connectionOptional.isPresent()){
            this.connection = connectionOptional.get();
            createTable();
            insertRecords();
            this.connection.close();
        } else {
            System.out.println("No JDBC connection. Exiting...");
        }
    }
    
    private void insertRecords() {
        List<String> sqlCommands = new ArrayList<>();
        sqlCommands.add("INSERT INTO JDBC.INVENTORY VALUES (1, 'Hammer', 12.50)");
        sqlCommands.add("INSERT INTO JDBC.INVENTORY VALUES (2, 'SAW', 17.50)");
        sqlCommands.add("INSERT INTO JDBC.INVENTORY VALUES (3, 'ScrewDriver', 6.50)");

        for(String sql : sqlCommands){
            try {
            	System.out.println(sql);
                connection.createStatement().executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void createTable() {
        final String SCHEMA_SQL = "CREATE SCHEMA JDBC";
        final String SQL = "CREATE TABLE JDBC.INVENTORY (inventory_id integer, item_name varchar(250), item_price decimal)";
        try {
            connection.createStatement().execute(SCHEMA_SQL);
            connection.createStatement().execute(SQL);
        } catch (SQLException e) {
            System.out.println("The table already exists");
        }
    }

    public Optional<Connection> connectToDb(String jdbcUrl){
        try {
            //Load the connection driver. This is specific to your database
            //and the driver has to be on your project's classpath or it will fail.
            //Since we are using derby, this is how it's done for that database.
            
            //It's different for each database (mysql, HSQL, PostgreSQL, etc)
            //so check the database's documentation
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            
            //This is standard, however. We will always create a connection
            //Using this code
            return Optional.of(DriverManager.getConnection(jdbcUrl));
        } catch (Exception e){
            e.printStackTrace();
            
            //Lot's of things can go wrong so return an empty optional to let 
            //the calling code know that there is no connection
            return Optional.empty();
        }
    }

}
