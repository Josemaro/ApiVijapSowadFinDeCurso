package com.vijap.api.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "detalle_venta")
public class DetalleVentaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long iddetalleventa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idventa", referencedColumnName = "idventa")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private VentaModel venta;

    private Long idarticulo;
    private Long cantidad;
    private Long precio;
    private Long descuento;


    public VentaModel getVenta() {
        return venta;
    }
    public void setVenta(VentaModel venta) {
        this.venta = venta;
    }
    public Long getIddetalleventa() {
        return iddetalleventa;
    }
    public void setIddetalleventa(Long iddetalleventa) {
        this.iddetalleventa = iddetalleventa;
    }
    public Long getIdarticulo() {
        return idarticulo;
    }
    public void setIdarticulo(Long idarticulo) {
        this.idarticulo = idarticulo;
    }
    public Long getCantidad() {
        return cantidad;
    }
    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }
    public Long getPrecio() {
        return precio;
    }
    public void setPrecio(Long precio) {
        this.precio = precio;
    }
    public Long getDescuento() {
        return descuento;
    }
    public void setDescuento(Long descuento) {
        this.descuento = descuento;
    }

    

}
