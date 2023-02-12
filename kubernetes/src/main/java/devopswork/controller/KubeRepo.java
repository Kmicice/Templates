package devopswork.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KubeRepo extends MongoRepository<KubeDocument,String> {
}
