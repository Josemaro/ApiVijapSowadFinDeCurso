package com.vijap.api.models;

import javax.persistence.*;

@Entity
@Table(name = "examen")
public class ExamenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idcurso;

    private String curso;
    private String docente;
    private String idexamen;
    private String peso;
    private String preguntas;
    private String tipoexamen ;

    
    public Long getIdcurso() {
        return idcurso;
    }
    public void setIdcurso(Long idcurso) {
        this.idcurso = idcurso;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getDocente() {
        return docente;
    }
    public void setDocente(String docente) {
        this.docente = docente;
    }
    public String getIdexamen() {
        return idexamen;
    }
    public void setIdexamen(String idexamen) {
        this.idexamen = idexamen;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getPreguntas() {
        return preguntas;
    }
    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }
    public String getTipoexamen() {
        return tipoexamen;
    }
    public void setTipoexamen(String tipoexamen) {
        this.tipoexamen = tipoexamen;
    }



    
}
