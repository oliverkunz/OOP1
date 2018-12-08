package library.data;

public abstract class Item implements Comparable<Item> {
	private long id;
	private State state;
	private Lending lending;
	private DataObject object;

	public Item(long id, DataObject object) {
		this.id = id;
		this.object = object;
		state = State.AVAILABLE;
	}

	public long getId() {
		return id;
	}

	public boolean isAvailable() {
		if (state.equals(State.AVAILABLE))
			return true;
		return false;
	}

	public DataObject getDataObject() {
		return object;
	}

	public Lending getLending() {
		return lending;
	}

	public void setLending(Lending lending) {
		this.lending = lending;
		state = State.LENT;
	}

	public void setState(State state) {
		this.state = state;
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
		return true;
	}

	@Override
	public String toString() {
		return "Item: " + id + state.name();
	}
	
	@Override
    public int compareTo(final Item item) {
		return Long.compare(this.id, item.id);
    }

	public String getTitle() {
    	return getObject().getTitle();
    }
}
