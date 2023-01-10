package Entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bookworm")
public class BookWorm {

	@Id
	private Long id;
	@Column (name = "personal_code", unique = true)
	private String personalCode;
	private String name;
	private String surname;
	private Integer age;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bookWorm")
	private List<Rent> rents;
	
	public BookWorm() {
		
		
	}
	
	public BookWorm(Long id, String personalCode, String name, String surname, Integer age) {
		super();
		this.id = id;
		this.personalCode = personalCode;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonalCode() {
		return personalCode;
	}

	public void setPersonalCode(String personalCode) {
		this.personalCode = personalCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
