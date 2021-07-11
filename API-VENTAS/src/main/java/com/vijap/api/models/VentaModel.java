package com.vijap.api.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "venta")
public class VentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idventa;
    
    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    private UsuarioModel usuario;

    private String tipo_comprobante;
    private String serie_comprobante;
    private String num_comprobante;
    private Date fecha;
    private Long impuesto;
    private Long total;
    private String estado;

    @Getter @Setter
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "venta")
    private Set<DetalleVentaModel> lista_detalle_ventas;

    public Long getIdventa() {
        return idventa;
    }
    public void setIdventa(Long idventa) {
        this.idventa = idventa;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }
    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }
    public String getSerie_comprobante() {
        return serie_comprobante;
    }
    public void setSerie_comprobante(String serie_comprobante) {
        this.serie_comprobante = serie_comprobante;
    }
    public String getNum_comprobante() {
        return num_comprobante;
    }
    public void setNum_comprobante(String num_comprobante) {
        this.num_comprobante = num_comprobante;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Long getImpuesto() {
        return impuesto;
    }
    public void setImpuesto(Long impuesto) {
        this.impuesto = impuesto;
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
