package com.maciejg.SomtehingNew.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private String name;

    private String surname;

    private String hobby;

    private String luckyNumber;

    public UsersEntity(String name, String surname, String hobby, String luckyNumber) {
        this.name = name;
        this.surname = surname;
        this.hobby = hobby;
        this.luckyNumber = luckyNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(String luckyNumber) {
        this.luckyNumber = luckyNumber;
    }
}
