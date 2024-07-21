package com.dps.aiotracker.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AIOT_COACH")
public class Coach {
	@Id
    @Column(name="id")
    @SequenceGenerator(name = "AIOT_COACH_SEQ", sequenceName = "AIOT_COACH_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AIOT_COACH_SEQ")
    private Long id;
	
	@Column(name="name")
	private String name;
	 
	@Column(name="email")
	String email;
}
