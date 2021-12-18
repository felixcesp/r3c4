/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3.Reto3.mongoRepository;

import Reto3.Reto3model.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author johan
 */
public interface SupplementsMongoRepository extends MongoRepository<Supplements, String> {
    
}
