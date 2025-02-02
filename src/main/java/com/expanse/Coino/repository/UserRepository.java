package com.expanse.Coino.repository;

import com.expanse.Coino.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByMobileNo(String number);

    User save(User user);
}
