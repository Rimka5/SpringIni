package aston.springini.service;


import aston.springini.entity.Instrument;
import aston.springini.repository.ICornemuseRepo;
import aston.springini.repository.IGuitareRepo;
import aston.springini.repository.IPianoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class InstrumentService {
    @Autowired
    private IGuitareRepo guitareRepo;
    @Autowired
    private IPianoRepo pianoRepo;
    @Autowired
    private ICornemuseRepo cornemuseRepo;
    public List<Instrument> findAll(){
        List<Instrument> instrus = new ArrayList<Instrument>();
            instrus.addAll(this.guitareRepo.findAll());
            instrus.addAll(this.pianoRepo.findAll());
            instrus.addAll(this.cornemuseRepo.findAll());
            return instrus;

    }
}
