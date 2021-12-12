package retosciclo4.reto02.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import retosciclo4.reto02.interfaces.InterfaceProducts;
import retosciclo4.reto02.model.CleaningProducts;

@Repository
public class CleaningPRepository {
    @Autowired
    private InterfaceProducts repository;

    public List<CleaningProducts> getAll() {
        return repository.findAll();
    }

    public Optional<CleaningProducts> getCProducts(Integer id) {
        return repository.findById(id);
    }
    
    public CleaningProducts create(CleaningProducts cProducts) {
        return repository.save(cProducts);
    }

    public void update(CleaningProducts cProducts) {
        repository.save(cProducts);
    }
    
    public void delete(CleaningProducts cProducts) {
        repository.delete(cProducts);
    }
}

