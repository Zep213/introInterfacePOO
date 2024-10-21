package br.com.catolica.interfacepoo.Model;

public abstract class AnimalAquatico extends Animal {

    private int quantidadeMembroNdadador;

    public AnimalAquatico(String nome, int quantidadeMembroNdadador) {
        super(nome);
        this.quantidadeMembroNdadador = quantidadeMembroNdadador;
    }

    public int getQuantidadeMembroNdadador() {
        return quantidadeMembroNdadador;
    }

    public void setQuantidadeMembroNdadador(int quantidadeMembroNdadador) {
        this.quantidadeMembroNdadador = quantidadeMembroNdadador;
    }
    public void nadar(){
        System.out.println("Nadando");
    }

    @Override
    public String toString() {
        return "AnimalAquatico{" +
                "quantidadeMembroNdadador=" + quantidadeMembroNdadador +
                '}';
    }
}
