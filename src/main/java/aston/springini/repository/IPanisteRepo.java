package aston.springini.repository;

import aston.springini.entity.Pianiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPanisteRepo extends JpaRepository<Pianiste,Long> {
    public List<Pianiste> findByNom(String nom);
    @Query("select pp from Pianiste pp left join pp.piano p where p.model = :modelpiano")
    public List<Pianiste> findByModelPiano(@Param("modelpiano") String model);
}
