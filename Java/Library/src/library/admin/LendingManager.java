package library.admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import library.data.Book;
import library.data.Customer;
import library.data.DataObject;
import library.data.Film;
import library.data.Item;
import library.data.Journal;
import library.data.Lending;
import library.data.Music;
import library.data.State;

public class LendingManager {
	private List<Lending> lendings;
	private int lendingCounter = 0;
	
	public LendingManager() {
		this.lendings = new ArrayList<>();
	}
	
	public Lending[] getLendings() {
		return (Lending[]) this.lendings.toArray();
	}
	
	public boolean isItemAvailable(Item item) {
		boolean lentOut = false;
		for (Lending lending : lendings) {
			if (lending.getItem().equals(item)) {
				lentOut = true;
				if (lending.getItem().isAvailable())		
				return true;
			}
		}
		if (lentOut == false) {
			return true;
		}
		return false;
	}
	
	public boolean addLending(Customer customer, Item item, LocalDate date) {
		if (item.isAvailable()) {
			this.lendings.add(new Lending(customer, item, date));
		} else {
			return false;
		}
		return true;
	}
	
	public boolean returnItem(Item item, LocalDate date) {
		for(Lending lending : this.lendings) {
			if(lending.getItem().equals(item) && lending.getReturnDate() == null) {
				lending.setReturnDate(date);
				lending.getItem().setState(State.AVAILABLE);
				return true;
			}
		}
		
		return false;
	}

	public LocalDate getLendingEndDate(Item item) {
		Lending lastLending = null;
		
		for(Lending lending : lendings) {
			if(lending.getItem().equals(item) && (lastLending == null || lending.getStartDate().isAfter(lastLending.getStartDate()))) {
				lastLending = lending;
			}
		}
		
		if(lastLending != null && lastLending.getReturnDate() != null) {
			return lastLending.getReturnDate();
		}
		
		if(lastLending != null && lastLending.getStartDate() != null) {
			return lastLending.getStartDate().minusMonths(-1);
		}		
		
		return LocalDate.now();
	}

}
