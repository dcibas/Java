package com.codeacademy.voteapp.dto;

import java.time.LocalDateTime;
import com.codeacademy.voteapp.entity.VotePost;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultsDto {
	
	private Long id;
	
//	@NotNull(message = "Voting result cannot be null")
	private Integer votingPoints1;
	
//	@NotNull(message = "Voting result cannot be null")
	private Integer votingPoints2;
	
//	@NotNull(message = "Voting result cannot be null")
	private Integer votingPoints3;

//	@NotNull(message = "Voting result cannot be null")
	private Integer votingPoints4;
	
	private VotePostDto votePostDto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVotingPoints1() {
		return votingPoints1;
	}

	public void setVotingPoints1(Integer votingPoints1) {
		this.votingPoints1 = votingPoints1;
	}

	public Integer getVotingPoints2() {
		return votingPoints2;
	}

	public void setVotingPoints2(Integer votingPoints2) {
		this.votingPoints2 = votingPoints2;
	}

	public Integer getVotingPoints3() {
		return votingPoints3;
	}

	public void setVotingPoints3(Integer votingPoints3) {
		this.votingPoints3 = votingPoints3;
	}

	public Integer getVotingPoints4() {
		return votingPoints4;
	}

	public void setVotingPoints4(Integer votingPoints4) {
		this.votingPoints4 = votingPoints4;
	}

	public VotePostDto getVotePostDto() {
		return votePostDto;
	}

	public void setVotePostDto(VotePostDto votePostDto) {
		this.votePostDto = votePostDto;
	}
	
}
