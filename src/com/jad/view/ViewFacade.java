package com.jad.view;

import com.jad.shared.CountryFindChoice;
import com.jad.shared.IView;
import com.jad.shared.entity.Country;

import java.util.List;

/**
 * The class View facade.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class ViewFacade implements IView {
    @Override
    public void showCountries(final List<Country> countries) {
        new CountriesScreen(countries).show();
    }

    @Override
    public void printMessage(final String message) {
        new MessageScreen(message).show();
    }

    @Override
    public CountryFindChoice askUserFindChoice() {
        return new UserFindChoiceScreen().askUserFindChoice();
    }

    @Override
    public String askCodeOrName(final CountryFindChoice choice) {
        return new UserCodeOrName(choice).askCodeOrName();
    }
}
