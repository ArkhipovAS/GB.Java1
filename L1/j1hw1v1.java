/**
* Java1 homework1 task1-8
* @Arkhipov Aleksandr
* @version Jul 12, 2018
*/
class j1hw1v1 {
	//Task №2
	byte a = 13;
	short b = 13000;
	int c = 1313130;
	long d = 13000000L;
	float e = 13.1f;
	double f = 3.141592;
	boolean g = false;
	char h = 'I';
	String L = "stroka";

	public static void main (String[] args){
	System.out.println ("Calculation value: = " + calculation(1, 3, 4, 2));//выводим в консоль возвращенный методом результат
	System.out.println ("Result compare: = " + compare(11, 20)); //выводим в консоль возвращенный методом результат
	detect(-11);
	System.out.println ("Result compare: = " + detect1(-11)); //выводим в консоль возвращенный методом результат
	hello("Sasha"); //выводим в консоль возвращенный методом результат
	year1(500); //выводим в консоль возвращенный методом результат
	}
	//Task №3 metod calculation 
	public static int calculation (int a,int b,int c,int d){ 	//метод возвращает целое число
		return a * (b + (c / d));								
	}
	//Task №4 metod compare
		public static boolean compare (int a, int b){
		if (10 <=(a+b) && (a+b) <=20){
			return true;
		}
		else
		return false;								
	}
	//Task №5 metod detect
	public static void detect (int a){
		if (a >=0 ){
			System.out.println ("positive number");
		}
		else{
			System.out.println ("negative number" );
		}
	}

	//Task №6 metod detect1
	public static boolean detect1 (int a){
		if (a < 0 )			
			return true;
		else
			return false;
	}

	//Task №7 metod hello
	public static void hello (String name){
		System.out.println ("Hello," + name + "!");
	}

	//Task №8 metod year1
		public static void year1 (int year){
		int a = year%4;
		int b = year%100;
		int c = year%400;
		if (a == 0 && b!= 0)
			System.out.println ("Year hight");
		else if (c == 0)
			System.out.println ("Year hight");
		else
			System.out.println ("Year standart");
	}
}