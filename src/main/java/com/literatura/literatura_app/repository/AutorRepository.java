package com.literatura.literatura_app.repository;

import com.literatura.literatura_app.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNameContainsIgnoreCase(String name);

    @Query("SELECT a FROM Autor a WHERE a.birthYear <= :year AND a.deathYear >= :year")
    List<Autor> filterAuthorsByYear(int year);
}
