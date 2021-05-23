package com.jad.model.dao;

import com.jad.shared.entity.HelloWorld;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The class Dao hello world.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class DAOHelloWorld extends DAOEntity<HelloWorld> {
    /**
     * Instantiates a new Dao hello world.
     */
    public DAOHelloWorld() {
        super("helloWorldById(?)", "helloWorldGetAll()");
    }

    @Override
    protected HelloWorld resultSetToEntity(final ResultSet resultSet) {
        try {
            return new HelloWorld(resultSet.getInt("id"), resultSet.getString("message"));
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
