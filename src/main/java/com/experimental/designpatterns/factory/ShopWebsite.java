package com.experimental.designpatterns.factory;

public class ShopWebsite extends Website {

    protected void createWebstite() {
        pages.add(new AboutPage());
        pages.add(new CartPage());
        pages.add(new ContactPage());
    }

}
