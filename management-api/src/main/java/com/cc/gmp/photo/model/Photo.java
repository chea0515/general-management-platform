package com.cc.gmp.photo.model;

import com.cc.gmp.common.Entity;

public class Photo extends Entity {
    private static final long serialVersionUID = -3974621828228630471L;

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}