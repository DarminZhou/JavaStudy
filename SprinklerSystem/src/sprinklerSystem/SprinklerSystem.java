package sprinklerSystem;

class WaterSource {
	private String s;
	WaterSource(){
		System.out.println("WaterSource()");
		s="Constructed";
	}
	public String toString(){ return s; }
}

public class SprinklerSystem {
	private String valve1="qq",valve2="ww",valve3="r",valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	public String toString(){
		return 
				"valve1 = " + valve1 + " " +
				"valve2 = " + valve2 + " " +
				"valve3 = " + valve3 + " " +
				"valve4 = " + valve4 + " " +
				"i = " + i + " " + " f = " + f + " " + "source = " + source;
	}
	public static void main(String [] args){
		SprinklerSystem sprinklers= new SprinklerSystem();
		System.out.println(sprinklers);
	}
}
