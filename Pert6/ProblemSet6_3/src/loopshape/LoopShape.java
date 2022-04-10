package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        for (int a = 1; a <= height; a++) {
            for (int b = 1; b <= width; b++) {
                if(a == 1||a== height||b==1||b==width){
                System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }
        System.out.println("");
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        for (int i = 1; i <=leg; i++) {
            for (int j = 1; j <=i; j++) {
                if(j == 1||i==leg||j==i){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
