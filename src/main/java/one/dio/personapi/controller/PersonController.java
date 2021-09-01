package one.dio.personapi.controller;

import one.dio.personapi.dto.MessageResponseDto;
import one.dio.personapi.entity.Person;
import one.dio.personapi.repositery.PersonRepositery;
import one.dio.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {


    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping//Salvando um arquivo..
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDto createPerson(@RequestBody Person person){

        return personService.creatPerson(person);
    }

    @PutMapping // Attualizar dados
    public Person updatePeron(@RequestBody Person person){
        return updatePeron(person);
    }
    @GetMapping //Listar Completa
    public List<Person> listaPerson(Person person){
        return listaPerson(person);
    }

    @GetMapping("{/id}") //Listar Id
     public Person listaPersonId(@PathVariable Long idPerson){
        return listaPersonId(idPerson) ;
    }

    @DeleteMapping("{/id}") //Detelar
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Person dltPerson(@PathVariable Long idPerson){
        return dltPerson(idPerson);
    }



}
