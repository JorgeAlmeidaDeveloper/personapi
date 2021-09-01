package one.dio.personapi.repositery;

import lombok.*;
import one.dio.personapi.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositery extends JpaRepository<Person, Long>{


}
