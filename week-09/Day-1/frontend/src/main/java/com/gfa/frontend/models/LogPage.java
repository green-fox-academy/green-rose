package com.gfa.frontend.models;

import java.util.List;

public class LogPage {

    private List<Log> logList;
    private Integer pages;
    private Long sumLogs;


    public LogPage() {
    }

    public LogPage(List<Log> logList, Integer pages, Long sumLogs) {
        this.logList = logList;
        this.pages = pages;
        this.sumLogs = sumLogs;
    }

    @Override
    public String toString() {
        return "{\"entries\":[" +
                 logList.toString()  +"]," +
                "\"entry_count\": " + pages;
    }
}
