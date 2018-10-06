import java.time.LocalDate;

public class Lending {
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalDate returnDate;
	private Customer customer;
	private Object object;
	
	
	public Lending(LocalDate startDate, LocalDate endDate, LocalDate returnDate, Customer customer, Object object) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.returnDate = returnDate;
		this.customer = customer;
		this.object = object;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
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
	
	

}
