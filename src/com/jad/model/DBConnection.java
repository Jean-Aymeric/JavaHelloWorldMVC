package com.jad.model;

import java.sql.*;

/**
 * The class Db connection.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class DBConnection {
    /**
     * The constant Instance.
     */
    private static DBConnection Instance = null;
    /**
     * The Connection.
     */
    private Connection connection;

    /**
     * Instantiates a new Db connection.
     */
    private DBConnection() {
        this.open();
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static DBConnection getInstance() {
        if (DBConnection.Instance == null) {
            DBConnection.Instance = new DBConnection();
        }
        return DBConnection.Instance;
    }

    /**
     * Open boolean.
     *
     * @return the boolean
     */
    private final Boolean open() {
        final DBProperties dbProperties = new DBProperties();
        try {
            this.connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUser(), dbProperties.getPassword());
            return true;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
         }
        return false;
    }

    /**
     * Gets connection.
     *
     * @return the connection
     */
    public final Connection getConnection() {
        return connection;
    }

    /**
     * Close.
     */
    public final void close() {
        try {
            this.getConnection().close();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}
