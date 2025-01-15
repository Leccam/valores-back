package com.example.CardGame.database;

import com.example.CardGame.dto.Value;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ValueRepository extends MongoRepository<Value, String> {

    @Query("{ $and: [ { 'value': ?0 }, { 'question': ?1 } ] }")
    Optional<Value> findByAll(String value, int question);

}
