package com.nikolay.springmimimimetr.repositories;

import com.nikolay.springmimimimetr.entities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository  extends JpaRepository<Vote, Long> {
}