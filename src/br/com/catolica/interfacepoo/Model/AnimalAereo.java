package br.com.catolica.interfacepoo.Model;

public abstract class AnimalAereo extends Animal {
    private int quantidadeAsas;

    public AnimalAereo(String nome, int quantidadeAsas) {
        super(nome);
        this.quantidadeAsas = quantidadeAsas;
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public void setQuantidadeAsas(int quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
    }

    @Override
    public String toString() {
        return "AnimalAereo{" +
                "quantidadeAsas=" + quantidadeAsas +
                '}';
    }

    public void voar(){
        System.out.println("Voando");
    }
}
