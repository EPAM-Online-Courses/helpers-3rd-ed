package com.epam.prd.jjop.helpers.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Starting point with hardcoded English messages.
 *
 * @author Marcin Ogorzałek
 */
class Main {
    /* We want four languages however! How to set this up?
         PL: Witaj, Do widzenia!
         FR: Bien venue, Au revoir!
         DE: Wilkommen, Auf wiedersehen!
     */
    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        if(args.length > 0) {
            locale = new Locale(args[0]);
        }

        ResourceBundle resourceBundle =
                ResourceBundle.getBundle("Message", locale);

        System.out.println(resourceBundle.getString("greeting"));
        System.out.println(resourceBundle.getString("farewell"));
    }
}

