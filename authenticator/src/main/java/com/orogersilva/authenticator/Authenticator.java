package com.orogersilva.authenticator;

/**
 * Created by RogerSilva on 7/25/2015.
 */
public class Authenticator {

    // region INSTANCE VARIABLES

    private final String address = "";

    private String username;
    private String password;

    // endregion

    public Authenticator(String username, String password) {

        setUsername(username);
        setPassword(password);
    }

    // region GETTERS AND SETTERS

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String authenticate() {

        return null;
    }

    // endregion
}
