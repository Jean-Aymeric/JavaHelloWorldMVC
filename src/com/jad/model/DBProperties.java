package com.jad.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * The class Db properties.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
class DBProperties extends Properties {
    /**
     * The constant propertyFileName.
     */
    private static String propertyFileName = "db.properties";
    /**
     * The Url.
     */
    private String url;
    /**
     * The User.
     */
    private String user;
    /**
     * The Password.
     */
    private String password;

    /**
     * Instantiates a new Db properties.
     */
    public DBProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/com/jad/model/dao/" + DBProperties.propertyFileName));
            this.setUrl(properties.getProperty("url"));
            this.setUser(properties.getProperty("user"));
            this.setPassword(properties.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }
     }

    /**
     * Gets property file name.
     *
     * @return the property file name
     */
    public static String getPropertyFileName() {
        return propertyFileName;
    }

    /**
     * Sets property file name.
     *
     * @param propertyFileName the property file name
     */
    public static void setPropertyFileName(final String propertyFileName) {
        DBProperties.propertyFileName = propertyFileName;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public final String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public final void setUrl(final String url) {
        this.url = url;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public final String getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public final void setUser(final String user) {
        this.user = user;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public final String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public final void setPassword(final String password) {
        this.password = password;
    }
}
