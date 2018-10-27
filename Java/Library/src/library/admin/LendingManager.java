package library.admin;

import java.time.LocalDate;

import library.data.Book;
import library.data.DataObject;
import library.data.Film;
import library.data.Journal;
import library.data.Lending;
import library.data.Music;

public class LendingManager {
	private Lending[] lendings;
	private int lendingCounter = 0;
	
	
	public boolean isBookAvailable(Book book) {
		return this.isObjectAvailable(book);
	}
	
	public boolean isJournalAvailable(Journal journal) {
		return this.isObjectAvailable(journal);
	}
	
	public boolean isFilmAvailable(Film film) {
		return this.isObjectAvailable(film);
	}
	
	public boolean isMusicAvailable(Music music) {
		return this.isObjectAvailable(music);
	}
	
	private boolean isObjectAvailable(DataObject object) {
		for(Lending lending : this.lendings) {
			if(lending.getDataObject().equals(object) && lending.getReturnDate() == null) {
				return false;
			}
		}
		
		return true;
	}
	
	public LocalDate getLendingEndDate(DataObject object) {
		Lending lastLending = null;
		
		for(Lending lending : lendings) {
			if(lending.getDataObject().equals(object) && (lastLending == null || lending.getStartDate().isAfter(lastLending.getStartDate()))) {
				lastLending = lending;
			}
		}
		
		if(lastLending != null && lastLending.getReturnDate() != null) {
			return lastLending.getReturnDate();
		}
		
		if(lastLending != null && lastLending.getStartDate() != null) {
			return lastLending.getStartDate().minusMonths(-1);
		}		
		
		return LocalDate.now();
	}

}
