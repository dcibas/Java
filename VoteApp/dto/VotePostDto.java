package com.codeacademy.voteapp.dto;

import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotePostDto {

	private Long id;
	
//	@NotBlank(message = "Voting title cannot be blank")
	private String votingTitle;
	
//	@NotBlank(message = "Voting description cannot be blank")
	private String votingDescription;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDateTime date;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDateTime endDate;
	
	private Long userId;
	
	private ResultsDto resultsDto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVotingTitle() {
		return votingTitle;
	}

	public void setVotingTitle(String votingTitle) {
		this.votingTitle = votingTitle;
	}

	public String getVotingDescription() {
		return votingDescription;
	}

	public void setVotingDescription(String votingDescription) {
		this.votingDescription = votingDescription;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public ResultsDto getResultsDto() {
		return resultsDto;
	}

	public void setResultsDto(ResultsDto resultsDto) {
		this.resultsDto = resultsDto;
	}
	
}
