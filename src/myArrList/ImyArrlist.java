package myArrList;

public interface ImyArrlist {

	public int getElement(int index); // �������� ������� �� �������
	public void toConsole();
	public void add(int num);
	public void add(int index, int num);
 	public void add(int []arr); // ��������� ������ �������� �������, ��� ��� ���� ���� ������ ��� ��������
	public void delElem(int index); // ������ ��������� �������
	public void sortElem(); // ��������� ������
	public void clear(); // ������� �������
	public int size(); // ������ �������  ������ ������������ 
	public boolean isEmpty();// ������  boole false - ���� ���� ������ ������
	public int getIndexForElem(int numElem); // ������ ������ �������� (��������� ��� �������)
	 
}
