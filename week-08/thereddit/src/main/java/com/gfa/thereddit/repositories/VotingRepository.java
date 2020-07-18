package com.gfa.thereddit.repositories;
import com.gfa.thereddit.models.Voting;
import com.gfa.thereddit.models.VotingKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingRepository extends JpaRepository<Voting, VotingKey> {
}
