package devopswork.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DevOpsService {

    private final KubeRepo kubeRepo;

    private final String uri;

    public DevOpsService(KubeRepo kubeRepo, @Value("${spring.data.mongodb.uri}") String uri) {
        this.kubeRepo = kubeRepo;
        this.uri = uri;
    }

    String setUpMongoDbDummyData() {
        kubeRepo.save(new KubeDocument("id", "name"));
        log.debug("Created and save doc");
        return kubeRepo.findAll().toString();
    }


}
