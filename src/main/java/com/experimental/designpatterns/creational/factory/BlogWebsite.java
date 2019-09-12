package com.experimental.designpatterns.creational.factory;

public class BlogWebsite extends Website {

    protected void createWebstite() {
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }

}
