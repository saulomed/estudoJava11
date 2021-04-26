package br.com.saulo.java.enums;

import lombok.Getter;

public enum Apple {
	
	Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
	
	@Getter
	private int price;
	
	Apple(int p)
	{
		this.price = p;
	}
	//pode existe mais de um construtor em um enum como uma classe
	Apple()
	{
		this.price = -1;
	}

}
