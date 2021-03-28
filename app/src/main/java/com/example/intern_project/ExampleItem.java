package com.example.intern_project;

public class ExampleItem {
    private String imageUrl;
    private String name;
    private String status;
    private String agency;
    private String wikiLink;

    public ExampleItem() {
    }

    public ExampleItem(String imageUrl, String name, String status, String agency, String wikiLink) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.status = status;
        this.agency = agency;
        this.wikiLink = wikiLink;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getWikiLink() {
        return wikiLink;
    }

    public void setWikiLink(String wikiLink) {
        this.wikiLink = wikiLink;
    }
}
