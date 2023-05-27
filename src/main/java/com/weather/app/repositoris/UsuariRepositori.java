package com.weather.app.repositoris;

import com.weather.app.model.Usuari;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Interficie de persistència amb Spring Data i MongoDB.
 * @author sergi.grau@fje.edu
 * @version  1.0 4.4.2019
 */
public interface UsuariRepositori extends MongoRepository<Usuari, String> {
    Usuari findByUsername(String username);
    boolean existsByUsername(String username);
}
