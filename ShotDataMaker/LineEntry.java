public class LineEntry {
	public String content;
	public LineEntry llNext;
	public LineEntry llPrev;
	public LineEntry(String setContent, LineEntry prev){
		content = setContent;
		llNext = null;
		if(prev != null){
			prev.llNext = this;
		}
	}
}
