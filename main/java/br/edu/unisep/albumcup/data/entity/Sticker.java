package br.edu.unisep.albumcup.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "stickers")
public class Sticker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sticker")
    private Integer id;

    @Column(name = "nm_player")
    private String player;

    @Column(name = "nm_country")
    private String country;

    @Column(name = "vl_height")
    private Double height;

    @Column(name = "vl_weight")
    private Double weight;

    @Column(name = "dt_birth")
    private LocalDate birthday;

    @Column(name = "tp_legendary")
    private boolean legendary;
}
