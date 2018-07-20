/**
* Java1 homework1 task5
* @Arkhipov Aleksandr
* version Jul 12, 2018
*/
class j1hw1t5 {

    public static void main (String[] args){
    	detect(-11);
		//System.out.println ("Result compare: = " + detect(11)); //выводим в консоль возвращенный методом результат
	}
	public static void detect (int a){
		if (a >=0 ){
			System.out.println ("positive number");
		}
		else{
			System.out.println ("negative number" );
		}
	
	}
}
