package library.data;
import java.time.LocalDate;

public class Lending {
	
	private Customer borrower;
	private Item item;
	private LocalDate startDate;
	private LocalDate returnDate;
	
	public Lending(Customer borrower, Item item, LocalDate startDate) {
		this.borrower = borrower;
		this.item = item;
		this.startDate = startDate;
		
	}

	public Customer getBorrower() {
		return borrower;
	}

	public Item getItem() {
		return item;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}
	
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	public LocalDate getTimeLimit() {
		return this.getStartDate().minusMonths(-1);
	}

	@Override
	public String toString() {
		return "Lending [borrower=" + borrower + ", item=" + item + ", startDate=" + startDate + ", returnDate="
				+ returnDate + "]";
	}

	
}
