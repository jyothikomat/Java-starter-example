package com.qa.java;

public class Flowchart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 3000;
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("c");
                //end of loop
			} else {
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
                    //end of loop
				} else {
					System.out.println("E");
					// end of loop
				}
			}
		} else {
			System.out.println("1");
			if (A > 100) {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
					// end of loop
				} else {
					System.out.println("4");
					if (A > 500) {
						System.out.println("6");
						// end of loop
					} else {
						System.out.println("7");
                        //end of loop
					}
				}
			} else {
				System.out.println("2");
				// end of loop
			}

		}

	}

}
