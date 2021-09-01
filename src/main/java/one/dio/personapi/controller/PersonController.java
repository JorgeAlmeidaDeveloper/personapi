package one.dio.personapi.controller;

import one.dio.personapi.dto.MessageResponseDto;
import one.dio.personapi.entity.Person;
import one.dio.personapi.repositery.PersonRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepositery personRepositery;

    @Autowired
    public PersonController(PersonRepositery personRepositery) {
        this.personRepositery = personRepositery;
    }

    @GetMapping
    public String getBook(){
        return "Api Teste!!!!";
    }

    @PostMapping
    public MessageResponseDto createPerson(@RequestBody Person person){
        personRepositery.save(person);
        return MessageResponseDto
                .builder()
                .message("Criou seu person ID")
                .build();
    }
}
