package one.dio.personapi.entity;


import lombok.*;
import one.dio.personapi.enums.PhoneType;

import javax.persistence.*;

@Table(name = "Phone", indexes = {
        @Index(name = "idx_phone_type", columnList = "type")
})
@Entity
@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String number;

}
