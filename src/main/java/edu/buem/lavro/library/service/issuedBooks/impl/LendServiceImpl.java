package edu.buem.lavro.library.service.issuedBooks.impl;

import edu.buem.lavro.library.model.Lend;
import edu.buem.lavro.library.repository.LendMongoRep;
import edu.buem.lavro.library.service.issuedBooks.LendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LendServiceImpl implements LendService {
    @Autowired
    LendMongoRep repository;

    @Override
    public Lend addNewIssue(Lend lend) {
        return repository.save(lend);
    }

    @Override
    public Lend updateIssue(Lend lend) {
        return repository.save(lend);
    }

    @Override
    public void deleteIssue(String id) {
        repository.deleteById(id);

    }

    @Override
    public Lend getIssue(String id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Lend> getAll() {
        return repository.findAll();
    }
}
