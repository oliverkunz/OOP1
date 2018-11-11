package library.admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
		item.setLending(new Lending(customer, item, date));
		item.setState(State.LENT);
		return true;
	}
	
	public boolean addLending(Lending lending) {
		Item item = lending.getItem();
		if (!item.isAvailable() ) {
			return false;
		}
		lendings[this.lendingCounter++] = lending;
		item.setLending(lending);
		item.setState(State.LENT);
		return true;
	}
	
	
	public boolean returnItem(Item item, LocalDate date){
		if (item.isAvailable()) {
			return false;
		}
	    item.setState(State.AVAILABLE);
	    item.getLending().setReturnDate(date);
		return true;
	}
	

	public boolean isAvailable(Item item) {
		return item.isAvailable();
	}
	
	public long[] getAvailableItems(long[] ids) {
		List<Long> result = new ArrayList<>();

		Administration admin = Administration.getInstance();

		for (long id : ids) {
		    if (admin.findItem(id).isAvailable()) {
			result.add(id);
		    }
		}

		return Utils.listToArray(result);    
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
