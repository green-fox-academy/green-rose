package com.gfa.thereddit.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VotingKey implements Serializable {
    @Column(name = "post_id")
    Long postId;

    @Column(name = "user_id")
    Long userId;
}
