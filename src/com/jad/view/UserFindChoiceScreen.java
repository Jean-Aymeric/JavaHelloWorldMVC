package com.jad.view;

import com.jad.shared.CountryFindChoice;

import java.util.Scanner;

/**
 * The class User find choice screen.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class UserFindChoiceScreen extends Screen {
    @Override
    public final void showExtended() {
        System.out.println("Enter your find choice");
        System.out.println("1 - by country code");
        System.out.println("2 - by country name");
    }

    /**
     * Ask user find choice country find choice.
     *
     * @return the country find choice
     */
    public final CountryFindChoice askUserFindChoice() {
        this.show();
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                return CountryFindChoice.byCode;
            case 2:
                return CountryFindChoice.byName;
            default:
                return CountryFindChoice.error;
        }
    }
}
