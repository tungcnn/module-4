package com.nasa.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class FeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int score;
    private String author;
    private String feedBack;
    private int numberOfLike = 0;
    private LocalDateTime localDateTime = LocalDateTime.now();

    public FeedBack() {
    }

    public FeedBack(int score, String author, String feedBack, int numberOfLike, LocalDateTime localDateTime) {
        this.score = score;
        this.author = author;
        this.feedBack = feedBack;
        this.numberOfLike = numberOfLike;
        this.localDateTime = localDateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
