package aplication;

import java.util.Scanner;

import entidade.Estudantes;

public class Cadastro {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Quantos quartos deseja ocupar");
		int n= sc.nextInt();
		
		Estudantes[] vect =new Estudantes[9];
		
		for(int i=0; i<n; i++) {
			System.out.println();
			sc.nextLine();
			
			System.out.println("#" +(i+1));
			System.out.print("Nome: ");
			String nome= sc.next();
			System.out.print("Email: ");
			String email=sc.next();
			System.out.print("Quarto nr: " );
			int posicoes=sc.nextInt();
			vect[posicoes]= new Estudantes(nome, email);
			
		
		
			}
		System.out.println("Quartos ocupados:");
		for(int i =0; i<vect.length; i++) {
			
				if(vect[i]!=null) {
					
			System.out.println(vect[i]);
			System.out.println("Quarto nr: "+i);
			System.out.println();
				}
				
		}
		
		
		
		
		

	}

}
