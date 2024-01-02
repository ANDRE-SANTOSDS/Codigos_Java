package Menu;

import java.util.ArrayList;

public class Rh {
    ArrayList<Funcionarios> func = new ArrayList<Funcionarios>();
    
    public void cadastrar(Funcionarios f) {
    	func.add(f);
    }
    
    public void listar() {
    	for(int i = 0;i < func.size();i++) {
    		System.out.println("Nome: "+func.get(i).getNome());
    		System.out.println("Matricula: "+func.get(i).getMatricula());
    		System.out.println("Salario: "+func.get(i).getSalario());
    		System.out.println();
    	}
    }
}
