package com.example.demo.service;

import com.example.demo.bo.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    public List<Article> getAll(){
        // récupérer tous les articles
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1L, "Chocolatine"));
        articles.add(new Article(2L, "Beurre doux"));
        articles.add(new Article(3L, "Beurre salé"));
        articles.add(new Article(4L, "Pain au chocolat"));

        // et les retourner
        return articles;
    }

}
