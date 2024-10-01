package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.scripting.bsh.BshScriptEvaluator;

import java.security.PrivilegedAction;
import java.util.List;

@Entity
@Data
@Audited
public class Libro extends Base {

    private int fecha;
    private String genero;
    private int paginas;
    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;

}
