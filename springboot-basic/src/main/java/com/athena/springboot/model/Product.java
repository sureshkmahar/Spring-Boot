package com.athena.springboot.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "product")
@EntityListeners(AuditingEntityListener.class)
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	private String name;
	@NotBlank
	private double price;
	

}
