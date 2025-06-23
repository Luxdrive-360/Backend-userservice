package com.luxdrive.UserService.User;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name; // e.g., ADMIN, CLIENT, DRIVER

	    @ManyToMany(mappedBy = "roles")
	    @JsonIgnore
	    private Set<Users> users = new HashSet<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<Users> getUsers() {
			return users;
		}

		public void setUsers(Set<Users> users) {
			this.users = users;
		}
	    
	    

		
}
