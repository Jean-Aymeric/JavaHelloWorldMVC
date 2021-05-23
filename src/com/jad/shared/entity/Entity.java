package com.jad.shared.entity;

/**
 * The class Entity.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
public abstract class Entity {
    /**
     * The Id.
     */
    private final int id;

    /**
     * Instantiates a new Entity.
     *
     * @param id the id
     */
    public Entity(final int id) {
        this.id = id;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public final int getId() {
        return id;
    }
}
