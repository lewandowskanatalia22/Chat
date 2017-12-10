package com.mojafirma.model.viev;

import com.mojafirma.model.chatDao.User;

import java.util.HashMap;

public class Login {
    private HashMap<String, String> login;

    public Login() {
        login = new HashMap<String, String>();
        generateTestData();
    }

    public void register(String name, String password) {
        login.put(name, password);
    }

    public boolean userExists(User user) {
        String passwordFromSource = login.get(user.getNick());
        if(passwordFromSource != null) {
            return user.getPass().equals(passwordFromSource);
        }else
            return false;
    }

    private void generateTestData() {
        login.put("admin", "test");
        login.put("user", "passUser");
    }
}
