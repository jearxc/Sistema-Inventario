package pe.edu.idat.sistemainventario.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name= "movimiento_inventario")
@Getter
@Setter
public class MovimientoInventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaHora;
    private String tipoMovimiento;
    private Integer cantidad;
    private String observacion;
    @ManyToOne
    @JoinColumn(name= "producto_id")
    private Producto producto;
    @ManyToOne
    @JoinColumn(name= "usuario_id")
    private Usuario usuario;


}
