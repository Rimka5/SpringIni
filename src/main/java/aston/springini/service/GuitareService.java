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
    public List<Guitare> findAll(){
        return this.guitareRepo.findAll();
    }
    public Guitare findById(Long id){
        Optional<Guitare>optGuitare = this.guitareRepo.findById(id);
        if (optGuitare.isPresent()){
            return optGuitare.get();
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }
}
