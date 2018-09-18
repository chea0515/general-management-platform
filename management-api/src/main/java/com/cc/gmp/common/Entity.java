package com.cc.gmp.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class Entity implements Serializable {
    private static final long serialVersionUID = 4632238816466734347L;

    private Long id;
    private Date createTime;
    private Date updateTime;
    private String version;
}
