// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package MAEGAME;

import java.util.Scanner;

import MAEGAME.Charcs;

/************************************************************/
/**
 * 
 */
public class Hero extends Charcs {
	/**
	 * 
	 */
	protected String name;

	public Hero(String name, int attackv,int hpp) {
		super();
		this.name = name;
		this.hppool = hpp;
		this.maxhppool = hpp;
		this.attackvalue = attackv;
	}
	
	public void chooseVictim(Monster[] monsters, Hero[] heros){
		
		
		System.out.println("Who will " + this.name + " attack"  );
		
//		for(Monster i:this.monsters) {
//			System.out.println(i.name + "  -   " + i.getHppool());
//		}
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		this.Attack(monsters[x-1]);
		
		
		
	}
	


	
	
};
