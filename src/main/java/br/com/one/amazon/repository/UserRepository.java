package br.com.one.amazon.repository;

import br.com.one.amazon.User;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface UserRepository extends DynamoDBCrudRepository<User, String> {
}
