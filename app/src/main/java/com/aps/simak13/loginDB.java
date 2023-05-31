package com.aps.simak13;

public class loginDB {
    public String NIM;
    public String password;

    public loginDB(String NIM, String password) {
        this.NIM = NIM;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public String getNIM() {
        return NIM;
    }
}