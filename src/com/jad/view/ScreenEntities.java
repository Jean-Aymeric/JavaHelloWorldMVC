package com.jad.view;

import com.jad.shared.entity.Entity;

import java.util.List;

/**
 * The class Screen entities.
 *
 * @param <E> the type parameter
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
abstract class ScreenEntities<E extends Entity> extends Screen {
    /**
     * The Entities.
     */
    private final List<E> entities;

    /**
     * Instantiates a new Screen entities.
     *
     * @param entities the entities
     */
    protected ScreenEntities(final List<E> entities) {
        this.entities = entities;
    }

    /**
     * Gets entities.
     *
     * @return the entities
     */
    protected final List<E> getEntities() {
        return entities;
    }

    @Override
    public final void showExtended() {
        System.out.println(this.getHeader());
        for (E entity : this.getEntities()) {
            System.out.println(this.entityToString(entity));
        }
        System.out.println(this.getFooter());
    }

    /**
     * Gets header.
     *
     * @return the header
     */
    protected abstract String getHeader();

    /**
     * Gets footer.
     *
     * @return the footer
     */
    protected abstract String getFooter();

    /**
     * Entity to string string.
     *
     * @param entity the entity
     * @return the string
     */
    protected abstract String entityToString(E entity);
}
