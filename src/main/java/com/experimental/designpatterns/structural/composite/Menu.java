package com.experimental.designpatterns.structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent component) {
        menuComponents.add(component);
        return component;
    }

    public MenuComponent remove(MenuComponent component) {
        menuComponents.remove(component);
        return component;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next().toString());
        }

        return builder.toString();
    }

}
