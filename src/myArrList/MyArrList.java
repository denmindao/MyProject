package myArrList;

public class MyArrList implements ImyArrlist {

	private int[] arr = new int[10]; // если массив заполнен на 70% увеличить
										// его в 2 раза
	public int count = 0; // счетчик заполненных €чеек массива.
	private int myLenght;

	// ƒобавление данных в массив по индексу
	public void add(int index, int num) {
		
		count++;
		
		if (count == arr.length - 2) {

			int[] arrTemp = arr; // временны массив
			myLenght = arr.length * 2; // забыл сокращенный вариант...
										// увеличиваю длинну массива
			arr = new int[myLenght];

			// «аполнение нового массива
			for (int j = 0; j < arrTemp.length; j++) {
				arr[j] = arrTemp[j];
			}
			arrTemp = null;
		}

		if (arr[index] == 0) {
			arr[index] = num;

		} else {

			
			for (int i = count-1; i >= index; i--) {  // »значальный вариант был такой - for (int i = count-1; i > index; i--) - он работал не верно

				arr[i+1]=arr[i];
			}
			arr[index] = num;
		}

	}

	// ƒобавление данных в массив
	public void add(int num) {

		// Ѕеру пока если массив заполнен почти на 80% Lenght-2 10-2=8

		if (count == arr.length - 2) {

			int[] arrTemp = arr; // временны массив
			myLenght = arr.length * 2; // забыл сокращенный вариант...
										// увеличиваю длинну массива
			arr = new int[myLenght];

			// «аполнение нового массива
			for (int j = 0; j < arrTemp.length; j++) {
				arr[j] = arrTemp[j];
			}
			arrTemp = null;

		}

		arr[count] = num;
		count++;
	}

	public int getElement(int index) {

		return arr[index];
	}

	// ¬ыдача массива на консоль
	public void toConsole() {

		if (count != 0) {

			for (int i = 0; i < count; i++) {
				System.out.print(arr[i] + " ");
			}

		} else
			System.out.print("ArrList is empty");
	}

	// ---------------------------------------------------

	  @Override
	  public void add(int[] arr) {
	  // TODO Auto-generated method stub
	 
		   this.arr = new int[arr.length];
		    
		   for (int j = 0; j < arr.length; j++) {
				this.arr[j] = arr[j];
			}	
			count=arr.length;
			 
		    
	  }

	
	  
	  
	  @Override
	public void sortElem() {
		// TODO Auto-generated method stub

		    for (int i=0; i< count-1; i++){
		    	for (int j=0; j< (count-1)-i; j++){
		    		
		    		 if (arr[j]>arr[j+1]){
		    			 int temp=arr[j+1];
		    			 arr[j+1]=arr[j];
		    			 arr[j]=temp;
		    		 }
		    	}
		    }
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

		// ќбнул€ю все €чейки кторые заполнены - количество заполненыз €чеек
		// есть всегда в глобальном count-1

		arr = new int[10]; // «абил новую ссылку

		count = 0; // ќбнул€ю глобальный счетчик
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean result;

		if (count == 0) {
			result = false;
		} else
			result = true;

		return result;
	}

	@Override
	public int getIndexForElem(int numElem) {
		// TODO Auto-generated method stub

		// Ћибо выдает индекс элемента, если такой найден
		// либо выдает что элемент не найден
		// отталкиваемс€ оп€ть таки от глобальной count просматриваем только
		// заполненные €чейки

		// ¬ќѕ–ќ— - если найдена 2 или 3 похожих элемента???
		int result = 0;

		if (count != 0 ) {
			for (int i = 0; i <= count - 1; i++) {

				if (numElem == arr[i]) {
					result = i;
					break; // пока обрываю цикл что-бы не искать похожее число
							// дальше
				} else
					result = 01010101; // ќшибка число не найдено
			}
		} else
			result = 9999999; // ќшибочный номер массив пуст ("»ндекс не
								// найден")  
		   // а что если эту ветку убрать и условие сделать таким в начале - if (count != 0 && numElem <= count)

		return result;

	}

	@Override
	public void delElem(int index) {
		// TODO Auto-generated method stub
		// count - счетчик заполненных €чеек
		// в первую очередь отнимаю -1 от счетчика заполненных €чеек

		// index - номер удал€емой €чейки, то что мне нужно с нее и начнем
		// стартовать
		// ”меньшаем счетчик заполненных €чеек на минус 1
		count = count - 1; // «абыл сокрещенный вариант

		// временна€ переменна€
		int temp = 0;

		// ќбнул€ю €чейку
		arr[index] = 0;

		for (int i = index; i < count; i++) {

			// тут € должен сравнить arr[i] < arr[i+1] тогда

			// ћен€ем местами €чейки
			if (arr[i] < arr[i + 1]) {
				temp = arr[i + 1]; // временное хранение
				arr[i + 1] = arr[i]; // переношу удаленную €чейку вперед
				arr[i] = temp; // ¬ношу на шаг назад полную €чейку вместо пустой

			}
		}
	}

	 
}
