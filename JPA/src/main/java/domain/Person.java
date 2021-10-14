package domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@Column(nullable = false, length = 60)
	private String name; 
	
	@Column(nullable = false, length = 50)
	private String email; 
	
	public Person() {
		
	}
	
	public Person(Integer id, String name, String email ) {
		this.id = id; 
		this.name = name; 
		this.email = email;
	}
	
	public Integer getId() {
		return id; 
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Id: " + getId() + " - Name: " + getName() + " - Email: " + getEmail();
 	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(id, other.id);
	}

	
}
