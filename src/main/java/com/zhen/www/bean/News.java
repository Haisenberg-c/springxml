package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class News {
    private int newsId;
    private String newsName;
    private String newsPath;
    private String newsSummary;
    private Integer newsHot;
    private Date newsPubtime;
    private Integer newsStatus;
    private String newsAuthor;
    private Integer newsMenuid;

    @Id
    @Column(name = "news_id")
    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    @Basic
    @Column(name = "news_name")
    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    @Basic
    @Column(name = "news_path")
    public String getNewsPath() {
        return newsPath;
    }

    public void setNewsPath(String newsPath) {
        this.newsPath = newsPath;
    }

    @Basic
    @Column(name = "news_summary")
    public String getNewsSummary() {
        return newsSummary;
    }

    public void setNewsSummary(String newsSummary) {
        this.newsSummary = newsSummary;
    }

    @Basic
    @Column(name = "news_hot")
    public Integer getNewsHot() {
        return newsHot;
    }

    public void setNewsHot(Integer newsHot) {
        this.newsHot = newsHot;
    }

    @Basic
    @Column(name = "news_pubtime")
    public Date getNewsPubtime() {
        return newsPubtime;
    }

    public void setNewsPubtime(Date newsPubtime) {
        this.newsPubtime = newsPubtime;
    }

    @Basic
    @Column(name = "news_status")
    public Integer getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(Integer newsStatus) {
        this.newsStatus = newsStatus;
    }

    @Basic
    @Column(name = "news_author")
    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    @Basic
    @Column(name = "news_menuid")
    public Integer getNewsMenuid() {
        return newsMenuid;
    }

    public void setNewsMenuid(Integer newsMenuid) {
        this.newsMenuid = newsMenuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (newsId != news.newsId) return false;
        if (newsName != null ? !newsName.equals(news.newsName) : news.newsName != null) return false;
        if (newsPath != null ? !newsPath.equals(news.newsPath) : news.newsPath != null) return false;
        if (newsSummary != null ? !newsSummary.equals(news.newsSummary) : news.newsSummary != null) return false;
        if (newsHot != null ? !newsHot.equals(news.newsHot) : news.newsHot != null) return false;
        if (newsPubtime != null ? !newsPubtime.equals(news.newsPubtime) : news.newsPubtime != null) return false;
        if (newsStatus != null ? !newsStatus.equals(news.newsStatus) : news.newsStatus != null) return false;
        if (newsAuthor != null ? !newsAuthor.equals(news.newsAuthor) : news.newsAuthor != null) return false;
        if (newsMenuid != null ? !newsMenuid.equals(news.newsMenuid) : news.newsMenuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newsId;
        result = 31 * result + (newsName != null ? newsName.hashCode() : 0);
        result = 31 * result + (newsPath != null ? newsPath.hashCode() : 0);
        result = 31 * result + (newsSummary != null ? newsSummary.hashCode() : 0);
        result = 31 * result + (newsHot != null ? newsHot.hashCode() : 0);
        result = 31 * result + (newsPubtime != null ? newsPubtime.hashCode() : 0);
        result = 31 * result + (newsStatus != null ? newsStatus.hashCode() : 0);
        result = 31 * result + (newsAuthor != null ? newsAuthor.hashCode() : 0);
        result = 31 * result + (newsMenuid != null ? newsMenuid.hashCode() : 0);
        return result;
    }
}
