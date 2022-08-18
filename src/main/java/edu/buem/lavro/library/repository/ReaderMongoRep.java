package edu.buem.lavro.library.repository;

import edu.buem.lavro.library.model.Reader;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderMongoRep extends MongoRepository<Reader, String> {

}
