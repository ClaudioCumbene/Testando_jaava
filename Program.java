package aplication;

import java.util.Scanner;

import entidade.Productos;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero producto: ");
		int n= sc.nextInt();
		
		Productos[] vect = new Productos[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String nome= sc.next();
			double preco= sc.nextDouble();
			vect[i]= new Productos(nome, preco);
			
		}
		
		double sum=0;
		
		for(int i=0; i<n;i++) {
			
			sum+= vect[i].getPreco();
			
		}
		
		sum/=n;
		
		System.out.println(sum);
		
		
		
		
	}

}
