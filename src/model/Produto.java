/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Produto {

	private String nome;
	
	public Produto()
	{
		nome = new String();
	}

	/**
	 * 
	 * @param nome
	 */
	public void setProduto(String nome) {
		this.nome = nome;
	}

}