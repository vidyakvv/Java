import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BetweenTwoSets {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();

		a.add(1);
//		a.add(99);
//		a.add(98);
//		a.add(97);
//		a.add(96);
//		a.add(95);
//		a.add(94);
//		a.add(93);
//		a.add(92);
//		a.add(91);
//		b.add(1);
//		b.add(2);
//		b.add(3);
//		
//		b.add(4);
//		b.add(5);
//		b.add(6);
//		b.add(7);
//		b.add(8);
//		b.add(9);
		b.add(100);
		
		int highest = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i) > highest) {
				highest = a.get(i);
			}
		}
		System.out.println(highest);

		int lcm = 1;
		int counter = 1;
		int looptrack = 0;
		int highest1 = highest;
		while ((highest1 <= 100) && (looptrack != a.size())) {
			Thread.sleep(100);

			for (int i = 0; i < a.size(); i++) {
				if (highest1 % (a.get(i)) == 0) {
					looptrack++;
					if (looptrack == a.size()) {
						lcm = highest1;
						System.out.println("LCM in if: "+lcm);
						System.out.println("In for loop: if");
						break;
					}

					else {
						continue;
					}
				} else {
					looptrack = 0;
					highest1 = highest*(++counter);
					System.out.println("In for loop: else");
					break;
				}
			}
			
			System.out.println("In while loop");
		}
		System.out.println("LCM = " + lcm);
		
		int lowest = b.get(0);
		for (int i = 1; i < b.size(); i++) {
			if (b.get(i) < lowest) {
				lowest = b.get(i);
			}
		}
		System.out.println(lowest);

		int count = 0;
		//boolean found = false;
		int lcm1 =lcm;
		int inc =1;
		int solution = 0;
		
	
		
		while ((lcm1 <= 100)&&(lcm1>=1)){
			Thread.sleep(100);
			for (int i = 0; i < b.size(); i++) {
				if ((b.get(i) % lcm1) == 0) {
					count++;
					//System.out.println("count= "+count);
					//System.out.println("b size =  "+b.size());
					if (count == b.size()) {
						System.out.println("LCM1 : "+ lcm1);
						System.out.println("In for loop: if");
						solution++;
						count=0;
						break;
					} else {
						continue;
					}
				} else {
					//count=0;
					//lcm1=lcm*(++inc);
					System.out.println("In for loop: else");
					break;
				}
			}
			count=0;
			lcm1=lcm*(++inc);
			
			
			System.out.println("In while loop");
		}
		System.out.println(solution);
	}

}
