package main.java.com.techhub;

public class ArrayDemo {


    public void run(){
        //OneDimension();
        TwoDimension();
    }

    public void OneDimension(){

        // array creation
        int[] scores = new int[10];

        // array is a zero based index  0 1 2 3

        // array assignment
        scores[0] = 33;
        scores[1] = 60;
        scores[2] = 55;
        scores[3] = 77;
        scores[4] = 45;
        scores[5] = 69;
        scores[6] = 20;
        scores[7] =29;
        scores[8] = 50;
        scores[9] = 44;

        //
        int[] ages = {23, 24,20,18, 16, 14 , 22,15,17,18};

        int age_size = ages.length;
        int score_size = scores.length;

        System.out.printf("Age Size=%d : Score Size:%d\n", age_size, score_size);


        int age_fifth_pos = ages[4];
        int score_fifth_pos = scores[4];

        System.out.printf("Age at 5TH Pos=%d : Score at 5TH Pos:%d\n", age_fifth_pos, score_fifth_pos);

      // for(initilization; condition; increament){ }

        for(int counter =0; counter < scores.length; counter = counter +1 ){
            System.out.printf("Scores[%d] = %d  ", counter, scores[counter]);
        }
         System.out.printf("\n");

        // enhanced for loop
        for(int age : ages){
            System.out.printf(" %d ", age);
        }

    }

    public void TwoDimension(){

        int[][] table = new int[2][5];

        table[0][0] = 1;
        table[0][1] =2;
        table[0][2] = 3;
        table[0][3] =4;
        table[0][4] = 5;

        table[1][0] = 6;
        table[1][1] =7;
        table[1][2] = 8;
        table[1][3] =9;
        table[1][4] = 10;

        System.out.printf("2nd row by 4Th Col = %d \n",table[1][3]);

        int[][] table2 ={ {1,2,3,4,5}, {6,7,8,9,10}};

        System.out.printf(" 2nd row by 2nd col = %d \n", table2[1][1]);

        printTable(table);

        for(int row = 0; row < table.length; row = row + 1){

            for(int col =0; col < table[row].length;col++){
                int val = table[row][col];
                System.out.printf("table[%d][%d] = %d ", row,col, table[row][col]);
            }

        }


    }

    public void printTable(int[][] table){
        for(int row = 0; row < table.length; row = row + 1){

            if(row == 1) System.out.printf("\n");

            for(int col =0; col < table[row].length;col++){

                int val = table[row][col];
                System.out.printf(" %d ", val);

            }

        }

        System.out.printf("\n\n");
    }
}


