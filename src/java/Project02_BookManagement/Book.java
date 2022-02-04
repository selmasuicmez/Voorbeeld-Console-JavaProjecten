package java.Project02_BookManagement;

public class Book {
	
	private int no;
	private String bookName;
	private String bookAuthorName;
	private int publication_year;
	private double price;
	
	public Book(int no, String bookName, String bookAuthorName, int publication_year, double price) {
		this.no = no;
		this.bookName = bookName;
		this.bookAuthorName = bookAuthorName;
		this.publication_year = publication_year;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthorName() {
		return bookAuthorName;
	}

	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}

	public int getPublication_year() {
		return publication_year;
	}

	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "No=" + no + ", Book Name=" + bookName + ", Author=" + bookAuthorName + ", Publication Year=" + publication_year
				+ ", price=" + price;
	}
	
	


}
