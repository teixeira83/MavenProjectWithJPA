package hotel.project.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Cliente extends Pessoa{
    
    private int quantidadeOcupacoes;
}
