package com.mojafirma.model.chatDao;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name = "name")
    private String nick;

    @Column(name = "password")
    private String pass;

    @OneToMany( cascade = CascadeType.ALL,
            mappedBy = "user")
    private List<Tweet> tweetList = new ArrayList<Tweet>();



}
