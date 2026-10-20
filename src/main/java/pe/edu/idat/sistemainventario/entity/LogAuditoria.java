package pe.edu.idat.sistemainventario.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name= "log_auditoria")
@Getter
@Setter
public class LogAuditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaHora;
    private String accion;
    private String modulo;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name= "usuario_id")
    private Usuario usuario;
}
