package com.pegah.DPBMediatorImplementation;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}

