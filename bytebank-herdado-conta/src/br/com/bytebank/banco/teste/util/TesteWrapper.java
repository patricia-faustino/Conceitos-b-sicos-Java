package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {
	public static void main(String[] args) {
		Integer idadeRef = 29; // autoboxing --> referencia para primitivo
		System.out.println(idadeRef.intValue());// unboxing--> primitivo para referencia
		
		Double doubleReferencia = Double.valueOf(3.2); //autoboxing
		System.out.println(doubleReferencia.doubleValue()); // unboxing
		
		Boolean booleanReferencia = Boolean.TRUE;
		System.out.println(booleanReferencia.booleanValue());
		
		Number floatReferencia = Float.valueOf(2.3f);
		System.out.println(floatReferencia.floatValue());
		
		List<Number> numeros = new ArrayList<>();
		numeros.add(1.2);
		numeros.add(1.25f);
		numeros.add(1);
	}
}
