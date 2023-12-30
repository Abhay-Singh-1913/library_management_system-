package edu.qsp.lms.view;

import java.util.Scanner;

import edu.qsp.lms.controller.*;
import edu.qsp.lms.model.*;



public class View {
	static Scanner myInput = new Scanner(System.in);
	static Library library = new Library();
	static Controller controller = new Controller();
	
	static {
		System.out.println();
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
		System.out.println();
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
		do {
			System.out.println();
			System.out.println("***𝒘𝒆𝒍𝒄𝒐𝒎𝒆 to "+library.getLibraryName()+"***");
			System.out.println(" ______________________________ ");
			System.out.println("|         --- MENU ---         |");
			System.out.println("|==============================|");
			System.out.println("| Select Operation to Perform  |");
			System.out.println("|------------------------------|");
			System.out.println("| 1.Add Book                   |");
			System.out.println("| 2.Remove Book                |");
			System.out.println("| 3.Update Book                |");
			System.out.println("| 4.Get book by name           |");
			System.out.println("| 5.Get all book               |");
			System.out.println("| 0.Exit                       |");
			System.out.println("|______________________________|");
			
			
			System.out.println("-------------------------------------------------");
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
				
				
				controller.addBook(book1);
				break;
			case 2:
				System.out.println("-------------------------------------------------");
				System.out.print("Enter name of Book to be removed : ");
				String bookToBeRemoveBook = myInput.nextLine();
				
				
				System.out.println("-------------------------------------------------");
				boolean verifyRemoveBook = controller.removeBook(bookToBeRemoveBook);
				
				if (verifyRemoveBook) {
					System.out.println("-------------------------------------------------");
					System.out.println("///////-----Book removed Successfully-----///////");
					System.out.println("-------------------------------------------------");
				} else {
					System.out.println("-------------------------------------------------");
					System.out.println("/////-----Book Does not Found in Library-----////");
					System.out.println("-------------------------------------------------");
				}
				break;
			case 3:
				Book book3 = new Book();
				System.out.println("Enter name of book to update : ");
				String bookToUpdate = myInput.nextLine();
				book3.setBookName(bookToUpdate);
				
				System.out.println("Enter the Update Price of Book : ");
				double newPrice = myInput.nextDouble();
				myInput.nextLine();
				
				
				if (controller.updateBookPriceByBookName(book3,newPrice)) {
					System.out.println("Book Price Updated");
				} else {
					System.out.println("Book does not exit in Library");
				}

				break;
			case 4:
				System.out.println("Enter book name for search :->");
				String bookToGet = myInput.nextLine();
				Book book = controller.searchBook(bookToGet);
				
				if (book != null) {
					System.out.println(book);
				} else {
					System.out.println("Book does not exit in Library : ");
				}
				break;
			case 5:
				System.out.println(controller.getAllBooks());
				break;

			default:
				break;
			}
		} while (true);

	}
}
