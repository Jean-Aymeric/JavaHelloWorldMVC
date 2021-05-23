package com.jad.shared;

import com.jad.shared.entity.Country;

import java.util.List;

/**
 * The interface View.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public interface IView {
    /**
     * Show countries.
     *
     * @param countries the countries
     */
    void showCountries(List<Country> countries);

    /**
     * Print message.
     *
     * @param message the message
     */
    void printMessage(String message);

    /**
     * Ask user find choice country find choice.
     *
     * @return the country find choice
     */
    CountryFindChoice askUserFindChoice();

    /**
     * Ask code or name string.
     *
     * @param choice the choice
     * @return the string
     */
    String askCodeOrName(CountryFindChoice choice);
}
