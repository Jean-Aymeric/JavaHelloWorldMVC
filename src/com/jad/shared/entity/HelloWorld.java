package com.jad.shared.entity;

/**
 * The class Hello world.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public class HelloWorld extends Entity {
    /**
     * The Message.
     */
    private final String message;

    /**
     * Instantiates a new Hello world.
     *
     * @param id      the id
     * @param message the message
     */
    public HelloWorld(final int id, final String message) {
        super(id);
        this.message = message;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public final String getMessage() {
        return message;
    }
}
