// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package MAEGAME;

/************************************************************/
/**
 * 
 */
public class Game {
	
	public Charcs[] charcs;
	public int fightnb=0;
	public Hero[] heros = new Hero [4];
	
	
	public void ChooseHero() {//selects 4 Heros for the game
		//Here the user will select the heros!
		System.out.println("Please select your four champions! ");
		System.out.println(java.util.Arrays.asList(AllHeros.values()));	
		
		heros[0] = new Cleric();
		heros[1] = new Warrior();
		heros[2] = new Assasin();
		heros[3] = new Paladin();
		
	}
	
	public boolean checkgame() {//True if at least one Hero still alive
		int j =0;
		for (Hero i : this.heros) {
			j = j + i.getHppool();
		}
		if(j==0) {return false;}
		else{return true;}
	}
	
	public void startfight() {
		fightnb += 1;
		Fight fight = new Fight(heros,fightnb, 1);
		System.out.println("This is Level " + fightnb);
		fight.StartRound();	
	
	}
	
	
	public void startgame() {
		System.out.println("Welcome Mortals");
		this.ChooseHero();
		int j=1;
		while(this.checkgame() & j<3) {
			for(Hero i: heros) {
				if(i.getHppool() == 0) {i.setHppool(i.getMaxhppool()/4);}
				else {i.setHppool(i.getMaxhppool());}
			}
			
			this.startfight();
			j = j+1;
			
		}
		
		
	}
	
	
	
	
};
