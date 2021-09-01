package one.dio.personapi.dto;


import lombok.*;
import net.bytebuddy.implementation.bind.annotation.Empty;
import one.dio.personapi.enums.PhoneType;
import org.hibernate.type.EnumType;

import javax.persistence.*;

@Table(name = "Phone", indexes = {
        @Index(name = "idx_phone_type", columnList = "type")
})

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PhoneDto {


    private Long id;
    @Enumerated()
    private PhoneType type;

    private String number;

}
