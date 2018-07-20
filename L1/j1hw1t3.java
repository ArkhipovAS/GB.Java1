/**
* Java1 homework1 task3
* @Arkhipov Aleksandr
* version Jul 12, 2018
*/
class j1hw1t3 {

    public static void main (String[] args){
		System.out.println ("Calculation value: = " + calculation(1, 3, 4, 2));//выводим в консоль возвращенный методом результат
	}
	public static int calculation (int a,int b,int c,int d){ 	//метод возвращает целое число
		return a * (b + (c / d));								
	}
}
