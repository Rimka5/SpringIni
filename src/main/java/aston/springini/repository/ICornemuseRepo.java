package aston.springini.repository;

import aston.springini.entity.Cornemuse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICornemuseRepo extends JpaRepository<Cornemuse,Long> {
    List<Cornemuse> findByModel(String model);
}
