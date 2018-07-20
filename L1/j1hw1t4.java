/**
* Java1 homework1 task4
* @Arkhipov Aleksandr
* version Jul 12, 2018
*/
class j1hw1t4 {

    public static void main (String[] args){
		System.out.println ("Result compare: = " + compare(11, 20)); //выводим в консоль возвращенный методом результат
	}
	public static boolean compare (int a, int b){
		if (10 <=(a+b) && (a+b) <=20){
			return true;
		}
		else
		return false;								
	}
}
