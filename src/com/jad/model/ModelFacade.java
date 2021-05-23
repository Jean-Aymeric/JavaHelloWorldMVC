package com.jad.model;

import com.jad.model.dao.DAOCountry;
import com.jad.shared.IModel;
import com.jad.shared.entity.Country;

import java.util.List;

/**
 * The class Model facade.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class ModelFacade implements IModel {
    @Override
    public final List<Country> getCountries() {
        return new DAOCountry().getAll();
    }

    @Override
    public final Country getCountryByCode(final String code) {
        return new DAOCountry().findByCode(code);
    }

    @Override
    public final Country getCountryByName(final String name) {
        return new DAOCountry().findByName(name);
    }

    @Override
    public void close() {
        DBConnection.getInstance().close();
    }
}
