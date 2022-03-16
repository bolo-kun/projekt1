package com.example.project1.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
    @Table(name="zadanie")
    public class Zadanie {
        @Id
        @GeneratedValue
        @Column(name="zadanie_id")
        private Integer zadanieId;
        private Integer projektId;
        private String nazwa;
        private String kolejnosc;
        private String opis;
        private LocalDateTime dataczasUtworzenia;
        private LocalDate dataOddania;

        public Zadanie() {
        }

        public Zadanie(String imie, String nazwisko, String nrIndeksu, Boolean stacjonarny) {
/*            this.imie = imie;
            this.nazwisko = nazwisko;
            this.nrIndeksu = nrIndeksu;
            this.stacjonarny = stacjonarny;*/
        }
    }

