package retosciclo4.reto02.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import retosciclo4.reto02.model.CleaningProducts;
import retosciclo4.reto02.service.CleaningPService;

@RestController
@RequestMapping("/api/cleaningprod")
@CrossOrigin("*")
public class CleaningPController {
    @Autowired
    private CleaningPService cleaningPService;

    @GetMapping("/all")
    public List<CleaningProducts> getAll() {
        return cleaningPService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<CleaningProducts> getClothe(@PathVariable("id") Integer id) {
        return cleaningPService.getCProducts(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public CleaningProducts create(@RequestBody CleaningProducts product) {
        return cleaningPService.create(product);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public CleaningProducts update(@RequestBody CleaningProducts product) {
        return cleaningPService.update(product);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return cleaningPService.delete(id);
    }
}
