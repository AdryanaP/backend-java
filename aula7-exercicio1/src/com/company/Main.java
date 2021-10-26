package com.company;

import com.company.modal.Computador;

public class Main {

    public static void main(String[] args) {
        ComputadorFactory factory = new ComputadorFactory();
        Computador mac1 = factory.buscarComputador(8, 500);
        Computador windows1 = factory.buscarComputador(16, 128);
        Computador windows2 = factory.buscarComputador(16, 128);

        System.out.println(mac1.toString());
        System.out.println(windows1.toString());
        System.out.println(windows2.toString());
    }
}
