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
		this.item.setState(State.LENT);
		
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lending other = (Lending) obj;
		if (borrower == null) {
			if (other.borrower != null)
				return false;
		} else if (!borrower.equals(other.borrower))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	
}
