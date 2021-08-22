package com.cybertek.pojo;

import java.util.List;

public class Search {
    private List<Spartan> content;
    private int totalElement;

    @Override
    public String toString() {
        return "Search{" +
                "content=" + content +
                ", totalElement=" + totalElement +
                '}';
    }

    public List<Spartan> getContent() {
        return content;
    }

    public void setContent(List<Spartan> content) {
        this.content = content;
    }

    public int getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(int totalElement) {
        this.totalElement = totalElement;
    }
}
