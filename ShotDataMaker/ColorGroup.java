
public class ColorGroup {
	public int length;
	public ColorDef[] cg;
	public ColorGroup(int len){
		length=len;
		cg = new ColorDef[length];
		//for(int i=0; i<length; i++){
		//	cg[i] = new ColorDef();
		//}
	}
	public ColorGroup(ColorGroup inCg){
		length=inCg.length;
		cg = new ColorDef[length];
		for(int i=0; i<length; i++){
			cg[i] = new ColorDef(inCg.cg[i]);
		}
	}
	public ColorGroup(String[] setNames, int[][] setValues){
		length=setNames.length;
		//if(length!=setValues.length){throw CgNamesToValues;}
		cg = new ColorDef[length];
		for(int i=0; i<length; i++){
			cg[i] = new ColorDef(setNames[i], setValues[i]);
		}
	}
	public String GetName(int index){
		return cg[index].name;
	}
	public int[] GetValue(int index){
		return cg[index].value;
	}
}
