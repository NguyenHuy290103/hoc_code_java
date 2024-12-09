package video1_77;public class bai18_a {
    public static void main(String[] args) {
        //a
        for (int i=1; i<=4; i++){
            for (int j=1; j<=4; j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //b
        for (int i=1; i<=4; i++){
            for (int j=1; j<=4; j++){
                if (j==1||j==4||i==1||i==4)
                    System.out.print("*"+"\t");
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //c
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //d
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                if (i==3 && j==2)
                    System.out.print(" "+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //e
        for (int i=4; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //f
        for (int i=4; i>=1; i--){
            for (int j=1; j<=i; j++){
                if (i == 3 && j == 2) {
                    System.out.print(" " + "\t");
                } else {
                    System.out.print("*" + "\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //g
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4; j++) {
                if ((i > j)) {
                    System.out.print(" " + "  ");
                } else {
                    System.out.print("*" + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //h
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4; j++) {
                if ((i > j) || (i == 2 && j == 3)) {
                    System.out.print(" " + "  ");
                } else {
                    System.out.print("*" + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //i
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 7; j++) {
                if ((i > j) || (i+j>8)) {
                    System.out.print(" " + "  ");
                } else {
                    System.out.print("*" + "  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //j
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 7; j++) {
                if ((i > j) || (i+j>8)) {
                    System.out.print(" " + "\t");
                }
                else if ((i==3&&j==4)||(i==2&&j==3)||(i==2&&j==4)||(i==2&&j==5)){
                    System.out.print(" " + "\t");
                }
                else
                    System.out.print("*" + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //k
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if ((i < j)) {
                    System.out.print(" " + "\t");
                }
                else
                    System.out.print("*" + "\t");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if ((i < j)) {
                    System.out.print("*" + "\t");
                }
                else
                    System.out.print(" " + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //k
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if ((i < j)||(i==3&&j==2)||(i==4&&j==2)||(i==4&&j==3)) {
                    System.out.print(" " + "\t");
                }
                else
                    System.out.print("*" + "\t");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if ((i >= j)||(i==1&&j==3)) {
                    System.out.print(" " + "\t");
                }
                else
                    System.out.print("*" + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //m
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if ((i >= j)) {
                    System.out.print("*" + "\t");
                }
                else
                    System.out.print(" " + "\t");
            }
            System.out.println("");
        }
        for (int i=1; i<=7; i++){
            System.out.print("*" + "\t");
        }
        System.out.println("");

        for (int i=3;i>=1;i--){
            for (int j=7;j>=1;j--){
                if (i>=j){
                    System.out.print("*"+"\t");
                }
                else
                    System.out.print(" "+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //n
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if ((i < j)||(i==3&&j==2)) {
                    System.out.print(" " + "\t");
                }
                else
                    System.out.print("*" + "\t");
            }
            System.out.println("");
        }
        for (int i=1; i<=7; i++){
            System.out.print("*" + "\t");
        }
        System.out.println("");

        for (int i=3;i>=1;i--){
            for (int j=7;j>=1;j--){
                if ((i<j) ||(i==3&&j==2)){
                    System.out.print(" "+"\t");
                }
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
    }
}
