package com.gfa.thereddit.services;
import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.models.User;
import com.gfa.thereddit.models.Voting;
import org.springframework.stereotype.Service;

@Service
public interface VotingService {

    void save(Voting voting);

}
