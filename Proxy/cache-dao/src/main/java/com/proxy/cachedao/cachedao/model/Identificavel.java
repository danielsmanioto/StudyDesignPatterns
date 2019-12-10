package com.proxy.cachedao.cachedao.model;

import java.time.LocalDate;

public class Identificavel {

    private Integer id;
    private LocalDate date;

    public Identificavel(Integer id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }
}
