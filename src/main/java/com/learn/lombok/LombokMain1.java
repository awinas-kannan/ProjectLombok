package com.learn.lombok;

import com.learn.lombok.beans.User;

public class LombokMain1 {

	public static void main(String[] args) {

		User u1 = new User(1l, "Awi", "MR", 24);

		System.out.println(u1.toString());

		User u2 = new User(1l, "u2", "u2", 25);

		User u3 = new User(2l, "u2", "u2", 25);
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
	}

}
