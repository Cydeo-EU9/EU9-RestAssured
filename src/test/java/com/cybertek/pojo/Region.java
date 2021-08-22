package com.cybertek.pojo;

import java.util.List;

public class Region {
    private int region_id;
    private String region_name;
    private List<Link> links;

    @Override
    public String toString() {
        return "Region{" +
                "region_id=" + region_id +
                ", region_name='" + region_name + '\'' +
                ", links=" + links +
                '}';
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
