package amin;

public class Link {
	
	// create a list of books
	// each linked list is going to have a book name and millions of Sold. 
	public String bookName;
	public int millionsSold;
	
	// reference the next link in the linked list
	public Link next;
	
	// create a constructor
	public Link(String bookName, int millionsSold){
		this.bookName = bookName;
		this.millionsSold = millionsSold;
	}
	
	// provides the information on our books (links)
	public void display(){
		System.out.println(bookName + ":" + millionsSold + ",000,000");
	}
	
	public String toString(){
		return bookName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
}

class LinkList{
	
	public Link firstLink;
	
	LinkList(){
		firstLink=null;
	}
	
	public boolean isEmpty(){
		return(firstLink == null);
	}
	
}


