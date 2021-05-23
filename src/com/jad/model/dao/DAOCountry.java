package com.jad.model.dao;

import com.jad.shared.entity.Country;
import com.jad.shared.entity.HelloWorld;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The class Dao country.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class DAOCountry extends DAOEntity<Country>{
    /**
     * Instantiates a new Dao country.
     */
    public DAOCountry() {
        super("countryById(?)", "countryAll()");
    }

    @Override
    protected final Country resultSetToEntity(final ResultSet resultSet) {
        try {
            HelloWorld helloWorld = null;
            if (resultSet.getInt("id_helloWorld") != 0) {
                helloWorld = new HelloWorld(resultSet.getInt("id_helloWorld"), resultSet.getString("message"));
            } else {
                helloWorld = new HelloWorld(0, "");
            }
            return new Country(resultSet.getInt("id"), resultSet.getString("code"), resultSet.getString("name"),
                    helloWorld);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    /**
     * Find by code country.
     *
     * @param code the code
     * @return the country
     */
    public final Country findByCode(final String code) {
        return super.findByString(code, "countryByCode(?)");
    }

    /**
     * Find by name country.
     *
     * @param name the name
     * @return the country
     */
    public final Country findByName(final String name) {
        return super.findByString(name, "countryByName(?)");
    }
}
