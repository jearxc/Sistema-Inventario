package pe.edu.idat.sistemainventario.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "proveedor")
@Getter
@Setter

public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ruc;
    private String razonSocial;
    private String telefono;
    private String email;
    private String direccion;
    private Boolean activo;

}
