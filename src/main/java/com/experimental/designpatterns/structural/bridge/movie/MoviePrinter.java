package com.experimental.designpatterns.structural.bridge.movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    protected List<Detail> getDetails() {

        List<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));

        return details;

    }

    protected String getHeader() {
        return movie.getClassification();
    }

}
