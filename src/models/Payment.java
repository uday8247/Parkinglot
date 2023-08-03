package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment {

    private String reference;

    private double amount;

    private PaymentMode paymentMode;

    private PaymentStatus paymentStatus;

    private Date time;

    private Ticket ticket;
}
