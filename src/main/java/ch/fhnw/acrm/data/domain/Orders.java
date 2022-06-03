package ch.fhnw.acrm.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private Long orderId;

    private String Date;

    private String ProductCosts;

    private String TransportCosts;

    private String Total;

}
