package com.exampledatabase.RestConreollerdemo.repository;

import com.exampledatabase.RestConreollerdemo.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer>{


}
