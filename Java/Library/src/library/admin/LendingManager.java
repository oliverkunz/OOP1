package library.admin;

import java.time.LocalDate;

import library.data.*;

public class LendingManager {
	private Lending[] lendings;
	private int lendingCounter = 0;
	
	public LendingManager() {
		lendings = new Lending[50];
	}
	
	public Lending[] getLendings() {
		return lendings;
	}
	
	public boolean addLending(Customer customer, Item item, LocalDate date) {
		if (!item.isAvailable()) {
			return false;
		}
		// Todo
		return true;
	}
	
	public boolean returnItem(Item item, LocalDate date){
	    // Todo
		return true;
	}
	

	public boolean isAvailable(Item item) {
		return item.isAvailable();
	}
	
	public long[] getAvailableItems(long[] ids) {
		long[] result = null;
		// Todo
		return result;
	}
	
	
	public LocalDate getLendingEndDate(Item item) {
		Lending lending = item.getLending();
		if (lending != null)
			return lending.getReturnDate();
		return LocalDate.now();
	}
	
	public LocalDate getTimeLimit(Item item) {
		Lending lending = item.getLending();
		if (lending != null)
			return lending.getTimeLimit();
		return LocalDate.now();
	}
	

	public void printLendings() {
		for (Lending l : lendings) {
			System.out.println(l.toString());
		}
	}



}
