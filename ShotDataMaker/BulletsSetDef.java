public class BulletsSetDef {
	public String name;
	public boolean split;
	public int rad;
	public int av;
	public int blend;
	public BulletsSetDef(){
		name="NO_NAME_BULLET";
		split=false;
		rad=-1;
		av=0;
		blend=0;
	}
	public BulletsSetDef(BulletsSetDef bSet){
		name=bSet.name;
		split=bSet.split;
		rad=bSet.rad;
		av=bSet.av;
		blend=bSet.blend;
	}
	public BulletsSetDef(String setName, boolean setSplit, int setRad, int setAv, int setBlend){
		name = setName;
		split = setSplit;
		rad = setRad;
		av = setAv;
		blend = setBlend;
	}
}
