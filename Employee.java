package aplication;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Funcionario;

public class Employee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list= new ArrayList<>();
		
		System.out.println();
		
		System.out.println("Digita o nr de fumcionarios: ");
		int a =sc.nextInt();
		
		for(int i=0; i<a; i++) {
			
			System.out.print("Funcionario #" +(i+1)+":");
			System.out.print("id: ");
			int id= sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome= sc.next();
			System.out.print("Slario: ");
			double salario= sc.nextInt();
			
			Funcionario emp= new Funcionario(nome, id, salario);
			
			list.add(emp);
		}
		
		System.out.print("digita o id que deseja aumentar o bonus salaria: ");
		int idsalario=sc.nextInt();
		
	}
		
	public Integer hasId(List<Funcionario> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				System.out.println(list.get(i).getId());
				return i;
			}else {
				
				return -1;
			}
			
		}
		return id;
		
		 
	}

	
	
}
