package com.gfa.thereddit.services;
import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.models.User;
import com.gfa.thereddit.models.Voting;
import com.gfa.thereddit.repositories.VotingRepository;
import org.springframework.stereotype.Service;

@Service
public class VotingServiceImpl implements VotingService {
private final VotingRepository votingRepository;


    public VotingServiceImpl(VotingRepository votingRepository) {
        this.votingRepository = votingRepository;
    }

    public void save(Voting voting) {
        this.votingRepository.save(voting);
    }

}
