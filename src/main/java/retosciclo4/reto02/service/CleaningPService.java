package retosciclo4.reto02.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import retosciclo4.reto02.model.CleaningProducts;
import retosciclo4.reto02.repository.CleaningPRepository;

@Service
public class CleaningPService {
    @Autowired
    private CleaningPRepository cleaningPRepository;
    private CleaningProducts cleanProd;

    public List<CleaningProducts> getAll() {
        return cleaningPRepository.getAll();
    }

    public Optional<CleaningProducts> getCProducts(Integer id) {
        return cleaningPRepository.getCProducts(id);
    }

    public CleaningProducts create(CleaningProducts cleanProd) {
        if (cleanProd.getId() == null) {
            return cleanProd;
        } else {
            return cleaningPRepository.create(cleanProd);
        }
    }

    public CleaningProducts update(CleaningProducts cleanProd) {

        if (cleanProd.getId() != null) {
            Optional<CleaningProducts> cleanProdDb = cleaningPRepository.getCProducts(cleanProd.getId());
            if (!cleanProdDb.isEmpty()) {
                
                if (cleanProd.getBrand()!= null) {
                    cleanProdDb.get().setBrand(cleanProd.getBrand());
                }
                
                if (cleanProd.getCategory() != null) {
                    cleanProdDb.get().setCategory(cleanProd.getCategory());
                }
                
                if (cleanProd.getDescription() != null) {
                    cleanProdDb.get().setDescription(cleanProd.getDescription());
                }
                if (cleanProd.getPrice() != 0.0) {
                    cleanProdDb.get().setPrice(cleanProd.getPrice());
                }
                if (cleanProd.getQuantity() != 0) {
                    cleanProdDb.get().setQuantity(cleanProd.getQuantity());
                }
                if (cleanProd.getPhotography() != null) {
                    cleanProdDb.get().setPhotography(cleanProd.getPhotography());
                }
                cleanProdDb.get().setAvailability(cleanProd.isAvailability());
                cleaningPRepository.update(cleanProdDb.get());
                return cleanProdDb.get();
            } else {
                this.cleanProd = cleanProd;
                return this.cleanProd;
            }
        } else {
            return cleanProd;
        }
    }

    public boolean delete(Integer id) {
        Boolean aBoolean = getCProducts(id).map(cleanProd -> {
            cleaningPRepository.delete(cleanProd);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
