package com.expanse.Coino.repository;

import com.expanse.Coino.models.Group;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends MongoRepository<Group, String> {

    @Query("{ 'memberIds' : ?0 }")
    List<Group> findAllGroupsByUserId(String userId);
}
