package com.spring.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//Student entity class - Model class
@Entity
@Table(name="student")
public class Student {
            @Id
            @Column(name="studentId")
            private int studentId;
			@Column(name="userName")
            private String userName;
            @Column(name="password")
            private String password;
            @Column(name="firstName")
            private String firstName;
            @Column(name="lastName")
            private String lastName;
            @Column(name="address")
            private String address;
            @Column(name="city")
            private String city;
            @Column(name="postalCode")
            private String postalCode;

            public Student()
            {  
            	
            }

            public Student(int studentId, String userName, String password, String firstName, String lastName, String address, String city, String postalCode) 
            {
                super();
                this.studentId = studentId;
                this.userName = userName;
                this.password = password;
                this.firstName = firstName;
                this.lastName = lastName;
                this.address = address;
                this.city = city;
                this.postalCode = postalCode;
            }

            //setter and getter methods

            public int getStudentId() {
				return studentId;
			}
            
			public void setStudentId(int studentId) {
				this.studentId = studentId;
			}

			public String getUserName() {
				return userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getPostalCode() {
				return postalCode;
			}

			public void setPostalCode(String postalCode) {
				this.postalCode = postalCode;
			}
}