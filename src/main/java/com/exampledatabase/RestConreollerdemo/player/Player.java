package com.exampledatabase.RestConreollerdemo.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PLAYER")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="player_id")
    private int id;

    @Column(name="player_name")
    private String playerName;

    @Column(name="preference")
    private String preference;

    @Column(name="Matched_Played")
    private int matchedplayed;

    @Column(name="runs")
    private int runs;

    @Column(name="wickets")
    private int wickets;

    @Column(name="highest_score")
    private int highestScore;

    @Column(name="fifty")
    private int fifty;

    @Column(name="century")
    private int century;

    @Column(name="thirty")
    private int thirty;

    @Column(name="catches")
    private int catches;

    @Column(name="stumping")
    private int stumping;

    @Column(name="fours")
    private int fours;

    @Column(name="six")
    private int six;

    @Column(name="strikerate")
    private double strikerate;

    @Column(name="average")
    private double average;


}
