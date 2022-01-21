package project;

public class player {
	private String name;
	private String weapon;
	private int health;
	
	public player(String name, String weapon, int health){
		this.name = name;
		this.weapon = weapon;
		this.health = health;
	}
	
	public void damagebyGun1(){
		this.health -= 30;
		if(this.health<=0){
			this.health = 0;
		}
		System.out.println("got hit by gun1 and health is reduced by 30. the new health is "+this.health);
		if(this.health==0){
			System.out.println(getName()+" is dead");
		}
	}
	

	public void damagebyGun2(){
		this.health -= 50;
		if(this.health<=0){
			this.health = 0;
		}
		System.out.println("got hit by gun2 and health is reduced by 50. the new health is "+this.health);
		if(this.health==0){
			System.out.println(getName()+"is dead");
		}
	}
	
	public void heal(){
		if(this.health<=0){
			System.out.println("player is dead and heal is not possible");
		} 
		else{
			this.health=100;
			System.out.println("Health is "+this.health);
		}
	}
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
		
	}

