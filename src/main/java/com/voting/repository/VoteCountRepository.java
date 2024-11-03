package com.voting.repository;

import com.voting.entity.VoteCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VoteCountRepository extends JpaRepository<VoteCount, Long> {


}

