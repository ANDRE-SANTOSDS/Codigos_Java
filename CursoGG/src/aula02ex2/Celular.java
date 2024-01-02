package aula02ex2;

public class Celular {
     String marca;
     String sistemaOP;
     String nomeAP;
     String cor;
     double altura;
     double largura;
     
     public void status() {
    	 System.out.println("Marca do celular: "+this.marca);
    	 System.out.println("Sistema operacional: "+this.sistemaOP);
    	 System.out.println("Nome do celular: "+this.nomeAP);
    	 System.out.println("Cor do celular; "+this.cor);
    	 System.out.println("ALtura do celular: "+this.altura+"cm");
    	 System.out.println("Largura do celular: "+this.largura+"cm");
     }
}
