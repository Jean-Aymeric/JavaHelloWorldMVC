package com.jad.shared.entity;

/**
 * The class Country.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class Country extends Entity {
    /**
     * The Code.
     */
    private final String code;
    /**
     * The Name.
     */
    private final String name;
    /**
     * The Hello world.
     */
    private final HelloWorld helloWorld;

    /**
     * Instantiates a new Country.
     *
     * @param id         the id
     * @param code       the code
     * @param name       the name
     * @param helloWorld the hello world
     */
    public Country(final int id, final String code, final String name, final HelloWorld helloWorld) {
        super(id);
        this.code = code;
        this.name = name;
        this.helloWorld = helloWorld;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public final String getCode() {
        return code;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * Gets hello world.
     *
     * @return the hello world
     */
    public final HelloWorld getHelloWorld() {
        return helloWorld;
    }
}
