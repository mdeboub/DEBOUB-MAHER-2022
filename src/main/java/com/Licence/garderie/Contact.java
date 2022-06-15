package com.Licence.garderie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;


    @Column(name = "email")
    private String email;
    
    @Column(name = "Subject")
    private String Subject;
    
    @Column(name = "message")
    private String message;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
    public String getMessage() {
        return email;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}