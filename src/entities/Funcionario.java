package entities;

import java.util.List;
import java.util.Scanner;

public class Funcionario {
	
	static Scanner sc = new Scanner(System.in);
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void criarFuncionario(List<Funcionario> list) {
		
		System.out.println("------------------------------");
		System.out.print("Quantos novos funcionarios serão registrados? ");
		int aux = sc.nextInt();
		System.out.println();
		for (int i = 0 ; i < aux; i++) {
			System.out.print("Entre com o id do novo funcionario: ");
			int id = sc.nextInt();
			System.out.println();
			System.out.print("Entre com o nome do novo funcionario: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println();
			System.out.print("Entre com o salario do novo funcionario: ");
			double salario = sc.nextDouble();
			System.out.println();
			Funcionario newguy = new Funcionario (id, name, salario);
			list.add(newguy);
			System.out.println("Funcionario adicionado com sucesso");
			System.out.println();
		}	
		System.out.println("------------------------------");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public static void aumentaSalario(List<Funcionario> list) {
		System.out.println("------------------------------");
		System.out.print("Entre com o id do funcionario que recebera um aumento: ");
		int busca_id = sc.nextInt();
		boolean aux = false;
		System.out.println();
		for (Funcionario x : list) {
			if(x.getId() == busca_id) {
				System.out.print("Entre com a porcentagem do aumento: ");
				double porcentagem = sc.nextDouble()/100;
				System.out.println();
				x.salary = x.salary + (x.salary * porcentagem);
				aux = true;
			} 
		}
		if (aux == false) {
			System.out.println("Id invalido");	
		}
		System.out.println("------------------------------");
	}
	
	public static void mostrarFuncionarios(List<Funcionario> list) {
		System.out.println("------------------------------");
		System.out.println("Lista de funcionarios:");
		for (Funcionario x : list) {
			System.out.println( x.getId() + ", " + x.getName() + ", " + x.getSalary());
		}
		System.out.println("------------------------------");
	}
	
	
	
	
}
