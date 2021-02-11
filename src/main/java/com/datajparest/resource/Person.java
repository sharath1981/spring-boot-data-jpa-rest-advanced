package com.datajparest.resource;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private LocalDate dob;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@ElementCollection
	private Set<String> vehicles = new HashSet<>();
	
	@CreationTimestamp
	private LocalDateTime createDateTime;
	
	@UpdateTimestamp
    private LocalDateTime updateDateTime;

}
