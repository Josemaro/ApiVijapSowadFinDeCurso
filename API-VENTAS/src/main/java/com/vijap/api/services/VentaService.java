package com.vijap.api.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.vijap.api.dto.DetalleVentaDto;
import com.vijap.api.dto.VentaDto;
import com.vijap.api.models.DetalleVentaModel;
import com.vijap.api.models.UsuarioModel;
import com.vijap.api.models.VentaModel;
import com.vijap.api.repositories.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    @Autowired
    VentaRepository ventaRepository;
    /*
    public ArrayList<VentaModel> obtenerVentas(){
        return(ArrayList<VentaModel>)ventaRepository.findAll();
    }
    */
    public List<VentaDto> obtenerVentas(){
        
        List<VentaDto> ventasDto = new ArrayList<>();
        
        
        for(VentaModel v: ventaRepository.findAll()){
            
            UsuarioModel usuarioAux = new UsuarioModel();
            VentaDto ventaAux = new VentaDto();
            ventaAux.setIdventa(v.getIdventa());
            usuarioAux.setIdusuario(v.getUsuario().getIdusuario());                
            usuarioAux.setNombre(v.getUsuario().getNombre());   
            ventaAux.setUsuario(usuarioAux);
            ventaAux.setTipocomprobante(v.getTipocomprobante());
            ventaAux.setSeriecomprobante(v.getSeriecomprobante());
            ventaAux.setNumcomprobante(v.getNumcomprobante());
            ventaAux.setFecha(v.getFecha());
            ventaAux.setImpuesto(v.getImpuesto());
            ventaAux.setTotal(v.getTotal());
            ventaAux.setEstado(v.getEstado());
            Set<DetalleVentaModel> xlista_detalle_ventas = new HashSet<>();
            for(DetalleVentaModel d : v.getLista_detalle_ventas()){
                DetalleVentaDto detalleAux = new DetalleVentaDto();
                detalleAux.setIddetalleventa(d.getIddetalleventa());
                detalleAux.setIdarticulo(d.getIdarticulo());
                detalleAux.setPrecio(d.getPrecio());
                detalleAux.setIdventa(d.getVenta().getIdventa());
                detalleAux.setCantidad(d.getCantidad());
                detalleAux.setDescuento(d.getDescuento());
                DetalleVentaModel x = new DetalleVentaModel();
                x.setCantidad(detalleAux.getCantidad());
                x.setDescuento(detalleAux.getDescuento());
                x.setIdarticulo(detalleAux.getIdarticulo());
                x.setPrecio(detalleAux.getPrecio());
                x.setIddetalleventa(detalleAux.getIddetalleventa());
                xlista_detalle_ventas.add(x);
            }
            ventaAux.setLista_detalle_ventas(xlista_detalle_ventas);
            ventasDto.add(ventaAux);
        }



        return(ventasDto);




    }

    public ArrayList<VentaModel> obtenerPorTipoComprobante(String tipocomprobante){
        return(ArrayList<VentaModel>)ventaRepository.findByTipocomprobante(tipocomprobante);
    }

    public ArrayList<VentaModel> obtenerPorNumeroComprobante(String numerocomprobante){
        return(ArrayList<VentaModel>)ventaRepository.findByNumcomprobante(numerocomprobante);
    }

}
