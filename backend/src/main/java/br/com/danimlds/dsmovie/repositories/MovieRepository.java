package br.com.danimlds.dsmovie.repositories;


import br.com.danimlds.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
