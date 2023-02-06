package tn.esprit.arc.spring.stationdeski.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "Moniteur")
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMoniteur")
    private Integer idMoniteur; // Clé primaire
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecu;
}
