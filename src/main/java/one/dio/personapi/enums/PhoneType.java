package one.dio.personapi.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class PhoneType{

    // HOME(description:"Home");
     //MOBILE(description:"Mobile");
     //COMMERCIAL(description:"Comercial");


    private final String description;

}
