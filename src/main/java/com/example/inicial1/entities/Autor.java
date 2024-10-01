package com.example.inicial1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import org.hibernate.envers.Audited;

@Entity
@Data
@Audited
public class Autor extends Base{

    private String nombre;
    private String apellido;

    @Column(length = 1500)      //indica que la columna va a recibir String de hasta 1500 esp
    private String biografia;

}
