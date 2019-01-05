package fr.wildcodeschoolquest.springrestquest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int id;
	
	private String title;
	private String author;
	private String description;

//	Constructeur
	public Book() { }
	public Book ( int id, String title, String author, String Description) {
		this.setId(id);
		this.setTitle(title);
		this.setAuthor(author);
		this.setDescription(Description);
	}

	
//	Getter & Setter
	public void setId( int id) {
		this.id = id;
	}
	
    public int getId() {
        return id;
    }
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
