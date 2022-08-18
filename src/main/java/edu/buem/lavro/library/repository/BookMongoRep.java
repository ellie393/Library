package edu.buem.lavro.library.repository;

import edu.buem.lavro.library.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMongoRep extends MongoRepository<Book, String> {
}
