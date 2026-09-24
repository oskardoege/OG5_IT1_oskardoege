package de.oszimt.starsim2099;

public class TestPilot {

	public static void main(String[] args) {
		double posx = (double)(Math.random() * 160);
		double posy = (double)(Math.random() * 50);
		String grad = "Testpilot";
		String name = "Max Musterpilot";
		
		Pilot meinPilot = new Pilot(posx,posy,grad,name);
		meinPilot.setGrad(grad);
		meinPilot.setName(name);
		meinPilot.setPosx(posx);
		meinPilot.setPosy(posy);
		
		if (meinPilot.getGrad().equals(grad))
			System.out.println("Implementierung 'Grad'  korrekt!");
		
		if (meinPilot.getName().equals(name))
			System.out.println("Implementierung 'Name'  korrekt!");
		
		if (meinPilot.getPosx() == posx)
			System.out.println("Implementierung 'Position X'  korrekt!");
		
		if (meinPilot.getPosy() == posy)
			System.out.println("Implementierung 'Position Y' korrekt!");
	}

}
