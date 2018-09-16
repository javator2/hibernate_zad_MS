package com.sda.hibernate.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 45)
    private String name;
    @OneToMany(mappedBy = "category")
    private Set<Job> jobSet;
    @ManyToMany(mappedBy = "categorySet")
    private Set<Affiliate> affiliateSe;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Set<Job> getJobSet() {
        return jobSet;
    }

    public void setJobSet(Set<Job> jobSet) {
        this.jobSet = jobSet;
    }

    public Set<Affiliate> getAffiliateSe() {
        return affiliateSe;
    }

    public void setAffiliateSe(Set<Affiliate> affiliateSe) {
        this.affiliateSe = affiliateSe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
