package Library;
import java.time.LocalDate;

public class Lending {
	
	private Customer borrower;
	private Object object;
	private LocalDate startDate;
	private LocalDate returnDate;
	
	public Lending(Customer borrower, Object objects, LocalDate startDate) {
		this.borrower = borrower;
		this.object = objects;
		this.startDate = startDate;
		
	}

	public Customer getBorrower() {
		return borrower;
	}

	public Object getDataObject() {
		return object;
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
		return "Lending [borrower=" + borrower + ", object=" + object + ", startDate=" + startDate + ", returnDate="
				+ returnDate + "]";
	}	
}
