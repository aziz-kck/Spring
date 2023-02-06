package tn.esprit.arc.spring.stationdeski.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Cours")
public class Cours  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCours")
    private Integer idCours; // Clé primaire
    private Long numCours;
    private Integer Niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours TypeCours;
    @Enumerated(EnumType.STRING)
    private Support Support;
    private float Prix;
    private Integer creneau;
}
