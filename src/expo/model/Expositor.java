/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Expositor {

	private String nome;
	private String morada;

	public Expositor()
	{
		this.nome = new String();
		this.morada = new String();
	}
	
	/**
	 * 
	 * @param empresa
	 */
	public void setNome(String empresa) {
		this.nome = empresa;
	}

	/**
	 * 
	 * @param morada
	 */
	public void setMorada(String morada) {
		this.morada = morada;
	}

}