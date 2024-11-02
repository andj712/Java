package main;


import java.io.*;

public class Bozic {
	public Jelka[] metoda() {
	
	int br=0;
	try {
	BufferedReader in=
			new BufferedReader
				(new FileReader("Idila.txt"));
	int ukupno=Integer.parseInt(in.readLine());
	Jelka[] jelke2=new Jelka[ukupno];
	for(int i=0;i<ukupno;i++) {
		String s=in.readLine();
		String[] reci=s.split(",");
		if(reci.length==3) {
			
			Jelka jelka=new Jelka(reci[0], Integer.parseInt(reci[1]));
			jelke2[br++]=jelka;
		}
	}
	
	in.close();
	return jelke2;
	}catch(Exception e1) {
		System.out.println("WTF");
	}
	throw new RuntimeException();
	}
	public static void main(String[] args) {
		Bozic bozic2020=new Bozic();
		Jelka[] jelke=	bozic2020.metoda();
		Skladiste skladiste=new Skladiste(4,jelke.length,jelke);
		System.out.println(jelke.length);
		System.out.println(skladiste.merryXmas());
		
	}
}
