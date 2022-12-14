package com.codeacademy.voteapp.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.codeacademy.voteapp.enu.VotingChoices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "results")
public class Results {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private VotingChoices votingChoice;
	
	@Column(name = "voting_points")
	private Integer votingPoints;
	
	@ManyToOne
	@JoinColumn(name = "vote_post_id")
	private VotePost votePost;
	
//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
//	private List <VotePost> votePosts;
	
}
