public class SimpleBulletsGroup {
	public int length;
	public BulletsSetDef[] bg;

	// We can set bullet values piece-meal.
	// These are the counters for currently set values.
	private int cNames=0;
	private int cSplits=0;
	private int cRads=0;
	private int cAvs=0;
	private int cBlends=0;

	public SimpleBulletsGroup(int setLength){
		cNames=0;
		cSplits=0;
		cRads=0;
		cAvs=0;
		cBlends=0;
		length = setLength;
		bg = new BulletsSetDef[length];
		for(int i=0; i<length; i++){
			bg[i] = new BulletsSetDef();
		}
	}
	public SimpleBulletsGroup(String[] setNames, boolean[] setSplits, int[] setRads, int[] setAvs, int[] setBlends){
		cNames=0;
		cSplits=0;
		cRads=0;
		cAvs=0;
		cBlends=0;
		length = setNames.length;
		bg = new BulletsSetDef[length];
		for(int i=0; i<length; i++){
			bg[i] = new BulletsSetDef(setNames[i],setSplits[i],setRads[i],setAvs[i],setBlends[i]);
		}
	}

	public void AddNames(String[] addNames){
		for(int i=0; i<addNames.length && cNames<length; i++){
			bg[cNames].name = addNames[i];
			cNames++;
		}
	}
	public void AddSplits(boolean[] addSplits){
		for(int i=0; i<addSplits.length && cSplits<length; i++){
			bg[cSplits].split = addSplits[i];
			cSplits++;
		}
	}
	public void AddRads(int[] addRads){
		for(int i=0; i<addRads.length && cRads<length; i++){
			bg[cRads].rad = addRads[i];
			cRads++;
		}
	}
	public void AddAvs(int[] addAvs){
		for(int i=0; i<addAvs.length && cAvs<length; i++){
			bg[cAvs].av = addAvs[i];
			cAvs++;
		}
	}
	public void AddBlends(int[] addBlends){
		for(int i=0; i<addBlends.length && cBlends<length; i++){
			bg[cBlends].blend = addBlends[i];
			cBlends++;
		}
	}

	public void AddXSplits(int x, boolean v){
		for(int i=0; i<x && cSplits<length; i++){
			bg[cSplits].split = v;
			cSplits++;
		}
	}
	public void AddXRads(int x, int v){
		for(int i=0; i<x && cRads<length; i++){
			bg[cRads].rad = v;
			cRads++;
		}
	}
	public void AddXAvs(int x, int v){
		for(int i=0; i<x && cAvs<length; i++){
			bg[cAvs].av = v;
			cAvs++;
		}
	}
	public void AddXBlends(int x, int v){
		for(int i=0; i<x && cBlends<length; i++){
			bg[cBlends].blend = v;
			cBlends++;
		}
	}
}
