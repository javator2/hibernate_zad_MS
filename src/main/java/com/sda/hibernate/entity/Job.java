package com.sda.hibernate.entity;

import javax.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 45)
    private String type;
    @Column(length = 45)
    private String company;
    @Column(length = 45)
    private String logo;
    @Column(length = 45)
    private String url;
    @Column(length = 45)
    private String position;
    @Column(length = 45)
    private String description;
    @Column(length = 45)
    private String howToApply;
    @Column(length = 45)
    private String token;
    @Column(length = 45)
    private String isPublic;
    @Column(length = 45)
    private String isValided;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String expiriesAt;
    @Column(length = 45)
    private String createdAt;
    @Column(length = 45)
    private String updatedAt;
    @PrimaryKeyJoinColumn
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;


    public Job() {
    }

    public Job(String type, String company, String logo, String url, String position, String description, String howToApply, String token, String isPublic, String isValided, String email, String expiriesAt, String createdAt, String updatedAt, Category category) {
        this.type = type;
        this.company = company;
        this.logo = logo;
        this.url = url;
        this.position = position;
        this.description = description;
        this.howToApply = howToApply;
        this.token = token;
        this.isPublic = isPublic;
        this.isValided = isValided;
        this.email = email;
        this.expiriesAt = expiriesAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHowToApply() {
        return howToApply;
    }

    public void setHowToApply(String howToApply) {
        this.howToApply = howToApply;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    public String getIsValided() {
        return isValided;
    }

    public void setIsValided(String isValided) {
        this.isValided = isValided;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpiriesAt() {
        return expiriesAt;
    }

    public void setExpiriesAt(String expiriesAt) {
        this.expiriesAt = expiriesAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
