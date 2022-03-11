package br.com.danimlds.dsmovie.repositories;

import br.com.danimlds.dsmovie.entities.Score;
import br.com.danimlds.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
