package com.learn.lombok.beans;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class MacUser extends User {

	private String ram;
	private String hdd;
	private String inches;

}

/*
 * @ToString(callSuper = true) -> Will print all filed in base class also
 * 
 * @EqualsAndHashCode(callSuper = false) -> Equals will be based on MacUser
 * Alone If callSuper = true , then it will be based on MacUser & User id as
 * specified in Annotation of base class
 */