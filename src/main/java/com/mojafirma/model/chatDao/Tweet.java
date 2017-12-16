package com.mojafirma.model.chatDao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor

public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "date_time")
    private Long date_time;

    @Column(name= "Message")
    private String message;

    @Column(name= "User_Id")
    private int user_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "user_id")
    private User user;

    public Tweet(Long date_time, String message, int user_id, User user) {
        this.date_time = date_time;
        this.message = message;
        this.user_id = user_id;
        this.user = user;
    }

    public Tweet() {
    }
}
