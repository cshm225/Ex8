public class Cleric{
	int hp=50,mp=10;
	final int maxHp=50;
	final int maxMp=10;
	String name;
	public void selfAid(){
		System.out.printf("%sはセルエイドをとなえた%n",this.name);
		this.mp-=5;
		this.hp=50;
		System.out.printf("%sはHPが最大まで回復した%n",this.name);

	}
	public int pray(int time){
		int healHp;
		System.out.printf("%sは%d秒祈った%n",this.name,time);

		healHp=time+new Random().nextInt(3);
		healHp=Math.min(this.maxMp-thismp,healhp);
		System.out.printf("%d回復した",healHp);
		return healHp;
	}
}
