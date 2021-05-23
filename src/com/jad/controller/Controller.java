package com.jad.controller;

import com.jad.model.ModelFacade;
import com.jad.shared.CountryFindChoice;
import com.jad.shared.IModel;
import com.jad.shared.IView;
import com.jad.shared.entity.Country;
import com.jad.view.ViewFacade;

/**
 * The class Controller.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class Controller {
    /**
     * The Model.
     */
    private final IModel model;
    /**
     * The View.
     */
    private final IView view;

    /**
     * Instantiates a new Controller.
     */
    public Controller() {
        this.model = new ModelFacade();
        this.view = new ViewFacade();
    }

    /**
     * Gets model.
     *
     * @return the model
     */
    public final IModel getModel() {
        return model;
    }

    /**
     * Gets view.
     *
     * @return the view
     */
    public final IView getView() {
        return view;
    }

    /**
     * Go. The algorithm of the program
     */
    public final void go() {
        this.getView().showCountries(this.getModel().getCountries());
        CountryFindChoice choice;
        do {
            choice = this.getView().askUserFindChoice();
        } while (choice == CountryFindChoice.error);
        String codeOrName = this.getView().askCodeOrName(choice);
        Country country = null;
        switch (choice) {
            case byCode:
                country = this.getModel().getCountryByCode(codeOrName);
                break;
            case byName:
                country = this.getModel().getCountryByName(codeOrName);
                break;
        }
        if(country != null) {
            this.getView().printMessage(country.getHelloWorld().getMessage());
        }
        this.getModel().close();
    }
}
