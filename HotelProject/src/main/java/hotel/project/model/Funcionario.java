package hotel.project.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("1")
public class Funcionario extends Pessoa{
    
    private String setor;
    
}
