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
public class Cheque extends Payment {

	@Column(name="Cheque_No")
	private int chequeNo;
	
	@Column(name="Cheque_Type")
	private String chequeType;
}
