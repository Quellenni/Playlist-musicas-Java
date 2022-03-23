package edu.mjv.school.projetofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Musica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private Genero genero;
	private double duracao;
	
	@ManyToOne
	@JoinColumn(name = "artista_id", referencedColumnName = "id" )
	private Artista artista;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	@Override
	public String toString() {
		return "Musica [id=" + id + ", nome=" + nome + ", genero=" + genero + ", duracao=" + duracao + ", artista="
				+ artista + "]";
	}
	public Musica() {
		super();
	}
	
	
	
	

}
