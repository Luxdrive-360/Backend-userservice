package com.luxdrive.UserService.User;

import com.luxdrive.UserService.constant.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // ✅ Integer-based auto-generated primary key

	private String name;

	@Column(unique = true)
	private String email;

	private String password;

	private String mobile;

	private String status;

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(
//        name = "user_roles", 
//        joinColumns = @JoinColumn(name = "user_id"), 
//        inverseJoinColumns = @JoinColumn(name = "role_id")
//    )
//    private Set<Role> roles = new HashSet<>();
	@Enumerated(EnumType.STRING)
	private Role role;
}
