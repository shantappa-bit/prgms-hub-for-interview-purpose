package PRGMS;

import java.util.Random;

public class randomNumbergenerate {
	public static void main(String[] args) {
		// we use random class to generate a number
		// max limlit is 999
		// generate non decimal numbers
		Random rand = new Random();
		int size = rand.nextInt(10); // this will genetae a random nu betw 0 to 9
		// System.out.println(size);

		// generate decimal numbers
		double doub = rand.nextDouble();// btw 0.0 and <1.0 it will generate
		// System.out.println("double no is :"+doub);
		// approach 2
		// by using match class
		// by default it generates a deciaml numbers only
		double store = Math.random();
		System.out.println(store);

		// approach 3

		/*
		 * //by using random class we can generate deciaml and non decima l numbers
		 * Random r=new Random(); int output = r.nextInt(5); System.out.println(output);
		 * 
		 * //case 2
		 * 
		 * double decimal=r.nextDouble(); //System.out.println(decimal); // 0.0. <0.1
		 * //aprooach 2 double decimal1 = Math.random();
		 * //System.out.println(decimal1+" d bose"); //By using apache commons lang api
		 * 
		 * String stored2 = RandomStringUtils.randomNumeric(2);
		 * System.out.println(stored2+"  last appriach");
		 * 
		 * String weekoff = RandomStringUtils.randomAlphanumeric(10);
		 * System.out.println(weekoff+"  tea ");
		 * 
		 */

	}

}
