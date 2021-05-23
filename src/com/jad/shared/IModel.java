package com.jad.shared;

import com.jad.shared.entity.Country;

import java.util.List;

/**
 * The interface Model.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public interface IModel {
    /**
     * Gets countries.
     *
     * @return the countries
     */
    List<Country> getCountries();

    /**
     * Gets country by code.
     *
     * @param code the code
     * @return the country by code
     */
    Country getCountryByCode(String code);

    /**
     * Gets country by name.
     *
     * @param name the name
     * @return the country by name
     */
    Country getCountryByName(String name);

    /**
     * Close.
     */
    void close();
}
