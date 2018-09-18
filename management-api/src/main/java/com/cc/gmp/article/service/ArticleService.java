package com.cc.gmp.article.service;

import com.cc.gmp.article.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticleList();

    List<Article> getArticleList(Article article);

    List<Article> getArticlePage(Article article, Integer pageNum, Integer pageSize);

    Integer getArticleCount(Article article);

    Article getArticle(Article article);

    Integer saveArticle(Article article);

    Integer updateArticle(Article article);

    Integer deleteArticle(Long id);
}
