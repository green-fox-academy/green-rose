package com.gfa.thereddit.repositories;
import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.models.User;
import com.gfa.thereddit.models.Voting;
import com.gfa.thereddit.models.VotingKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingRepository extends CrudRepository<Voting, VotingKey> {
Voting getVotingByUserAndPost(User user, Post post);
}
