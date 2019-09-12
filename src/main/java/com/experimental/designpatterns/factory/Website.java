package com.experimental.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<Page>();

    public Website() {
        createWebstite();
    }

    public List<Page> getPages() {
        return pages;
    }

    protected abstract void createWebstite();

}
