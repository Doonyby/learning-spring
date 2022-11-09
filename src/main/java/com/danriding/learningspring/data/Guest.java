package com.danriding.learningspring.data;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="GUEST")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GUEST_ID")
    @Getter
    @Setter
    private long id;
    @Column(name = "FIRST_NAME")
    @Getter
    @Setter
    private String firstName;
    @Column(name = "LAST_NAME")
    @Getter
    @Setter
    private String lastName;
    @Column(name = "EMAIL_ADDRESS")
    @Getter
    @Setter
    private String emailAddress;
    @Column(name = "ADDRESS")
    @Getter
    @Setter
    private String address;
    @Column(name = "COUNTRY")
    @Getter
    @Setter
    private String country;
    @Column(name = "STATE")
    @Getter
    @Setter
    private String state;
    @Column(name = "PHONE_NUMBER")
    @Getter
    @Setter
    private String phoneNumber;

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
