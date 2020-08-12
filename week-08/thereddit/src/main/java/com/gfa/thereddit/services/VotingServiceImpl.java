package com.gfa.thereddit.services;
import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.models.User;
import com.gfa.thereddit.models.Voting;
import com.gfa.thereddit.models.VotingKey;
import com.gfa.thereddit.repositories.VotingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VotingServiceImpl implements VotingService {
private final VotingRepository votingRepository;


    public VotingServiceImpl(VotingRepository votingRepository) {
        this.votingRepository = votingRepository;
    }

    public void save(Voting voting) {
        this.votingRepository.save(voting);
    }

    public Voting getVoting (VotingKey votingKey){
        return this.votingRepository.findById(votingKey).orElse(null);
    }

    @Override
    public Voting getVotingByUserAndPost(User user, Post post) {
        return this.votingRepository.getVotingByUserAndPost(user,post);
    }

}
