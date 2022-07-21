package com.Inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

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
@PrimaryKeyJoinColumn(referencedColumnName="Id")
public class Card extends Payment {

	@Column(name="Card_No")
	private int cardNO;
	
	@Column(name="Card_Type")
	private String cardType;
}
