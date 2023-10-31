package jmaster.io.project2.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

@Entity
@EntityListeners(AuditingEntityListener.class) // phải có thằng này thì cột create_at trong csdl mới gen ra được.
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	//@NotBlank // thằng này của validation, nếu thằng name bị trống thì nó bắn ra exception
	//@NotBlank này dùng để validation trên view nên mình để trên DTO thui.
	private String name;

	@Column(name = "avatar")
	private String avatar;

	@Column(unique = true) // unique = true -> giá trị là duy nhất
	private String username;
	@Column(unique = true)
	private String password;

	@DateTimeFormat(pattern = "dd/MM/yyyy") 
	private Date birthdate;

	// tác dụng: đánh dấu 1 trường (field) trong 1 lớp entity là không cần thiết để
	// lưu trữ trong cơ sở dữ liệu.
//	@javax.persistence.Transient
//	private MultipartFile file;
	// Vì dùng DTO rồi nên không dùng đến thằng Multipartfile này nữa.

	@CreatedDate // tự động lưu trữ thông tin về thời gian khi 1 đối tượng mới được tạo ra trong csdl.
	private Date createdAt;
	
//	@LastModifiedDate  // ghi lại thời gian cuối cùng được update
//	private Date lastUpdateAt;
	
	// Không bắt buộc
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER) // ko ảnh hưởng đến database
	private List<UserRole> userRoles;
	
	@ManyToMany(mappedBy = "users", fetch = FetchType.LAZY) // ko ảnh hưởng đến database
	private List<Group> groups; 

	
	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public User() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

//	public MultipartFile getFile() {
//		return file;
//	}
//
//	public void setFile(MultipartFile file) {
//		this.file = file;
//	}

}
