package com.learn.lombok;

import com.learn.lombok.beans.MacUser;
import com.learn.lombok.beans.User;
import com.learn.lombok.beans.WinUser;

/*
 * To String & EqualsHashcode
 * 
 */
public class LambokMain2 {

	public static void main(String[] args) {

		/*
		 * @ToString(callSuper = true)
		 * 
		 * @EqualsAndHashCode(callSuper = false)
		 */
		MacUser mu1 = new MacUser("2GB", "512", "14");
		MacUser mu2 = new MacUser("4GB", "512", "14");
		MacUser mu3 = new MacUser("2GB", "512", "14");

		System.out.println(mu1.toString());
		System.out.println(mu2.toString());
		System.out.println(mu3.toString());

		System.out.println(mu1.equals(mu2));
		System.out.println(mu1.equals(mu3));

		/*
		 * 
		 * Equals will be Based on WinUser & User id
		 * 
		 */

		User wu1 = new WinUser("2GB", "512", "14");
		User wu2 = new WinUser("4GB", "512", "14");
		User wu3 = new WinUser("2GB", "512", "14");

		System.out.println("# # #");
		System.out.println(wu1.toString());
		System.out.println(wu2.toString());
		System.out.println(wu3.toString());

		System.out.println(wu1.equals(wu2));
		System.out.println(wu1.equals(wu3));
		System.out.println("# # #");
		wu1.setId(1l);
		wu2.setId(2l);
		wu3.setId(3l);

		System.out.println(wu1.toString());
		System.out.println(wu2.toString());
		System.out.println(wu3.toString());

		System.out.println(wu1.equals(wu2));
		System.out.println(wu1.equals(wu3));
		System.out.println("# # #");
		wu2.setId(1l);
		wu3.setId(1l);

		System.out.println(wu1.toString());
		System.out.println(wu2.toString());
		System.out.println(wu3.toString());
		System.out.println(wu1.equals(wu2));
		System.out.println(wu1.equals(wu3));
	}

}
