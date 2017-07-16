package myArrList;

public interface ImyArrlist {

	public int getElement(int index); // получить элемент по индексу
	public void toConsole();
	public void add(int num);
	public void add(int index, int num);
 	public void add(int []arr); // добавляет массив улучшить условие, так как если были данные они затрутся
	public void delElem(int index); // удалит выбранный елемент
	public void sortElem(); // сортирует массив
	public void clear(); // очистка массива
	public int size(); // размер массива  только заполненного 
	public boolean isEmpty();// пустой  boole false - если весь массив пустой
	public int getIndexForElem(int numElem); // выдаст индекс элемента (принимает сам элемент)
	 
}
