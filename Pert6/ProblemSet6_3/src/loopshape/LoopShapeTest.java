package loopshape;

import java.util.Scanner;

public class LoopShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int leg = sc.nextInt();
        LoopShape.createRectangle(width, height);
        LoopShape.createTriangle(leg);
    }   
}
