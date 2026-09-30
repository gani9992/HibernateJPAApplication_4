package org.com.entity;
import jakarta.persistence.Embeddable;


@Embeddable
public class Teacher {
	private int id;
	private String section;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	

}
