package one.dio.personapi.service;

import one.dio.personapi.dto.MessageResponseDto;
import one.dio.personapi.entity.Person;
import one.dio.personapi.repositery.PersonRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonService {


    private PersonRepositery personRepositery;

    @Autowired
    public PersonService(PersonRepositery personRepositery) {
        this.personRepositery = personRepositery;
    }


//metodo Salvar
    public MessageResponseDto creatPerson(Person person){
        Person savedPerson = personRepositery.save(person);
        return MessageResponseDto
                .builder()
                .message("Criado meu person id" + savedPerson.getId())
                .build();
    }
    //Atualizar todos
    public Person updatePerson(Person person){
        return personRepositery.save(person);
    }

        // Listar todos
        public List<Person> listarPerson(Person person){
        return personRepositery.findAll();
        }


        //Listar por um ID
    public Optional<Person> listaPersonId(Long idPerson) {
        return personRepositery.findById(idPerson);
    }

    //Deletar
    public void dltPerson(Long idPerson){
        personRepositery.deleteById(idPerson);
    }



}
