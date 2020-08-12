package com.gfa.thereddit.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class VotingKey implements Serializable {
    @Column(name = "post_id")
    private Long postId;

    @Column(name = "user_id")
    private Long userId;

    public VotingKey(Long postId, Long userId){
        this.postId=postId;
        this.userId=userId;
    };

    public VotingKey(){
    };
    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VotingKey votingKey = (VotingKey) o;
        return postId == votingKey.getPostId() &&
                userId == votingKey.getPostId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPostId(), getPostId());
    }
}
