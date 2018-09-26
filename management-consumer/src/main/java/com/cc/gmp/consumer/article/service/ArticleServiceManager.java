package com.cc.gmp.consumer.article.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cc.gmp.article.model.Article;
import com.cc.gmp.article.service.ArticleService;
import com.cc.gmp.consumer.article.vo.ArticleVO;
import com.cc.gmp.consumer.common.ManagementException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ArticleServiceManager {

    @Reference(version = "1.0.1")
    private ArticleService articleService;

    public List<ArticleVO> getArticleAllList() throws ManagementException {
        try{
            List<Article> allArticleList = articleService.getAllArticleList();
            return null;
        } catch (Exception ex) {
            log.error("");
            throw new ManagementException(ex);
        }
    }

    public List<ArticleVO> getArticleList(ArticleVO articleVO) throws ManagementException {
        try{
            List<Article> articleList = articleService.getArticleList(null);
            return null;
        } catch (Exception ex) {
            log.error("");
            throw new ManagementException(ex);
        }
    }

    public List<ArticleVO> getArticlePage(ArticleVO articleVO, Integer pageNo, Integer pageSize) throws ManagementException {
        try{
            List<Article> articlePage = articleService.getArticlePage(null, pageNo, pageSize);
            return null;
        } catch (Exception ex) {
            log.error("");
            throw new ManagementException(ex);
        }
    }
}
