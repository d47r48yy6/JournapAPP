package com.strap.journalApp.controller.entity;

public class JournalEntry {
    private long id ;

    public long getId() {
        return id;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String title ;
    private String Content ;
}
