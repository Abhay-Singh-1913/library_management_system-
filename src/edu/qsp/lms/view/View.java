package edu.qsp.lms.view;

import java.util.Scanner;

import edu.qsp.lms.controller.*;
import edu.qsp.lms.model.*;



public class View {
	static Scanner myInput = new Scanner(System.in);
	static Library library = new Library();
	static Controller controller = new Controller();
	
	static {
		System.out.println("\u001b[33m");
		System.out.println();
		System.out.print("██╗░░░░░██╗██████╗░██████╗░░█████╗░██████╗░██╗░░░██╗	");System.out.println("███╗░░░███╗░█████╗░███╗░░██╗░█████╗░░██████╗░███╗░░░███╗███████╗███╗░░██╗████████╗");
		System.out.print("██║░░░░░██║██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚██╗░██╔╝	");System.out.println("████╗░████║██╔══██╗████╗░██║██╔══██╗██╔════╝░████╗░████║██╔════╝████╗░██║╚══██╔══╝");
		System.out.print("██║░░░░░██║██████╦╝██████╔╝███████║██████╔╝░╚████╔╝░	");System.out.println("██╔████╔██║███████║██╔██╗██║███████║██║░░██╗░██╔████╔██║█████╗░░██╔██╗██║░░░██║░░░");
		System.out.print("██║░░░░░██║██╔══██╗██╔══██╗██╔══██║██╔══██╗░░╚██╔╝░░	");System.out.println("██║╚██╔╝██║██╔══██║██║╚████║██╔══██║██║░░╚██╗██║╚██╔╝██║██╔══╝░░██║╚████║░░░██║░░░");
		System.out.print("███████╗██║██████╦╝██║░░██║██║░░██║██║░░██║░░░██║░░░	");System.out.println("██║░╚═╝░██║██║░░██║██║░╚███║██║░░██║╚██████╔╝██║░╚═╝░██║███████╗██║░╚███║░░░██║░░░");
		System.out.print("╚══════╝╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░	");System.out.println("╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝░╚═════╝░╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░");
		System.out.println();
		System.out.println("	░██████╗██╗░░░██╗░██████╗████████╗███████╗███╗░░░███╗");
		System.out.println("	██╔════╝╚██╗░██╔╝██╔════╝╚══██╔══╝██╔════╝████╗░████║");
		System.out.println("	╚█████╗░░╚████╔╝░╚█████╗░░░░██║░░░█████╗░░██╔████╔██║");
		System.out.println("	░╚═══██╗░░╚██╔╝░░░╚═══██╗░░░██║░░░██╔══╝░░██║╚██╔╝██║");
		System.out.println("	██████╔╝░░░██║░░░██████╔╝░░░██║░░░███████╗██║░╚═╝░██║");
		System.out.println("	╚═════╝░░░░╚═╝░░░╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░░░░╚═╝");
		System.out.println("\u001b[0m");
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.print("Enter name of library :->");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		System.out.println("-------------------------------------------------");
		
		System.out.println("-------------------------------------------------");
		System.out.print("Enter library Address :->");
		String libraryAddress = myInput.nextLine();
		library.setLibraryAddress(libraryAddress);
		System.out.println("-------------------------------------------------");
		
		System.out.println("-------------------------------------------------");
		System.out.print("Enter library pincode :->");
		int libraryPincode = myInput.nextInt();
		myInput.nextLine();
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.println();
		
		library.setPincode(libraryPincode);
	}

