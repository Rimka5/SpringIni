package aston.springini.configuration;

import aston.springini.entity.Guitare;
import aston.springini.repository.IGuitareRepo;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(IGuitareRepo guitareRepo) {
        return args -> {
            log.info("loading data" + guitareRepo.save(new Guitare(("Gibson Explorer"))));
            log.info("loading data" + guitareRepo.save(new Guitare(("Gibson decouverte"))));
            log.info("loading data" + guitareRepo.save(new Guitare(("Gibson return"))));
            log.info("loading data" + guitareRepo.save(new Guitare(("Gibson V1"))));
            log.info("loading data" + guitareRepo.save(new Guitare(("Gibson V2"))));
            log.info("loading data" + guitareRepo.save(new Guitare(("Gibson V3"))));
            log.info("loading data" + guitareRepo.save(new Guitare(("Superpoulet 3000"))));
            log.info("loading data" + guitareRepo.save(new Guitare(("Superpoulet 3001"))));
            log.info("loading data" + guitareRepo.save(new Guitare(("Superpoulet 3002"))));
        }
    }
}
