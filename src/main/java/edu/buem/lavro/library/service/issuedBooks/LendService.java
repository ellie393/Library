package edu.buem.lavro.library.service.issuedBooks;

import edu.buem.lavro.library.model.Lend;

import java.util.List;

public interface LendService {
    Lend addNewIssue(Lend lend);
    Lend updateIssue(Lend lend);
    void deleteIssue(String id);
    Lend getIssue(String id);
    List<Lend> getAll();
}
