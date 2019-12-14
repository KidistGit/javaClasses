package com.class34;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {
		Set<Task3Student> stu = new LinkedHashSet<>();
		stu.add(new Task3Student("John", 2413));
		stu.add(new Task3Student("Bob", 2490));
		stu.add(new Task3Student("Nolawi", 2423));
		stu.add(new Task3Student("Mack", 243));

		for (Task3Student task:stu) {
			System.out.println(task.name);
		}
		
		System.out.println(stu.size());
		
		
		Iterator<Task3Student> it = stu.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().StudentID);
			
		}

	}

}
