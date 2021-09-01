package one.dio.personapi.dto;

import lombok.*;
import one.dio.personapi.entity.Phone;
import java.time.LocalDate;
import java.util.List;


@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

    private Long id;


    private String firstName;


    private String lastName;


    private String cpf;

    private LocalDate birthDate;


    private List<Phone> phones;
}
