package com.class32;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		//Generic Array List
				ArrayList<String> strList = new ArrayList<>();
				strList.add("Jack");
				strList.add("John");
				strList.add("Yoni");
				strList.add("Nati");
				strList.add("Micky");
				//strList.add(10); not possible CE

				if (!strList.isEmpty()) {
					int mySize = strList.size();
					for (int y = 0; y < mySize; y++) {
						System.out.println(strList.get(y));
						System.out.println("---------------");
					}
					System.out.println(mySize);
				}
				
				//ArrayList can Generic and non-Generic
				//Non Generic	
				ArrayList alist=new ArrayList();
				alist.add("Hello");
				alist.add(100);//1
				alist.add(10.10);//2
				alist.add(true);
				alist.add('c');
				//int y=alist.get(1)+alist.get(2) --> CE ask to typecast
				
				System.out.println(alist);
				
				ArrayList<Double> list=new ArrayList<Double>();
				list.add(100.10);
				
				
	}

}
