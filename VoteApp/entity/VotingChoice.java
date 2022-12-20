package com.codeacademy.voteapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.codeacademy.voteapp.enu.VotingChoices;

@Entity
@Table(name = "voting_choices")
public class VotingChoice {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private VotingChoices votingChoice;
	
//	@ManyToOne
//	@JoinColumn(name = "vote_post_id")
//	private VotePost votePost;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public VotingChoices getVotingChoice() {
		return votingChoice;
	}
	public void setVotingChoice(VotingChoices votingChoice) {
		this.votingChoice = votingChoice;
	}
	
}
