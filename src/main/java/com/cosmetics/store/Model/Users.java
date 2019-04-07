package com.cosmetics.store.Model;

import javax.persistence.*;

@Entity
@Table(name="users")

public class Users {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "user_type")
    private String userType;

    public Users(Long id,String name, String userType) {
        this.id =id;
        this.name = name;
        this.userType = userType;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
