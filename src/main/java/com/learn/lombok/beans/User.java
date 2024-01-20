package com.learn.lombok.beans;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = { "lastName", "age" })   // Without this ,if we call then o/p is User@cac736f
@EqualsAndHashCode(of = {"id"})
public class User {
	private Long id;
	private String firstName;
	private @Getter(value = AccessLevel.NONE) String lastName;
	private int age;
}

/*
 * 
 * @Getter(value = AccessLevel.NONE) -> Added to a field , it wont be availabe
 * on getter
 * 
 * 
 * @EqualsAndHashCode(of = {"id"}) -> based on id , equals & hashcode will be generated
 * 
 */