package org.example.dependency;


import org.springframework.stereotype.Service;

@Service //esta anotacion indica a spring boot que esta clase puede ser inyectada en otra clase
public class correoservicio implements MensajeServicio {
    @Override
    public void enviarmensaje(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);

    }
}
