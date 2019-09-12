package com.experimental.designpatterns.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite("Blog");
        System.out.println(website.getPages());

        Website website1 = WebsiteFactory.getWebsite("Shop");
        System.out.println(website1.getPages());
    }

}
