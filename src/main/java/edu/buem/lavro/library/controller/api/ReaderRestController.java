package edu.buem.lavro.library.controller.api;

import edu.buem.lavro.library.model.Reader;
import edu.buem.lavro.library.service.reader.impl.ReaderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/readers/")
@RestController
public class ReaderRestController {

    @Autowired
    ReaderServiceImpl service;

    @GetMapping("")
    public List<Reader> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Reader getReaderByID(@PathVariable String id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @PostMapping()
    public Reader add(@RequestBody Reader reader) {
        return service.add(reader);
    }

    @PutMapping()
    public Reader update(@RequestBody Reader reader) {
        return service.update(reader);
    }


}
