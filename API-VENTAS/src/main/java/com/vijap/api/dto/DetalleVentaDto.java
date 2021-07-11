package com.vijap.api.dto;

import com.vijap.api.models.VentaModel;

import lombok.Getter;
import lombok.Setter;

public class DetalleVentaDto {
    @Getter @Setter
    private Long iddetalleventa;
    @Getter @Setter
    private Long idventa;
    @Getter @Setter
    private Long idarticulo;
    @Getter @Setter
    private Long cantidad;
    @Getter @Setter
    private Long precio;
    @Getter @Setter
    private Long descuento;
    
}
