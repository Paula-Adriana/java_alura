package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	A_Desejar {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.03");
		}
	},
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.15");
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.20");
		}
	};
	
	public abstract BigDecimal percentualReajuste();
	//abstrato = sem implementacao
	//cada constante � que precisa implementar o seu metodo. 
}
