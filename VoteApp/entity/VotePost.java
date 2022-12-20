package com.codeacademy.voteapp.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "votepost")
public class VotePost {
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@NotBlank
	@Column(name = "voting_title")
	private String votingTitle;
	
//	@NotBlank
	@Column(name = "voting_description")
	private String votingDescription;
	
	@Column(name = "date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	@Column(name = "end_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "results_id", referencedColumnName = "id")
	private Results result;
	
//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "votePost")
//	private List <VotingChoice> votingChoice;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "votePost")
	private List <UserVotes> userVote;

//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "user_votes",
//	joinColumns = @JoinColumn(name = "user_id"),
//	inverseJoinColumns = @JoinColumn(name = "vote_post_id"))
//	List <VotingChoice> votingChoices;

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

//	public List<VotingChoice> getVotingChoices() {
//		return votingChoices;
//	}

//	public void setVotingChoices(List<VotingChoice> votingChoices) {
//		this.votingChoices = votingChoices;
//	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Results getResult() {
		return result;
	}

	public void setResult(Results result) {
		this.result = result;
	}
	
}
