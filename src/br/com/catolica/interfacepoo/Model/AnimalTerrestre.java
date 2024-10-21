package br.com.catolica.interfacepoo.Model;

public abstract class AnimalTerrestre extends Animal {
    private int quantidadeDePatas;
    public AnimalTerrestre(String nome, int qntdPatas){
        super(nome);
        this.quantidadeDePatas = qntdPatas;
    }
    public int getQuantidadeDePatas(){
        return  quantidadeDePatas;
    }
    public void setQuantidadeDePatas(int qntPatas){
        this.quantidadeDePatas = qntPatas;
    }
    public void andar(){
        System.out.println("Andando");
    }

    @Override
    public String toString() {
        return "AnimalTerrestre{" +
                "quantidadeDePatas=" + quantidadeDePatas +
                '}';
    }
}
