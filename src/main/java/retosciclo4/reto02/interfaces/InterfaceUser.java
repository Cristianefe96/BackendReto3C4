package retosciclo4.reto02.interfaces;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import retosciclo4.reto02.model.User;



public interface InterfaceUser extends MongoRepository<User, Integer>{
    Optional<User> findByEmail (String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    //Para seleccionar el usuario con el id maximo
    Optional<User> findTopByOrderByIdDesc();
}
