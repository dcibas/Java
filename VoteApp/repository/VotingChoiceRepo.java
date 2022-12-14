package com.codeacademy.voteapp.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codeacademy.voteapp.entity.VotingChoice;
import com.codeacademy.voteapp.enu.VotingChoices;


@Repository
public interface VotingChoiceRepo extends CrudRepository<VotingChoice, Long> {

	Optional<VotingChoice> findByVotingChoice(VotingChoices choice);
	
}
