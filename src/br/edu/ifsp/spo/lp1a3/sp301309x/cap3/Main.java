package br.edu.ifsp.spo.lp1a3.sp301309x.cap3;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
	
		Scanner scanf = new Scanner(System.in);
		
		String nome;
		String snome;
		int dia;
		int mes;
		int ano;
		
		System.out.println("Calculo de frequência cardíaca");
		
		System.out.println("Digite seu nome: ");
		nome = scanf.next();
		System.out.println("Digite seu sobrenome: ");
		snome = scanf.next();
		
		System.out.println("Inofrme seu dia de nascimento: ");
		dia = scanf.nextInt();
		System.out.println("Inofrme seu mes de nascimento: ");
		mes = scanf.nextInt();
		System.out.println("Inofrme seu ano de nascimento: ");
		ano = scanf.nextInt();
		
		HeartRates hr = new HeartRates (nome, snome, dia, mes, ano);
		hr.FcMax();
		hr.FcAlvo50();
		hr.FcAlvo85();
		
		System.out.println("-----Resultados-----");
		System.out.printf("Nome: %s %s\n", hr.getNome(), hr.getSnome() );
		System.out.printf("Data de nascimento: %d/%d/%d\n", hr.getDia(), hr.getMes(), hr.getAno());
		System.out.printf("Frequência cardíaca máxima: %d\n", hr.getFc1());
		System.out.printf("Frequência carcíaca alvo: entre %.2f e %.2f", hr.getFc2(), hr.getFc3());
		
				
	}
	
}
