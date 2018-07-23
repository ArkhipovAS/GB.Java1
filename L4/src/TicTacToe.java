/**
 * Java1 homework4 task1-3
 * @Arkhipov Aleksandr
 * @version Jul 23, 2018
 */
import java.time.OffsetTime;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


class TicTacToe {
    final int SIZE = 5;//playing field
    final int FISKS = 4;//lenght WIN row
    final int OFFSET = SIZE-FISKS;// offset SIZE
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char [][] map = new char [SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new TicTacToe();
    }

    TicTacToe(){
        initMap();
        printMap();
        while (true){
            humanTurn();
            if (checkWinNew(DOT_X)){
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()){
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWinNew(DOT_O)){
                System.out.println("AI WON!");
                break;
            }
        }
        System.out.println("GAME OVER!");
        printMap();
    }

    void initMap(){
        for (int i=0; i<SIZE; i++)
            for (int j=0; j<SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap(){
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++)
                System.out.print(map[i][j] +".");
            System.out.println();
        }
        System.out.println();

    }

    void humanTurn(){
        int x, y;
        do {
            System.out.println("Enter vertical - X and horizontal - Y (1.."+SIZE+"):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while(!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn(){
        int x, y;
        do {

            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }while(!isCellValid(x,y));
        map[y][x] = DOT_O;
    }

    boolean checkWinNew (char dot){
        //vertikal
        boolean flag1 = true;
        boolean flag2 = true;
        for (int k = 0; k<=OFFSET; k++){
            for (int i=0+k; i<SIZE-OFFSET+k; i++){
                flag1 = true;
                flag2 = true;
                for (int j=0+k; j<SIZE-OFFSET+k; j++){
                    flag1 &= (map[j][i] == dot);
                    flag2 &= (map[i][j] == dot);
                }
                if (flag1 == true || flag2 == true)
                    return true;
            }
        }
        //horizontal
        /*for (int k = 0; k<OFFSET; k++) {
            for (int i = 0+k; i < SIZE-OFFSET; i++) {
                flag1 = true;
                for (int j = 0+k; j < SIZE-OFFSET; j++) {
                    flag1 &= (map[i][j] == dot);
                }
                if (flag1 == true)
                    return true;
            }
        }*/

        //diagonal
        for (int k = 0; k<=OFFSET; k++) {
            for (int z=0; z<=OFFSET; z++){
                flag1 = true;
                for (int i = 0+k, j = SIZE-1-z; i < SIZE-OFFSET+k; i++, j--)
                    flag1 &= (map[i][j] == dot);
                if (flag1 == true)
                    return true;
            }
        }

        for (int k = 0; k<=OFFSET; k++) {
            for (int z=0; z<=OFFSET; z++){
                flag1 = true;
                for (int i = 0+k, j = 0+z; i < SIZE-OFFSET+k; i++, j++)
                    flag1 &= (map[i][j] == dot);
                if (flag1 == true)
                    return true;
            }
        }
        return false;
    }

    boolean checkWin (char dot){
        char[] templateArray1 = new  char[SIZE];//template1 array
        char[] templateArray11 = new  char[SIZE];//template11 array
        char[] templateArray2 = new  char[SIZE];//horizontal row
        char[] templateArray3 = new  char[SIZE];//vertical col
        char[] templateArray4 = new  char[SIZE];//diagonal
        char[] templateArray5 = new  char[SIZE];//invert diagonal
            Arrays.fill(templateArray1, dot);
            Arrays.fill(templateArray11, dot);
            templateArray1[(templateArray1.length-1)]=DOT_EMPTY;
            templateArray11[0] = DOT_EMPTY;
        Arrays.fill(templateArray4, DOT_EMPTY);
        Arrays.fill(templateArray5, DOT_EMPTY);

        for (int a = 0, d = SIZE-1; a < SIZE; a++, d--) {
            Arrays.fill(templateArray2, DOT_EMPTY);
            Arrays.fill(templateArray3, DOT_EMPTY);
            for (int b = 0; b < SIZE; b++){
                templateArray2[b] = map[a][b];
                templateArray3[b] = map[b][a];
                if (isArrCompare (templateArray1, templateArray2) || isArrCompare (templateArray1, templateArray3) || isArrCompare(templateArray11, templateArray2) || isArrCompare (templateArray11, templateArray3) )
                    return true;
            }
        templateArray4[a] = map[a][a];
        templateArray5[a] = map[a][d];
        if (isArrCompare (templateArray1, templateArray4) || isArrCompare (templateArray1, templateArray5) || isArrCompare (templateArray11, templateArray5) || isArrCompare (templateArray11, templateArray5))
            return true;
        }

        //check horizontals 3х3
        //if (map[0][0] == dot && map[0][1] ==dot && map[0][2] ==dot) return true;
        //if (map[1][0] == dot && map[1][1] ==dot && map[1][2] ==dot) return true;
        //if (map[2][0] == dot && map[2][1] ==dot && map[2][2] ==dot) return true;
        //check verticals
        //if (map[0][0] == dot && map[1][0] ==dot && map[2][0] ==dot) return true;
        //if (map[0][1] == dot && map[1][1] ==dot && map[2][1] ==dot) return true;
        //if (map[0][2] == dot && map[1][2] ==dot && map[2][2] ==dot) return true;
        //check diagonals
        //if (map[0][0] == dot && map[1][1] ==dot && map[2][2] ==dot) return true;
        //if (map[2][0] == dot && map[1][1] ==dot && map[0][2] ==dot) return true;
        return false;
    }

    boolean isMapFull (){
        for (int i=0; i<SIZE; i++)
            for (int j=0; j<SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid (int x, int y){
        if (x<0 || y<0 || x>=SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY;
    }
//Compare massivs
    boolean isArrCompare (char [] a, char [] b){
        if (Arrays.equals(a, b))
            return true;
        else
            return false;
    }
}