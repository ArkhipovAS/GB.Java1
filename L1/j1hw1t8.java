/**
* Java1 homework1 task8
* @Arkhipov Aleksandr
* version Jul 12, 2018
*/
class j1hw1t8 {

    public static void main (String[] args){
    	hello(500); //выводим в консоль возвращенный методом результат
	}
	public static void hello (int year){
		int a = year%4;
		int b = year%100;
		int c = year%400;
		if (a == 0 && b!= 0)
			System.out.println ("Year hight/Високосный год");
		else if (c == 0)
			System.out.println ("Year hight/Високосный год");
		else
			System.out.println ("Year standart/Обычный год");
	}
}
