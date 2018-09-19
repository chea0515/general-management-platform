package com.cc.gmp.article.model;

import com.cc.gmp.common.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Article extends Entity {
    private static final long serialVersionUID = -5981027626795340512L;

    private String title;
    private String content;
}
