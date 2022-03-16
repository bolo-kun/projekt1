package com.example.project1.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "project")
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="project_id")
    private Integer projektId;
    @Column(nullable = false, length = 50)
    private String nazwa;
    private String opis;
    private LocalDateTime dataczasUtworzenia;
    private LocalDate dataOddania;

    public Project(){
    }
    public Project(String nazwa, String opis, LocalDateTime dataczasUtworzenia, LocalDate dataOddania){
         this.nazwa = nazwa;
         this.opis = opis;
         this.dataczasUtworzenia = dataczasUtworzenia;
         this.dataOddania = dataOddania;
    }

}
