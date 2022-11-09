package com.danriding.learningspring.data;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROOM_ID")
    @Getter
    @Setter
    private long id;
    @Column(name = "NAME")
    @Getter
    @Setter
    private String name;
    @Column(name = "ROOM_NUMBER")
    @Getter
    @Setter
    private String roomNumber;
    @Column(name = "BED_INFO")
    @Getter
    @Setter
    private String bedInfo;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", bedInfo='" + bedInfo + '\'' +
                '}';
    }
}
