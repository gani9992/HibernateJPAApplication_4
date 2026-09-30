package org.com.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import org.com.entity.Teacher;
@Entity
@Table(name="student")
public class Student {
	
	@EmbeddedId
	private Teacher t1;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getT1() {
		return t1;
	}
	public void setT1(Teacher t1) {
		this.t1 = t1;
	}
	
	


}
