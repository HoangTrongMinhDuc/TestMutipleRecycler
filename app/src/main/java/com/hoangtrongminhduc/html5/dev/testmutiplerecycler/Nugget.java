package com.hoangtrongminhduc.html5.dev.testmutiplerecycler;

import java.util.List;

/**
 * Created by HTML5 on 25/10/2017.
 */

public class Nugget {
    private String title;
    private List<String> tags;

    public Nugget(){

    }

    public Nugget(String title, List<String> tags) {
        this.title = title;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
