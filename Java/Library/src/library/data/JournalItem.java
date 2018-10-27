package library.data;

public class JournalItem extends Item {
	private Journal journal;
	
	public JournalItem(long id, Journal journal) {
		super(id);
		this.journal = journal;
	}

	public Journal getJournal() {
		return journal;
	}

	@Override
	public String toString() {
		return "JournalItem [journal=" + journal + "]";
	}
	
}
