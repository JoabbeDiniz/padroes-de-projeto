package br.edu.ifs.designpatterns.builder.impl;

import br.edu.ifs.designpatterns.builder.Construtor;

public class ConstrutorComputador implements Construtor {

    private Computador computador;

    public ConstrutorComputador() {
        reset();
    }

    public void reset() {
        this.computador = new Computador();
    }

    public void setProcessador(String processador) {
        this.computador.setProcessador(processador);
    }

    public void setHD(int hd) {
        this.computador.setHD(hd);
    }

    public void setRAM(int ram) {
        this.computador.setRAM(ram);
    }

    public Computador getComputador() {
        return this.computador;
    }
}