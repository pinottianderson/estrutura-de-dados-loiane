package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
	
		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);
		arrayList.add(1, "B");
		System.out.println(arrayList);
		boolean existe = arrayList.contains("A");
		if(existe){
			System.out.println("Existe");
		}else{
			System.out.println("Não existe");
		}
		
		int pos = arrayList.indexOf("B");
		if(pos > -1){
			System.out.println("Existe na posição: "+pos);
		}else{
			System.out.println("Não existe");
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		System.out.println(arrayList);
		arrayList.remove("B");
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.lastIndexOf("c"));
		arrayList.clear();
		
	}

}