package ua.lviv.lgs.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"), name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String passwordConfirm;

	private int faculty;

	private int mark1;
	private int mark2;
	private int mark3;

	private int certificate;

	private int confirmed;

	@Enumerated(EnumType.STRING)
	private UserRole role;

	public User() {
	}

	public User(User user) {
		this.id = user.id;
		this.firstName = user.firstName;
		this.lastName = user.lastName;
		this.email = user.email;
		this.password = user.password;
		this.faculty = user.faculty;
		this.mark1 = user.mark1;
		this.mark2 = user.mark2;
		this.mark3 = user.mark3;
		this.certificate = user.certificate;
		this.confirmed = user.confirmed;
		this.role = user.role;
	}

	public User(String firstName, String lastName, String email, String password, int faculty, int mark1, int mark2,
			int mark3, int certificate, int confirmed) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.faculty = faculty;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.certificate = certificate;
		this.confirmed = confirmed;
	}

	public User(String firstName, String lastName, String email, String password, int faculty, int mark1, int mark2,
			int mark3, int certificate, int confirmed, UserRole role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.faculty = faculty;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.certificate = certificate;
		this.confirmed = confirmed;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public int getFaculty() {
		return faculty;
	}

	public void setFaculty(int faculty) {
		this.faculty = faculty;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public int getCertificate() {
		return certificate;
	}

	public void setCertificate(int certificate) {
		this.certificate = certificate;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", faculty=" + faculty + ", mark1=" + mark1 + ", mark2=" + mark2
				+ ", mark3=" + mark3 + ", certificate=" + certificate + ", confirmed=" + confirmed + ", role=" + role
				+ "]";
	}

}
