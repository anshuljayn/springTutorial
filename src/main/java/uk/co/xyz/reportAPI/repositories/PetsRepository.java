package uk.co.xyz.reportAPI.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import uk.co.xyz.reportAPI.models.Pets;

public interface PetsRepository extends MongoRepository<Pets,String> {
    Pets findBy_id(ObjectId _id);
}
