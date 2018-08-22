package net.usepower.jobhunter.service.repository;

import net.usepower.jobhunter.model.data.Custom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomRepository extends MongoRepository<Custom, String> {

    Custom findByFirstName(String firstName);

    List<Custom> findByLastName(String lastName);
}
