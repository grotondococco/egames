package it.egames.repository;

import it.egames.entity.Genre;
import it.egames.entity.Platform;
import it.egames.entity.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {
    List<Videogame> findAllByPlatformAndGenre(Platform platform, Genre genre);
}
