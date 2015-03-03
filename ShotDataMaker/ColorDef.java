public class ColorDef {
	public String name;
	public int[] value;
	public ColorDef(ColorDef def){
		name = def.name;
		value = new int[3];
		for(int i=0; i<3; i++){
			value[i]=def.value[i];
		}
	}
	public ColorDef(String setName, int[] setValue){
		name = setName;
		value = new int[3];
		value = setValue;
	}
}
