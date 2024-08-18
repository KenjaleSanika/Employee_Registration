package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private long id;
    private String name;
    private String dateOfJoining;
    private String mobile;
    private String email;
    private int salary;
    private String designation;
    private String alternativeMobile;

    public Employee(long id, String name, String dateOfJoining, String mobile, String email, int salary,
                    String designation, String alternativeMobile) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.mobile = mobile;
        this.email = email;
        this.salary = salary;
        this.designation = designation;
        this.alternativeMobile = alternativeMobile;
    }

    public Employee() {
    }
    

    // Getters and setters
    // ...

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAlternativeMobile() {
		return alternativeMobile;
	}

	public void setAlternativeMobile(String alternativeMobile) {
		this.alternativeMobile = alternativeMobile;
	}

	@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dateOfJoining=" + dateOfJoining + ", mobile=" + mobile
                + ", email=" + email + ", salary=" + salary + ", designation=" + designation + ", alternativeMobile="
                + alternativeMobile + "]";
    }
}
