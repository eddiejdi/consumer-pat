package br.com.alelo.consumer.consumerpat.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer address_id;

    String street;
    int number;
    String city;
    String country;
    int portalCode;

}
