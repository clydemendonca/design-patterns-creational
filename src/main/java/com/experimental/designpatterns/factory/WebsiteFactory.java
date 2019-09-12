package com.experimental.designpatterns.factory;

public class WebsiteFactory {

    public static Website getWebsite(String siteType) {
        if ("Blog".equals(siteType)) {
            return new BlogWebsite();
        } else if ("Shop".equals(siteType)) {
            return new ShopWebsite();
        }
        return null;
    }

}
