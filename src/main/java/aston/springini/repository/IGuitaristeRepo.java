package aston.springini.repository;

import aston.springini.entity.Guitare;
import aston.springini.entity.Guitariste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IGuitaristeRepo extends JpaRepository<Guitariste,Long> {
    public List<Guitariste> findByNom(String nom);
    @Query("select gt from Guitariste gt left join gt.guitare g where g.model = :modelguitare")
    public List<Guitariste> findByModelGuitare(@Param("modelguitare") String model);

}
