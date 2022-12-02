package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
    }

    public void ImprimirSaludo(){
        System.out.println("Hola! Este es un saludo de NotificationService. Ha quedado ud. debidamente notificado.");
    }

}
