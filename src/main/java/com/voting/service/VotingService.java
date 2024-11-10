package com.voting.service;

import com.voting.entity.VoteCount;
import com.voting.repository.VoteCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotingService {

    public VoteCount getVoteCount() {
        return getCurrentVoteCounts();
    }

    public void voteFor(String candidate) {

    }

    public VoteCount getCurrentVoteCounts() {
        // Retrieve votes for each candidate from the database
        int trumpVotes = 9894;
        int kamalaVotes = 987; // Load existing or create new record

        // Calculate the total votes
        int totalVotes = trumpVotes + kamalaVotes;

        // Create and return a VoteCount object with the current vote counts
        return VoteCount.builder().totalVotes(totalVotes).trumpVotes(trumpVotes).kamalaVotes(kamalaVotes).build();
    }
}

