package com.jad.view;

import com.jad.shared.entity.Country;

import java.util.List;

/**
 * The class Countries screen.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class CountriesScreen extends ScreenEntities<Country> {

    /**
     * Instantiates a new Countries screen.
     *
     * @param countries the countries
     */
    protected CountriesScreen(final List<Country> countries) {
        super(countries);
    }

    @Override
    protected final String getHeader() {
     return "id" + "\t| " + "Code" + "\t| " + "Name" + "\n" + "------------------------------------------";
    }

    @Override
    protected final String getFooter() {
        return "------------------------------------------";
    }

    @Override
    protected final String entityToString(final Country country) {
        return country.getId() + "\t| " + country.getCode() + "\t| " + country.getName();
    }
}
