package main;

public class Skladiste implements Prostorija{
	float visina;
	int komadi;
//	@Override
//	public float visina() {
//		return visina;
//	}
//
//	@Override
//	public int komada(int komadi) {
//		this.komadi=komadi;
//	}
	Jelka[] jelke=new Jelka[komadi];
	
	public Skladiste(float visina, int komadi, Jelka[] jelke) {
		Jelka[] jelke2=new Jelka[komadi];
		int br=0;
		for(int i=0;i<komadi;i++) {
			if(!jelke[i].isBusen()&&jelke[i].getVisina()>visina) {
				jelke[br]=jelke[i];
			
			}
			
		}
		this.jelke=jelke2;
		
	}



	public String merryXmas() {
		String vracam=new String();
		for(int i=0;i<jelke.length;i++) {
			vracam=vracam+jelke[i].toString();
		}
		return vracam;
	}



	@Override
	public float visina() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int komada() {
		// TODO Auto-generated method stub
		return 0;
	}


	


	
	
}
