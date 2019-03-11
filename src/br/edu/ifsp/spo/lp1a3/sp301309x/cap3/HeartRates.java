package br.edu.ifsp.spo.lp1a3.sp301309x.cap3;

public class HeartRates {
	
	String nome;
	String snome;
	int dia;
	int mes;
	int ano;
	int idade;
	int fc1;
	double fc2; 
	double fc3;
	
	public HeartRates (String nm, String snm, int dia, int mes, int ano) {
		this.nome=nm;
		this.snome=snm;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSnome() {
		return this.snome;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public int getFc1() {
		return this.fc1;
	}
	
	public double getFc2() {
		return fc2;
	}
	
	public double getFc3() {
		return this.fc3;
	}
	
	public void setNome (String nm) {
		this.nome=nm;
	}
	
	public void setSnome (String snm) {
		this.snome=snm;
	}
	
	public void setDia (int dia) {
		this.dia=dia;
	}
	
	public void setMes (int mes) {
		this.mes=mes;
	}
	
	public void setAno (int ano) {
		this.ano=ano;
	}
	
	public void setIdade (int idade) {
		this.idade=idade;
	}
	
	public void setFc1 (int fc1) {
		this.fc1=fc1;
	}
	
	public void setFc2 (int fc2) {
		this.fc2=fc2;
	}
	
	public void setFc3 (int fc3) {
		this.fc3=fc3;
	}
	
	public int Idade () {
		this.idade = 2019 - this.ano;
		return this.idade;
	}
	
	public int FcMax () {
		this.fc1 = 220 - this.idade;
		return this.fc1;
	}

	public double FcAlvo50 () {
		this.fc2 = this.fc1 * 0.5;
		return this.fc2;
	}
	
	public double FcAlvo85 () {
		this.fc3 = this.fc1 * 0.85;
		return this.fc3;
	}
}
