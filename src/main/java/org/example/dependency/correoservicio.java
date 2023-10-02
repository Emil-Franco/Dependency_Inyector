package org.example.dependency;


import org.springframework.stereotype.Service;

@Service
public class correoservicio implements MensajeServicio {
    @Override
    public void enviarmensaje(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);

    }
}
