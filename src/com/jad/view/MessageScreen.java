package com.jad.view;

/**
 * The class Message screen.
 *
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
class MessageScreen extends Screen {
    /**
     * The Message.
     */
    private final String message;

    /**
     * Instantiates a new Message screen.
     *
     * @param message1 the message 1
     */
    public MessageScreen(final String message1) {
        this.message = message1;
    }

    @Override
    public final void showExtended() {
        System.out.println(this.getMessage());
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    protected final String getMessage() {
        return message;
    }
}
