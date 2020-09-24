package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		Funcionario.criarFuncionario(list);
		Funcionario.mostrarFuncionarios(list);
		Funcionario.aumentaSalario(list);
		Funcionario.mostrarFuncionarios(list);
		
		sc.close();
	}

}
