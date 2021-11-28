package view;

import controller.OrdenacaoController;

public class Principal {

	public static void main(String[] args) {
		
		int [] vetor = {1,0,4,8,2,0,2};
		
		OrdenacaoController oCont = new OrdenacaoController();
		vetor = oCont.bubbleSort(vetor);
		
		System.out.println(" ");
		System.out.println("**************************************************************");
		for (int valor: vetor) {
			System.out.print(valor + "  ");
			
		}
		
		System.out.println(" ");
		System.out.println("**************************************************************");
	}

}
