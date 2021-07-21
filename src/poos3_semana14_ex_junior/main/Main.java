package poos3_semana14_ex_junior.main;

import java.util.Locale;
import java.util.TreeSet;

import poos3_semana14_ex_junior.entities.Compara;
import poos3_semana14_ex_junior.entities.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		TreeSet<Produto> t = new TreeSet<>(new Compara());
		
		t.add(new Produto(4, "Palmolive", 2.00));
		t.add(new Produto(6, "Sebo", 2.50));
		t.add(new Produto(3, "Lux", 2.00));
		t.add(new Produto(2, "Rexona", 3.00));
		t.add(new Produto(1, "Francis", 4.00));
		t.add(new Produto(5, "Natura", 5.00));
		
		t.forEach(System.out::println);

	}

}
