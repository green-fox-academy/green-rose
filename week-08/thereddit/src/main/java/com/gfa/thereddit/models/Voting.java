package com.gfa.thereddit.models;

import javax.persistence.*;

@Entity
public class Voting {
    @EmbeddedId
    VotingKey id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @MapsId("post_id")
    @JoinColumn(name = "post_id")
    Post post;

    int rating;
}
