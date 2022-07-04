package aston.springini.repository;

import aston.springini.entity.Sonneur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISonneurRepo extends JpaRepository<Sonneur,Long> {
    List<Sonneur> findByNom(String nom);
    @Query("select cr from Sonneur cr left join cr.cornemuse c where c.model = :modelcornemuse")
    List<Sonneur> findByModelCornemuse(@Param("modelcornemuse") String model);
}
