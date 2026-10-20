package pe.edu.idat.sistemainventario.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name="usuario")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String username;
    private String correo;
    private String password;
    private Boolean activo;
    @ManyToOne
    @JoinColumn(name= "rol_id")
    private Rol rol;
}