	public static void main(String[] args) {
		final String red = "\u001b[31;1m";
		final String white = "\u001b[37;1m";
		final String green = "\u001b[32;1m";
		final String reset = "\u001b[0m";
		boolean Flag = true;
		do {
			System.out.println("\u001b[33m");
			System.out.println("***Welcome to "+library.getLibraryName()+"***");
			System.out.println("________________________________");
			System.out.println("|				MENU			  ");
			System.out.println("|==============================|");
			System.out.println("| Select Operation to Perform  |");
			System.out.println("|------------------------------|");
			System.out.println("| 1.Add Book					 |");
			System.out.println("| 2.Remove Book				 |");
			System.out.println("| 3.Update Book				 |");
			System.out.println("| 4.Get book by name			 |");
			System.out.println("| 5.Get all book				 |");
			System.out.println("| 0.Exit						 |");
			System.out.println("|______________________________|"+reset);
			
			
			System.out.println(white+"-------------------------------------------------");
			System.out.print("Enter Your Choice Here :- ");
			int userChoice = myInput.nextInt();
			myInput.nextLine();
			System.out.println("-------------------------------------------------");
			System.out.println();
			
			
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("---EXITED---");
				System.exit(0);
				Flag = false;
				break;
			case 1:
				Book book1 = new Book();
				System.out.println("-------------------------------------------------");
				System.out.print("Enter Book name :->");
				book1.setBookName(myInput.nextLine());
				
				System.out.println("-------------------------------------------------");
				System.out.print("Enter book author :->");
				book1.setBookAuthor(myInput.nextLine());
				
				System.out.println("-------------------------------------------------");
				System.out.print("Enter book price :->");
				book1.setBookPrice(myInput.nextDouble());
				myInput.nextLine();
				
				System.out.println("-------------------------------------------------");
				System.out.print("Enter Pulication :->");
				book1.setPublication(myInput.nextLine());
				System.out.println("-------------------------------------------------");
				
				if (controller.addBook(book1)) {
					System.out.println(green+"-------------------------------------------------");
					System.out.println("///////-----Book Added Successfully-----///////");
					System.out.println("-------------------------------------------------"+reset);
				} else {
					System.out.println(red+"-------------------------------------------------");
					System.out.println("///////-----Book failed to Add   --------///////");
					System.out.println("-------------------------------------------------"+reset);
				}
				break;
			case 2:
				System.out.println("-------------------------------------------------");
				System.out.print("Enter name of Book to be removed : ");
				String bookToBeRemoveBook = myInput.nextLine();
				System.out.println("-------------------------------------------------");
				
				if (controller.removeBook(bookToBeRemoveBook)) {
					System.out.println(green+"-------------------------------------------------");
					System.out.println("///////-----Book removed Successfully-----///////");
					System.out.println("-------------------------------------------------"+reset);
				} else {
					System.out.println(red+"-------------------------------------------------");
					System.out.println("/////-----Book Does not Found in Library-----////");
					System.out.println("-------------------------------------------------"+reset);
				}
				break;
				
			case 3:
				Book book3 = new Book();
				System.out.println("-------------------------------------------------");
				System.out.println("Enter name of book to update : ");
				String bookToUpdate = myInput.nextLine();
				
				System.out.println("-------------------------------------------------");
				book3.setBookName(bookToUpdate);
				
				System.out.println("-------------------------------------------------");
				System.out.println("Enter the Update Price of Book : ");
				double newPrice = myInput.nextDouble();
				myInput.nextLine();
				
				System.out.println("-------------------------------------------------");
				
				if (controller.updateBookPriceByBookName(book3,newPrice)) {
					System.out.println(green+"-------------------------------------------------");
					System.out.println("///////---Book Price Updated Successfully---///////");
					System.out.println("-------------------------------------------------"+reset);
				} else {
					System.out.println(red+"-------------------------------------------------");
					System.out.println("/////-----Book Does not Found in Library-----////");
					System.out.println("-------------------------------------------------"+reset);
					System.out.println("Book Price Updated");
				}

				break;
			case 4:
				System.out.println("-------------------------------------------------");
				System.out.println("Enter book name for search :->");
				String bookToGet = myInput.nextLine();
				System.out.println("-------------------------------------------------");
				Book book = controller.searchBook(bookToGet);
				
				if (book != null) {
					System.out.println(green+"------------------------------------");
					System.out.println("///////-----Book Details-----///////");
					System.out.println("Book Name : "+book.getBookName());
					System.out.println("Book Author : "+book.getBookAuthor());
					System.out.println("Book Publication : "+book.getPublication());
					System.out.println("Book Price : "+book.getBookPrice());
					System.out.println("------------------------------------"+reset);
					
				} else {
					System.out.println(red+"-------------------------------------------------");
					System.out.println("/////-----Book Does not Found in Library-----////");
					System.out.println("-------------------------------------------------"+reset);
				}
				break;
			case 5:
				List<Book> allBooks = controller.getAllBooks();
				System.out.println(white+"------------------------------------");
				System.out.println("///////-----Book Details-----///////");
				for (Book booklist : allBooks) {
					System.out.println("Book Name : "+booklist.getBookName());
					System.out.println("Book Author : "+booklist.getBookAuthor());
					System.out.println("Book Publication : "+booklist.getPublication());
					System.out.println("Book Price : "+booklist.getBookPrice());
					System.out.println("------------------------------------"+reset);
					System.out.println();
				}
				System.out.println();
				break;

			default:
				System.out.println(red+"-------------------------------------------------");
				System.out.println("/////-----Enter Choice is not valid  -----////");
				System.out.println("-------------------------------------------------"+reset);
				break;
			}
		} while (Flag);
		System.out.println(green+"--------Thank You For Using--------");

	}
}
