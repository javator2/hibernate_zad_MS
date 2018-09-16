package com.sda.hibernate.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Affiliate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 45)
    private String url;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String token;
    @Column(length = 45)
    private String isActive;
    @Column(length = 45)
    private String createdAt;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Category> categorySet;

    public Affiliate() {
    }

    public Affiliate(String url, String email, String token, String isActive, String createdAt) {
        this.url = url;
        this.email = email;
        this.token = token;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }

    public Set<Category> getCategorySet() {
        return categorySet;
    }

    public void setCategorySet(Set<Category> categorySet) {
        this.categorySet = categorySet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
