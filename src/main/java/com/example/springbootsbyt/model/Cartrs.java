package com.example.springbootsbyt.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "cartrs")
public class Cartrs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCartrs;

    @Column(name = "chip")
    private String chip;

    @Column(name = "type_cartr")
    private String typeCartr;

//    @Column(name = "type_printers_from_cartrs")
//    private String typePrintersFromCartrs;

    @Column(name = "printers_id_printers")
    private Integer printersIdPrinters;

//    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
//    @JoinTable(name = "cartrs_has_printers",
//            joinColumns = @JoinColumn(name = "cartrs_id_cartrs"),
//            inverseJoinColumns = @JoinColumn(name = "printers_id_printers")
//    )
//    private Set<Printers> printersSet = new HashSet<>();

    public Integer getIdCartrs() {
        return idCartrs;
    }

    public void setIdCartrs(Integer idCartrs) {
        this.idCartrs = idCartrs;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getTypeCartr() {
        return typeCartr;
    }

    public void setTypeCartr(String typeCartr) {
        this.typeCartr = typeCartr;
    }

    public Integer getPrintersIdPrinters() {
        return printersIdPrinters;
    }

    public void setPrintersIdPrinters(Integer printersIdPrinters) {
        this.printersIdPrinters = printersIdPrinters;
    }

//    public Set<Printers> getPrintersSet() {
//        return printersSet;
//    }
//
//    public void setPrintersSet(Set<Printers> printersSet) {
//        this.printersSet = printersSet;
//    }

    public Cartrs() {
           }

    public Cartrs(Integer idCartrs, String chip, String typeCartr, Integer printersIdPrinters) {
        this.idCartrs = idCartrs;
        this.chip = chip;
        this.typeCartr = typeCartr;
        this.printersIdPrinters = printersIdPrinters;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cartrs cartrs = (Cartrs) o;
        return Objects.equals(idCartrs, cartrs.idCartrs) &&
                Objects.equals(chip, cartrs.chip) &&
                Objects.equals(typeCartr, cartrs.typeCartr) &&
                Objects.equals(printersIdPrinters, cartrs.printersIdPrinters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCartrs, chip, typeCartr, printersIdPrinters);
    }

    @Override
    public String toString() {
        return "Cartrs{" +
                "idCartrs=" + idCartrs +
                ", chip='" + chip + '\'' +
                ", typeCartr='" + typeCartr + '\'' +
                ", printersIdPrinters='" + printersIdPrinters + '\'' +
                '}';
    }
}
