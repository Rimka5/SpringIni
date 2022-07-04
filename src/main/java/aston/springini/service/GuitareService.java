package aston.springini.service;

import aston.springini.entity.Guitare;
import aston.springini.repository.IGuitareRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service

public class GuitareService {
    @Autowired
    private IGuitareRepo guitareRepo;

    /**
     * methode qui recupere du repo les guitares
     *
     * @return
     */
    public List<Guitare> findAll() {
        return this.guitareRepo.findAll();
    }

    /**
     * methode qui permet de recuperer une guitare par son id
     *
     * @param id
     * @return
     */
    public Guitare findById(Long id) {
        Optional<Guitare> optGuitare = this.guitareRepo.findById(id);
        if (optGuitare.isPresent()) {
            return optGuitare.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    /**
     * methode qui permet de trouver des guitares par model
     *
     * @param model String, model des guitares recherchées
     * @return
     */
    public List<Guitare> findByModel(String model) {
        return this.guitareRepo.findByModel(model);
    }

    /**
     * methode qui permet de l'enregistrer une guitare
     *
     * @param newGuitare Guitare, la guitare à enregistrer
     * @return Guitare, la guitare enregistrée avec son id
     */
    public Guitare create(Guitare newGuitare) {
        return this.guitareRepo.save(newGuitare);
    }

    /**
     * methode qui met à jour une guitare dans ma bdd
     *
     * @param guitare Guitare, la guitare à mettre à jour
     * @return Guitare, la guitare mise à jour
     */
    public Guitare update(Guitare guitare) {
        if (this.guitareRepo.existsById(guitare.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "impossible de trouver la guitare à mettre à jour");
        }
        return this.guitareRepo.save(guitare);
    }

    /**
     * methode qui supprime une guitare de la bdd si elle y est
     * puis verifei si elle a bien été supprimée
     *
     * @param id long, id de la guitare à supprimer
     * @return Guitare
     */
    public Guitare delete(Long id) {
        if (!this.guitareRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "impossible de trouver la guitare à supprimer");
        }
        Guitare guitareDel = this.findById(id);
        this.guitareRepo.deleteById(id);

        if (this.guitareRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED, "erreur lors de la suppression de la guitare");
        }
        return guitareDel;
    }
}
