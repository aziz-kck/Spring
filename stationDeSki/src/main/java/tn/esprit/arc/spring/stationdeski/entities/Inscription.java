package tn.esprit.arc.spring.stationdeski.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table( name = "Inscription")
public class Inscription implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idInscri")
    private Integer idInscri; // Clé primaire
    private Long numInscription;
    private Integer numSemaine;

}