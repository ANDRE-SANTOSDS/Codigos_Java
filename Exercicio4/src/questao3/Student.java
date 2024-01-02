package questao3;

public class Student {
	public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double soma;
    
    public double somaNotas() {
         return	soma = (nota1+nota2+nota3);
    }
    public String toString() {
      	 return String.format("NOTA FINAL = %.2f\n",somaNotas());
      }
}
