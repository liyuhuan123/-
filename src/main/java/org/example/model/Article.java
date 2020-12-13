package org.example.model;

import java.util.Date;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date createTime;
    private Integer viewCount;
    private Integer UserId;

    public Article() {
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", viewCount=" + viewCount +
                ", UserId=" + UserId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Article(Integer id, String title, String content, Date createTime, Integer viewCount, Integer userId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
        this.viewCount = viewCount;
        UserId = userId;
    }
}