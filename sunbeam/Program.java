package com.sunbeam;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		List <Book> list= new ArrayList<> ();
		Collections.addAll(list,
				new Book(4,"sham chi Aai","Novel",100.00),
				new Book(1,"chavva","Novel",200.45),
				new Book(5,"mrutunjay","Novel",200.45),
				new Book(2,"Swami","Novel",200.45),
				new Book(6,"Radheya","Novel",200.45),
				new Book(3,"kosala","Novel",200.45)
);
		for(Book b : list) {
			System.out.println(b.toString());
		}
		System.out.println();
		int index = 3;
		Book bk = list.get(index); 
		System.out.println(bk.toString());
		
		int id = 5; 
		Book key = new Book(id, null, null, id); 
		key.setId(id);
		
		if(list.contains(key)) {
			list.remove(key); 
		}
		for(Book b : list) {
			System.out.println(b.toString());
		}
		
		class SortByID implements Comparator<Book>{

			@Override
			public int compare(Book x, Book y) {
				int diff = x.getId() - y.getId(); 
				return diff; 
			}
			
		}
		System.out.println("Sort by ID");
	
		Collections.sort(list);
		for(Book b : list) {
			System.out.println(b.toString());
		}
		
	}
	}


