package pe.edu.idat.sistemainventario.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name= "producto")
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stockActual;
    private Integer stockMinimo;
    private Boolean activo;
    @ManyToOne
    @JoinColumn(name= "categoria_id")
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name= "proveedor_id")
    private Proveedor proveedor;

}
