package library.data;
import java.time.LocalDate;

public class Reservation {
	private Customer customer;
	private Object object;
	private LocalDate reservationDate;
	
	public Reservation(Customer customer, Object object, LocalDate reservationDate) {
		this.customer = customer;
		this.object = object;
		this.reservationDate = reservationDate;
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

	public LocalDate getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}	

}
