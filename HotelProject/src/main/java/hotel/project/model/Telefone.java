package hotel.project.model;

import java.io.Serializable;
import javax.persistence.Embeddable;


@Embeddable
public class Telefone implements Serializable {

    private String ddd;
    private String numero;
}
