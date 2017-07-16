package myArrList;

public class MyArrList implements ImyArrlist {

	private int[] arr = new int[10]; // ���� ������ �������� �� 70% ���������
										// ��� � 2 ����
	public int count = 0; // ������� ����������� ����� �������.
	private int myLenght;

	// ���������� ������ � ������ �� �������
	public void add(int index, int num) {
		
		count++;
		
		if (count == arr.length - 2) {

			int[] arrTemp = arr; // �������� ������
			myLenght = arr.length * 2; // ����� ����������� �������...
										// ���������� ������ �������
			arr = new int[myLenght];

			// ���������� ������ �������
			for (int j = 0; j < arrTemp.length; j++) {
				arr[j] = arrTemp[j];
			}
			arrTemp = null;
		}

		if (arr[index] == 0) {
			arr[index] = num;

		} else {

			
			for (int i = count-1; i >= index; i--) {  // ����������� ������� ��� ����� - for (int i = count-1; i > index; i--) - �� ������� �� �����

				arr[i+1]=arr[i];
			}
			arr[index] = num;
		}

	}

	// ���������� ������ � ������
	public void add(int num) {

		// ���� ���� ���� ������ �������� ����� �� 80% Lenght-2 10-2=8

		if (count == arr.length - 2) {

			int[] arrTemp = arr; // �������� ������
			myLenght = arr.length * 2; // ����� ����������� �������...
										// ���������� ������ �������
			arr = new int[myLenght];

			// ���������� ������ �������
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

	// ������ ������� �� �������
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

		// ������� ��� ������ ������ ��������� - ���������� ���������� �����
		// ���� ������ � ���������� count-1

		arr = new int[10]; // ����� ����� ������

		count = 0; // ������� ���������� �������
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

		// ���� ������ ������ ��������, ���� ����� ������
		// ���� ������ ��� ������� �� ������
		// ������������� ����� ���� �� ���������� count ������������� ������
		// ����������� ������

		// ������ - ���� ������� 2 ��� 3 ������� ��������???
		int result = 0;

		if (count != 0 ) {
			for (int i = 0; i <= count - 1; i++) {

				if (numElem == arr[i]) {
					result = i;
					break; // ���� ������� ���� ���-�� �� ������ ������� �����
							// ������
				} else
					result = 01010101; // ������ ����� �� �������
			}
		} else
			result = 9999999; // ��������� ����� ������ ���� ("������ ��
								// ������")  
		   // � ��� ���� ��� ����� ������ � ������� ������� ����� � ������ - if (count != 0 && numElem <= count)

		return result;

	}

	@Override
	public void delElem(int index) {
		// TODO Auto-generated method stub
		// count - ������� ����������� �����
		// � ������ ������� ������� -1 �� �������� ����������� �����

		// index - ����� ��������� ������, �� ��� ��� ����� � ��� � ������
		// ����������
		// ��������� ������� ����������� ����� �� ����� 1
		count = count - 1; // ����� ����������� �������

		// ��������� ����������
		int temp = 0;

		// ������� ������
		arr[index] = 0;

		for (int i = index; i < count; i++) {

			// ��� � ������ �������� arr[i] < arr[i+1] �����

			// ������ ������� ������
			if (arr[i] < arr[i + 1]) {
				temp = arr[i + 1]; // ��������� ��������
				arr[i + 1] = arr[i]; // �������� ��������� ������ ������
				arr[i] = temp; // ����� �� ��� ����� ������ ������ ������ ������

			}
		}
	}

	 
}
