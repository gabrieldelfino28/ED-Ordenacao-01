package view;

import Algoritmos.BubbleSort.BubbleSort;
import Algoritmos.MergeSort.MergeSort;

public class Principal {

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		MergeSort m = new MergeSort();
		
		//Vetores originais
		int[] vet1 = { 44, 43, 42, 41, 40, 39, 38 };
		
		int[] vet2 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		
		
		//Vetor 1
		int[] vet1Bubble = b.FBubbleSort(vet1);
		
		int tam1 = vet1.length-1;
		int[] vet1Merge = m.FMergeSort(vet1, 0, tam1);
		
		//Vetor 2
		int[] vet2Bubble = b.FBubbleSort(vet2);
		
		int tam2 = vet2.length-1;
		int[] vet2Merge = m.FMergeSort(vet2, 0, tam2);
		
		//Vetor 1 Ordenado.
		for(int i = 0 ; i <= tam1; i++) {
			System.out.print(vet1Bubble[i] + " | ");
		}
		System.out.println("Bubble\n");
		for(int i = 0 ; i <= tam1; i++) {
			System.out.print(vet1Merge[i] + " | ");
		}
		System.out.println("Merge\n");
		//Vetor 2 Ordenado.
				for(int i = 0 ; i <= tam2; i++) {
					System.out.print(vet2Bubble[i] + " | ");
				}
				System.out.println("Bubble\n");
				for(int i = 0 ; i <= tam2; i++) {
					System.out.print(vet2Merge[i] + " | ");
				}
				System.out.println("Merge\n");
	}

}
