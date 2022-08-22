package edu.buem.lavro.library.repository;

import edu.buem.lavro.library.model.Lend;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LendMongoRep extends MongoRepository<Lend, String> {
}
