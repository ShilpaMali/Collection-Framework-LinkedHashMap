package com.velocity.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {

		LinkedHashMap lhm = new LinkedHashMap(); // it will create hashmap with 16 capacity
		lhm.put(10, "ram"); //put() is used to add elements
		lhm.put(20, "shyam"); //override the previous key with current key
		lhm.put(15, "vikas");
		lhm.put(25, "yogesh"); //String,String-Integer,Integer,
		// first way
		//lhm.put(null,"sandip"); //can we pass key as null in hashmap ? yes we can 
		//lhm.put(40,null); //can we pass value as null in hashmap ? yes
		//lhm.put(null,null); //can we pass both as null ? yes
		System.out.println(lhm);
	}

}
