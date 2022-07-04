package aston.springini.repository;

import aston.springini.entity.Guitare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGuitareRepo extends JpaRepository<Guitare,Long> {
/**
 * sans ecrit on a les methodes
 * public List<Guitare> findAll();
 * public Guitare findById(id);
 * public Guitare crdate(guitare);
 * public List<Guitare> crdateAll(List<Guitare>);
 * public Guitare update(guitare);
 *  * public List<Guitare> updateAll(List<Guitare>);
 * public Guitare delete(idguitare);
 *  * public List<Guitare> deleteAll(List<Guitare>);
 */
public List<Guitare> findByModel(String model);
}
