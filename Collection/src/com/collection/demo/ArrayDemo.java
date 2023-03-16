package com.collection.demo;

import java.util.ArrayList;

public class ArrayDemo {
	public static void main(String[]args) {
		ArrayList <String>list=new ArrayList<String>();
		list.add("ramesh");
		list.add("lalit");
		list.add("amol");
		list.add("satish");
		list.add("akash");
		
		for(String s:list)
		System.out.println(s);
		
	}

}
