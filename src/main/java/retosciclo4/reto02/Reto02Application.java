package retosciclo4.reto02;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import retosciclo4.reto02.interfaces.InterfaceOrder;
import retosciclo4.reto02.interfaces.InterfaceProducts;
import retosciclo4.reto02.interfaces.InterfaceUser;
// import retosciclo4.reto02.model.CleaningProducts;
// import retosciclo4.reto02.model.Order;
// import retosciclo4.reto02.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
// import java.text.SimpleDateFormat;
// import java.time.format.DateTimeFormatter;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Optional;

@SpringBootApplication
public class Reto02Application implements CommandLineRunner{
	@Autowired
	private InterfaceProducts interfaceProducts;

	@Autowired
	private InterfaceUser interfaceUser;

	@Autowired
	private InterfaceOrder interfaceOrder;

	public static void main(String[] args) {
        SpringApplication.run(Reto02Application.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		// SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        interfaceProducts.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();

        // interfaceProducts.saveAll(List.of(
        //         new CleaningProducts("AP-903", "ACME", "MATERIAL 1", "PRESENTACION 1", "DESCRIPCION DETALLADA", true, 120000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-006127.jpg"),
        //         new CleaningProducts("AP-904", "ACME", "MATERIAL 2","PRESENTACION 2", "DESCRIPCION DETALLADA",  true, 130000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-007.jpg")
        // ));

        // interfaceUser.saveAll(List.of(
        //         new User(1, "123123", "ALAN BRITO", ft.parse("1986-11-15"),"11","CR 34-45", "311222222", "abrito@gmail.com", "Demo123.", "ZONA 2", "ADM"),
        //         new User(2, "61123211", "NAPOLEON BONAPARTE", ft.parse("1966-11-15"),"11","CR 34-45", "3168965645", "nbonaparte@gmail.com", "Demo123.", "ZONA 2", "COORD"),
        //         new User(3, "46669989", "BLODY MARRY", ft.parse("1996-11-15"),"11","CR 34-45", "3174565625", "stellez@gmail.com", "Demo123.", "ZONA 2", "ASE"),
        //         new User(4, "52369563", "JUANA DE ARCO", ft.parse("1987-05-15"),"05","CR 34-45", "3265632", "jdarco@gmail.com", "Demo123.", "ZONA 2", "ASE"),
        //         new User(5, "123456789", "ALCIRA LA ALPACA", ft.parse("1966-02-15"),"02","CR 34-45", "3168965645", "aalpaca@gmail.com", "Demo123.", "ZONA 1", "COORD"),
        //         new User(6, "213456789", "PEDRO CAPAROSA", ft.parse("1966-02-15"),"02","CR 34-45", "3168965645", "pcaparosa@gmail.com", "Demo123.", "ZONA 1", "ASE"),
        //         new User(7, "312456789", "LUIS IXV UN SOL", ft.parse("1966-02-15"),"02","CR 34-45", "3168965645", "reysol@gmail.com", "Demo123.", "ZONA 1", "ASE")
        // ));

        // //Instanciar las ordenes
        // Order orderOne = new Order();
        // orderOne.setId(1);
        // Order orderTwo = new Order();
        // orderTwo.setId(2);
        
        // //Recuperar vendedores
        // Optional<User> salesManOne = interfaceUser.findById(3);
        // Optional<User> salesManTwo = interfaceUser.findById(6);

        // //Mapa de productos asociados a una orden
        // Map<String, CleaningProducts> productOrderOne = new HashMap<String, CleaningProducts>();
        // Map<String, CleaningProducts> productOrderTwo = new HashMap<String, CleaningProducts>();

        // //Mapa de cantidades de producto asociados a una orden
        // Map<String, Integer> quantitiesOrderOne = new HashMap<String, Integer>();
        // Map<String, Integer> quantitiesOrderTwo = new HashMap<String, Integer>();
        
        // //lista de producto de la orden 1
        // productOrderOne.put("AP-903", interfaceProducts.findById("AP-903").get());
        // productOrderOne.put("AP-904", interfaceProducts.findById("AP-904").get());

        // //Cantidades de producto de la orden 1      
        // quantitiesOrderOne.put("AP-903", 1);
        // quantitiesOrderOne.put("AP-904", 1);

        // //lista de producto de la orden 2
        // productOrderTwo.put("AP-903", interfaceProducts.findById("AP-903").get());
        // productOrderTwo.put("AP-904", interfaceProducts.findById("AP-904").get());

        // //Cantidades de producto de la orden 2
        // quantitiesOrderTwo.put("AP-903", 1);
        // quantitiesOrderTwo.put("AP-904", 1);

        // //Configuraciòn datos orden 1
        // orderOne.setRegisterDay(ft.parse("2021-09-15"));
        // orderOne.setStatus(Order.PENDING);
        // orderOne.setSalesMan(salesManOne.get());
        // orderOne.setProducts(productOrderOne);
        // orderOne.setQuantities(quantitiesOrderOne);
        
        // //Configuraciòn datos orden 2
        // orderTwo.setRegisterDay(ft.parse("2021-09-15"));
        // orderTwo.setStatus(Order.PENDING);
        // orderTwo.setSalesMan(salesManTwo.get());
        // orderTwo.setProducts(productOrderTwo);
        // orderTwo.setQuantities(quantitiesOrderTwo);


        // //registra las ordenes en la base de datos
        // //imprime el los datos de las ordenes
        // interfaceOrder.saveAll(List.of(orderOne, orderTwo));
        
        // System.out.println("Listado de ordenes");
        // interfaceOrder.findAll().forEach(System.out::println);       
        
	}

}
