package library.data;

public class Item {
	private long id;
	private State state;
	private Lending lending;
	
	public Item(long id) {
		this.id = id;
		state = State.AVAILABLE;
	}
	
	public boolean isAvailable() {
		return state == State.AVAILABLE;
	}

	public long getId() {
		return id;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public Lending getLending() {
		return lending;
	}

	public void setLending(Lending lending) {
		this.lending = lending;
	}

	public enum State {
		AVAILABLE, LENT, DAMAGED, RESERVED
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", state=" + state + ", lending=" + lending + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (lending == null) {
			if (other.lending != null)
				return false;
		} else if (!lending.equals(other.lending))
			return false;
		if (state != other.state)
			return false;
		return true;
	}
	
}
