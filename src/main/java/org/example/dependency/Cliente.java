package org.example.dependency;

public class Cliente {

    private final MensajeServicio mensajeServicio;

    public Cliente(MensajeServicio mensajeServicio) {
        this.mensajeServicio = mensajeServicio;
    }

    public void enviarmensaje(String mensaje){
        mensajeServicio.enviarmensaje(mensaje);
    }
}
