// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package MAEGAME;

<<<<<<< HEAD
import MAEGAME.Hero;

/************************************************************/
/**
 * 
 */
public class Cleric extends Hero {

	public Cleric() {
		super("Shaman",35,50);
		// TODO Auto-generated constructor stub
=======
import java.util.Scanner;

import MAEGAME.Hero;

/************************************************************/
/**
 * 
 */
public class Cleric extends Hero {

	public Cleric() {
		super("Cleric",-35,50);
		// TODO Auto-generated constructor stub
	}
	
	public void chooseVictim(Monster[] monsters, Hero[] heros){
		
		
		System.out.println("Who will " + this.name + " Heal " + "(select a hero)"  );
		
//		for(Monster i:this.monsters) {
//			System.out.println(i.name + "  -   " + i.getHppool());
//		}
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		this.Attack(heros[x-1]);
		
		
		
>>>>>>> branch 'master' of https://github.com/hamiddhosseini/MAEGAME.git
	}
	
};
