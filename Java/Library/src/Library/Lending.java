import java.time.LocalDate;

public class Lending {
	
	private Customer customer;
	private Object object;
	private LocalDate startDate;
	private LocalDate returnDate;
	
	public Lending(Customer customer, Object object, LocalDate startDate) {
		this.customer = customer;
		this.object = object;
		this.startDate = startDate;
		
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	
	
}
