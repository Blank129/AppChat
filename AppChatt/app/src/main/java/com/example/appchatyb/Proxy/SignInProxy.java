package com.example.appchatyb.Proxy;

import com.example.appchatyb.activities.SignInActivity;
public class SignInProxy implements IProxy {
    private SignInActivity signInActivity;

    public SignInProxy(SignInActivity signInActivity) {

        this.signInActivity = signInActivity;
    }

    @Override
    public void signIn() {

        if (signInActivity.isValidSignInDetails()) {
            signInActivity.signIn();
        }
    }
}
