package com.codeacademy.voteapp.dto;

import java.util.Date;
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

//	@NotBlank(message = "Voting choice cannot be blank")
	private String votingChoice1;
	
//	@NotBlank(message = "Voting choice cannot be blank")
	private String votingChoice2;
//	
//	@NotBlank(message = "Voting choice cannot be blank")
	private String votingChoice3;
	
//	@NotBlank(message = "Voting choice cannot be blank")
	private String votingChoice4;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	
	private Long userId;
	
//	private List<Long>votingChoicesIds;

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

	public String getVotingChoice1() {
		return votingChoice1;
	}

	public void setVotingChoice1(String votingChoice1) {
		this.votingChoice1 = votingChoice1;
	}

	public String getVotingChoice2() {
		return votingChoice2;
	}

	public void setVotingChoice2(String votingChoice2) {
		this.votingChoice2 = votingChoice2;
	}

	public String getVotingChoice3() {
		return votingChoice3;
	}

	public void setVotingChoice3(String votingChoice3) {
		this.votingChoice3 = votingChoice3;
	}

	public String getVotingChoice4() {
		return votingChoice4;
	}

	public void setVotingChoice4(String votingChoice4) {
		this.votingChoice4 = votingChoice4;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
