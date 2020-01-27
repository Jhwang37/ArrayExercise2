package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args){
    	String[] hello = {"W","E","L","C","O","M","E"};
    	String temp = hello[hello.length -1];
    	for (int i = hello.length / 2; i >=0; i--){
    		hello[i+1] = hello[i];
    	}
    	hello[0] = temp;
    	for(String x: hello){
			System.out.println(x);
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = scan.nextLine();
		//make new array with the length of string
		char[] ch = new char[word.length()];
		//looop through array
		for (int i = 0; i < word.length(); i++) {
			ch[i] = word.charAt(i);//index i place the word at character at index i
		}
		//enahnced for loop to print out characters in list.
		for (char x : ch) {
			System.out.println(x);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i ++){
			System.out.println("Enter a number: ");
			int enter = scan.nextInt();
			list.add(enter);
		}
		for(int i = 0; i <= list.size()-1; i ++){
			for (int j = i + 1; j <= list.size()-1; j++){
				if(list.get(i).equals(list.get(j))){
					System.out.println("removed " + list.get(i));
					list.remove(i);
				}
			}
		}
		System.out.println(list);

		int[] list1 = {1,7,6,5,9};
		int[] list2 = {2,7,6,3,4};

		for(int i = 0; i < list1.length; i++){
			for (int j = 0; j < list1.length; j++){
				if(list1[i] + list2[j] == 13){
					System.out.println(list1[i] + "+" + list2[j] + " = 13");
				}
			}
		}
		boolean start = true;
		while(start) {
			int[] list3 = new int[10];
			for (int i = 0; i <= list3.length - 1; i++) {
				System.out.println("Enter a number: ");
				int newNum = scan.nextInt();
				list3[i] = newNum;
			}
			for(int j =0; j <= list3.length-1;j++){
				if(list3[j] % 3 ==0){
					System.out.println( "Odd number:  " + list3[j]);
				} else if (list3[j] % 2 ==0){
					System.out.println("Even number: " + list3[j]);
				}
			}
			start = false;
		}
	}
}
