package com.jad.view;

import com.jad.shared.CountryFindChoice;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/**
 * The class User code or name.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class UserCodeOrName extends Screen {
    /**
     * The Country find choice.
     */
    private final CountryFindChoice countryFindChoice;

    /**
     * Instantiates a new User code or name.
     *
     * @param countryFindChoice the country find choice
     */
    public UserCodeOrName(final CountryFindChoice countryFindChoice) {
        this.countryFindChoice = countryFindChoice;
    }

    /**
     * Gets country find choice.
     *
     * @return the country find choice
     */
    protected final CountryFindChoice getCountryFindChoice() {
        return countryFindChoice;
    }

    @Override
    public final void showExtended() {
        System.out.print("Enter a country ");
        switch (this.getCountryFindChoice()) {
            case byCode:
                System.out.println("code : ");
                break;
            case byName:
                System.out.println("name : ");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    /**
     * Ask code or name string.
     *
     * @return the string
     */
    public String askCodeOrName() {
        this.show();
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
