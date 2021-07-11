package com.vijap.api.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private UsuarioModel usuario;
    private String tipocomprobante;
    private String seriecomprobante;
    private String numcomprobante;
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

    public String getTipocomprobante() {
        return tipocomprobante;
    }
    public void setTipocomprobante(String tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }
    public String getSeriecomprobante() {
        return seriecomprobante;
    }
    public void setSeriecomprobante(String seriecomprobante) {
        this.seriecomprobante = seriecomprobante;
    }
    public String getNumcomprobante() {
        return numcomprobante;
    }
    public void setNumcomprobante(String numcomprobante) {
        this.numcomprobante = numcomprobante;
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
