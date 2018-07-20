/**
* Java1 homework1 task6
* @Arkhipov Aleksandr
* version Jul 12, 2018
*/
class j1hw1t6 {

    public static void main (String[] args){
    	System.out.println ("Result compare: = " + detect(-11)); //выводим в консоль возвращенный методом результат
	}
	public static boolean detect (int a){
		if (a < 0 )			
			return true;
		else
			return false;

	}
}
