package com.ubb.proyecto.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_user;

    private String nombre;

    private String contraseña;

    private String correo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @ManyToOne
    @JoinColumn(name = "rol_user")
    private Rol rol;

    // Getters y Setters
    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
