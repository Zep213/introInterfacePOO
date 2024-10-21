package br.com.catolica.interfacepoo.Model;

import br.com.catolica.interfacepoo.Contrato.IAnimalAereo;
import br.com.catolica.interfacepoo.Contrato.IAnimalAquatico;
import br.com.catolica.interfacepoo.Contrato.IAnimalTerrestre;

public class Pato implements IAnimalAereo, IAnimalTerrestre, IAnimalAquatico {

    @Override
    public void alcar() {
        System.out.println("alçando Voo");
    }

    @Override
    public void voar() {
        System.out.println("voando");
    }

    @Override
    public void pousar() {
        System.out.println("Pousando");
    }

    @Override
    public void correr() {
        System.out.println("Correndo");
    }

    @Override
    public void andar() {
        System.out.println("Andar");
    }

    @Override
    public void pular() {
        System.out.println("Pulando");
    }

    @Override
    public void mergulhar() {
        System.out.println("Mergulhando");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando");
    }

    @Override
    public void emergir() {
        System.out.println("Emergindo");
    }
}
