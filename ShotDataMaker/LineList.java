public class LineList {
	public int size;
	public LineEntry entryFirst;
	public LineEntry entryLast;
	public LineEntry selected;
	public LineList(){
		size = -1;
		entryFirst = null;
		selected = null;
	}
	public void write(String v){
		if(entryFirst==null){
			size++;
			entryFirst = new LineEntry(v, null);
			entryLast = entryFirst;
			selected = entryFirst;
		}
		else{
			size++;
			LineEntry newEntry = new LineEntry(v, entryLast);
			entryLast.llNext = newEntry;
			entryLast = newEntry;
		}
	}
	public String GetLine(){
		return selected.content;
	}
	public void Advance(){
		LineEntry checkNext = selected.llNext;
		if(checkNext != null){
			selected = checkNext;
		}
	}
	public void Retreat(){
		LineEntry checkPrev = selected.llPrev;
		if(checkPrev != null){
			selected = checkPrev;
		}
	}
	public void Beginning(){	selected=entryFirst;	}
	public void Ending(){		selected=entryLast;		}
}

