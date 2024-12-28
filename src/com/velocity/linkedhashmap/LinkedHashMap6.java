package com.velocity.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap6 {
	// Design method which return linkedhashmap object to that method
		public static LinkedHashMap getLinkedHashMapDemo() {
			LinkedHashMap hm = new LinkedHashMap();
			hm.put(10, "ram");
			hm.put(20, "shyam");
			hm.put(15, "vikas");
			hm.put(25, "yogesh");
			return hm;
		}

		public static void main(String[] args) {
			HashMap hm1 = getLinkedHashMapDemo();
			System.out.println(hm1);

		}

}
