package com.gfa.thereddit.services;
import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.models.User;
import com.gfa.thereddit.models.Voting;
import com.gfa.thereddit.models.VotingKey;
import org.springframework.stereotype.Service;

@Service
public interface VotingService {

    void save(Voting voting);

    Voting getVoting (VotingKey votingKey);

    Voting getVotingByUserAndPost (User user, Post post);

}
