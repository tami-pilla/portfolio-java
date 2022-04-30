
package com.argentinaprograma.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String imagen;
    private String institucion;
    private String titulo;
    private String fecha_inicio;
    private String fecha_fin;
    private int persona_id;
    
    
}
