package java.Project02_BookManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {
	
	public static int bookNo = 1000; // Global Değişken
	
	public static void main(String[] args) {

		List <Book> bookList = new ArrayList<>();
		addAllBooks(bookList);
		menu(bookList);

	}

	 private static void addAllBooks(List <Book> list) {
		 Book book1 = new Book(++bookNo, "Uncle John", "John Kenny", 2001, 11);
		 Book book2 = new Book(++bookNo, "All Kids are happy", "Alisha Bet", 2005, 10);
		 Book book3 = new Book(++bookNo, "Lonely", "Alex Iston", 2005, 21);
		 Book book4 = new Book(++bookNo, "YOU", "George Geor", 2005, 30);
	
		 list.add(book1);
		 list.add(book2);
		 list.add(book3);
		 list.add(book4);
	 }

	 private static void menu(List <Book> liste) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("========= BOOK MANAGEMENT=============");
		 System.out.println(" 1: Add Book " + "\n 2: Delete Book with ID" + "\n "
		 		+ "3: Show All Books"  + "\n 4: END \n");
		 System.out.print("Please chooce");
		 
		 int choose = scan.nextInt();
		 
		 switch (choose) {
		 	case 1:
		 		addBook(liste);
		 		break;
	        case 2:
	        	deleteBookWithNo(liste);
	           break;
	        case 3:
	            showAllBooks(liste);
	            break;
	        case 4:
	            end();
	            break;
	        default:
	           System.out.println("Wrong insertion. Please try again");
	           menu(liste);
	        }
	    }
	 
	 	private static void addBook(List <Book> liste) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter Book name");
	        String bookName = scan.nextLine();
	        System.out.println("Enter Author name");
	        String authorName = scan.nextLine();
	        System.out.println("Enter publication year");
	        int pulicationYear = scan.nextInt();
	        System.out.println("Enter Book price");
	        double price = scan.nextDouble();
	        Book book = new Book(++bookNo,bookName, authorName, pulicationYear, price);
	        liste.add(book);
	        System.out.println(book.toString() + " added");
	        menu(liste);
	    }

	    private static void showAllBooks(List <Book> list) {
	        for (Book k  : list){
	        	System.out.println(k.toString());
	        }
	        menu(list);
	    }

	    private static void deleteBookWithNo(List <Book> list) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter no of Book you want to delete");
	        int bookNo = scan.nextInt();
	        for(Book k : list) {
	        	if(k.getNo() == bookNo) {
	        		System.out.println(k.toString() + " deleted");
	        		list.remove(k);
	        		menu(list);
	           	}
	        }
	    	System.out.println(bookNo + " No didnt found");
	        menu(list);
	    }

	    private static void end() {
	        System.out.println("Thnak for using the Managament system");

	    }
}

