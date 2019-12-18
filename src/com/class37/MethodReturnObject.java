package com.class37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MethodReturnObject {

	public static void main(String[] args) {
		List<String> list = retrunStringList("Java", "My favorite subject");
		System.out.println(list);
		//Scanner scan=returnScanner(;)
	}

// create a method that will return an object of Scanner Class
	public static Scanner returnScanner() {
		Scanner scan = new Scanner(System.in);
		return scan;

	}

	// Create a method that will return an object of List class
	public static List<String> retrunStringList(String str, String str1) {
		List<String> list = new ArrayList<>();
		list.add(str);
		list.add(str1);
		return list;

	}

	// Create a method that will return an object of Map class
	public static Map<String, String> returnMap(String key, String value, String key1, String value1) {
		Map<String, String> map = new HashMap<>();
		map.put(key, value);
		map.put(key1, value1);
		return map;

	}
}
