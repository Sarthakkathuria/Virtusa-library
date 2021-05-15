package io.library.starter.LibraryController;

import javax.persistence.Entity;
import javax.persistence.Id;


//jpa will create table with 4 columns
@Entity
public class LogModel {
	@Id
	private String bookid;
	private String quantity;
	private String bookName;
	private String genre;
	
	
	public LogModel() {
		
	}

	public LogModel(String bookid, String quantity, String bookName, String genre) {
		super();
		this.bookid = bookid;
		this.quantity = quantity;
		this.bookName = bookName;
		this.genre = genre;
	}


	public String getBookid() {
		return bookid;
	}


	public void setBookid(String bookid) {
		this.bookid = bookid;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	

	
}
