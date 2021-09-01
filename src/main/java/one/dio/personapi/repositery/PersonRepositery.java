package one.dio.personapi.repositery;

import lombok.*;
import one.dio.personapi.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepositery extends JpaRepository<Person,Long>{


}
