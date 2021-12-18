package Reto3.Reto3;

import Reto3.Reto3.mongoRepository.OrderMongoRepository;
import Reto3.Reto3.mongoRepository.SupplementsMongoRepository;
import Reto3.Reto3.mongoRepository.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto3Application implements CommandLineRunner {
        
        @Autowired
        private SupplementsMongoRepository Supplementsrepo;
        @Autowired
        private UserMongoRepository Userrepo;
        @Autowired
        private OrderMongoRepository Orderrepo;

	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}
        
        
        @Override
        public void run(String... args) throws Exception {
        Supplementsrepo.deleteAll();
        Userrepo.deleteAll();
        Orderrepo.deleteAll();
        
        
      
    }

}
