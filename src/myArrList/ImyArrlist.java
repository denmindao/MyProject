package myArrList;

public interface ImyArrlist {

	public int getElement(int index); // ïîëó÷èòü ýëåìåíò ïî èíäåêñó
	public void toConsole();
	public void add(int num);
	public void add(int index, int num);
 	public void add(int []arr); //  новый репо комент
	public void delElem(int index); // óäàëèò âûáðàííûé åëåìåíò
	public void sortElem(); // ñîðòèðóåò ìàññèâ
	public void clear(); // î÷èñòêà ìàññèâà
	public int size(); // ðàçìåð ìàññèâà  òîëüêî çàïîëíåííîãî 
	public boolean isEmpty();// ïóñòîé  boole false - åñëè âåñü ìàññèâ ïóñòîé
	public int getIndexForElem(int numElem); // âûäàñò èíäåêñ ýëåìåíòà (ïðèíèìàåò ñàì ýëåìåíò)
	 
}
