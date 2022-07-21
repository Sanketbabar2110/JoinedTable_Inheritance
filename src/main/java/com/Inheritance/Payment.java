package com.Inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	@Column(name="Amount")
	private int amount;
}
