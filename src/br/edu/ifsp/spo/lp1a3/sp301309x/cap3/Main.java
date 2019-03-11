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
		
		System.out.println("\n Digite seu nome: ");
		nome = scanf.next();
		System.out.println("\n Digite seu sobrenome: ");
		snome = scanf.next();
		
		System.out.println("\n Inofrme seu dia de nascimento: ");
		dia = scanf.nextInt();
		System.out.println("\n Inofrme seu mes de nascimento: ");
		mes = scanf.nextInt();
		System.out.println("\n Inofrme seu ano de nascimento: ");
		ano = scanf.nextInt();
		
		HeartRates hr = new HeartRates (nome, snome, dia, mes, ano);
		hr.FcMax();
		hr.FcAlvo50();
		hr.FcAlvo85();
		
		System.out.println("\n-----Resultados-----");
		System.out.printf("\nNome: %s %s", hr.getNome(), hr.getSnome() );
		System.out.printf("\nData de nascimento: %d/%d/%d", hr.getDia(), hr.getMes(), hr.getAno());
		System.out.printf("\nFrequência cardíaca máxima: %d", hr.getFc1());
		System.out.printf("\nFrequência carcíaca alvo: entre %.2f e %.2f\n", hr.getFc2(), hr.getFc3());
		
				
	}
	
}
