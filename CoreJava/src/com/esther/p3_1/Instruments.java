package com.esther.p3_1;

public abstract class Instruments {
	abstract void play();

}


class Piano extends Instruments{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing tan tan tan tan");
		
	}
	
	
}

class Flute extends Instruments{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing toot toot toot toot");
	}
	
}
class Guitar extends Instruments{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is playing tin tin tin");
		
	}
	
}

class InstrumentMain{

	public static void main(String args[]){

		Instruments A[] = new Instruments[12];
		for (int iLoop=0; iLoop<12; iLoop++)

		{
			switch (iLoop%3){
			case 0: { A[iLoop] = new Piano(); break; }

			case 1: { A[iLoop] = new Flute(); break; }

			case 2: { A[iLoop] = new Guitar(); break; }
			}
			}



for (int iLoop=0; iLoop<12; iLoop++){


	System.out.println("------------------------------------");
	System.out.println(" object # " + (iLoop+1));

	A[iLoop].play();

	if (A[iLoop] instanceof Piano) { System.out.println("Piano"); }

	if (A[iLoop] instanceof Flute) { System.out.println("Flute"); }

	if (A[iLoop] instanceof Guitar) { System.out.println("Guitar"); }
	}
}
}