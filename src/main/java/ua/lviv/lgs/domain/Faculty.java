package ua.lviv.lgs.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotEmpty
	private String faculty;
	@NotEmpty
	private String subject1;
	@NotEmpty
	private String subject2;
	@NotEmpty
	private String subject3;

	@Min(0)
	@Max(500)
	private int requirement;

	public Faculty() {
	}

	public Faculty(@NotEmpty String faculty, @NotEmpty String subject1, @NotEmpty String subject2,
			@NotEmpty String subject3, @Min(0) @Max(500) int requirement) {
		super();
		this.faculty = faculty;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.requirement = requirement;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}

	public String getSubject3() {
		return subject3;
	}

	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}

	public int getRequirement() {
		return requirement;
	}

	public void setRequirement(int requirement) {
		this.requirement = requirement;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + 
				", faculty=" + faculty + 
				", subject1=" + subject1 + 
				", subject2=" + subject2 + 
				", subject3=" + subject3 + 
				", requirement=" + requirement + 
				"]";
	}

}
