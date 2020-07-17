package com.gfa.thereddit.models;

import java.util.List;

public class PostPage {
    private List<Post> pageList;
    private Integer pages;

    public PostPage(List<Post> pageList, Integer pages) {
        this.pageList = pageList;
        this.pages = pages;
    }

    public List<Post> getPageList() {
        return pageList;
    }

    public Integer getPages() {
        return pages;
    }
}
