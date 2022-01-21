package project;

public class main {

	public static void main(String[] args) {
		String name;
		String weapon;
		int health;
		player p=new player( name = "vaishu", weapon = "sword", health = 100);
		System.out.println(p.getName());
		System.out.println(p.getHealth());
		System.out.println(p.getWeapon());
		p.damagebyGun1();
		//p.damagebyGun2();
		//p.damagebyGun1();
		p.heal();

		
	}

}
