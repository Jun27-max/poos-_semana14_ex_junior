package poos3_semana14_ex_junior.entities;

import java.util.Comparator;

public class Compara implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		if(o1.getCodigo() == o2.getCodigo()) {
			if(o1.getPreco() > o2.getPreco()) {
				return -1;
			}
			else if (o1.getPreco() < o2.getPreco()) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			return (o1.getCodigo() > o2.getCodigo()) ? 1 : -1;
		}
		
	}

}
