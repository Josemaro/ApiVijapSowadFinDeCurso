package com.vijap.api.models;


import javax.persistence.*;


@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idusuario;

    private Long idrol;
    private String nombre;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String telefono;

    @Column(unique = true, nullable = false)
    private String email;

    private String clave;
    private Long estado;

    
    public Long getIdusuario() {
        return idusuario;
    }
    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }
    public Long getIdrol() {
        return idrol;
    }
    public void setIdrol(Long idrol) {
        this.idrol = idrol;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo_documento() {
        return tipo_documento;
    }
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    public String getNum_documento() {
        return num_documento;
    }
    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Long getEstado() {
        return estado;
    }
    public void setEstado(Long estado) {
        this.estado = estado;
    }

   

    
    
}
