package com.danriding.learningspring.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    @Getter
    @Setter
    private long id;
    @Column(name = "ROOM_ID")
    @Getter
    @Setter
    private long roomId;
    @Column(name = "GUEST_ID")
    @Getter
    @Setter
    private long guestId;
    @Column(name = "RES_DATE")
    private Date resDate;

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", roomId=" + roomId +
                ", guestId=" + guestId +
                ", resDate=" + resDate +
                '}';
    }

    public Date getResDate() {
        return resDate;
    }
}
