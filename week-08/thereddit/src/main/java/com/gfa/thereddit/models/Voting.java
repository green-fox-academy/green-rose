package com.gfa.thereddit.models;

import javax.persistence.*;

@Entity
public class Voting {
    @EmbeddedId
    private VotingKey id  = new VotingKey();
    ;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
    private User user;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id", nullable = false, insertable = false, updatable = false)
    private Post post;

    private int rating;

    public Voting(){};

    public Voting(User user, Post post, int rating){
        this.user = user;
        this.post=post;
        this.rating = rating;
        this.id = new VotingKey();
        this.id.setUserId(user.getId());
        this.id.setPostId(post.getId());
    };

    public VotingKey getId() {

        return id;
    }

    public void setId(User user, Post post) {
        this.id.setPostId(post.getId());
        this.id.setUserId(user.getId());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
