package com.jorgecod;

public class Main {

    public static void main(String[] args) {
        Pizza base = new PizzaBuilder().setTipoMasa("maiz")
                .setTamaño(2)
                .build();
        Pizza hawaiana = new PizzaBuilder()
                .setTipoMasa("fina")
                .setTamaño(3)
                .setCebolla(false)
                .setChampiñones(true)
                .setExtraQueso(true)
                .setPiña(true)
                .setJamon(true)
                .build();
        System.out.println(base.toString());
        System.out.println(hawaiana.toString());
    }
}
    }
}
