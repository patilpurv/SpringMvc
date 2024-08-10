package ORG.TECHHUB.SpringMVCCRUD.model;

public class Employee1 {
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	private String email;
	private String contact;
}
