package br.com.ess.demo.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jedi {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 20, message = "Name must have between 3 and 20 letters")
    private String name;

    @Size(max = 20, message = "Last Name must not have more than 20 letters")
    private String lastName;


}
