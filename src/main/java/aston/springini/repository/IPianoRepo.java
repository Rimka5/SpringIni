package aston.springini.repository;

import aston.springini.entity.Guitare;
import aston.springini.entity.Piano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPianoRepo extends JpaRepository<Piano,Long> {
    public List<Piano> findByModel(String model);
}
