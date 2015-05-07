/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import java.util.Scanner;

/**
 *
 * @author amiguezotero
 */
public class Superficies {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc;
    
    public static void main(String[] args) {
   
        Modelo mod = new Modelo();
        vista vis = new vista();
        String shapeType;

        sc = new Scanner(System.in);

  
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        
        mod.setShapeType(shapeType);
       
        System.out.println("You said: " + shapeType);

       
        if (shapeType.equals("square")) {
           
            float squareArea;
            float sideLength;

      
            System.out.println("what is the side length?");
            sideLength = sc.nextFloat();
            
            mod.setSideLength(sideLength);
            squareArea = sideLength * sideLength;
            
            mod.setSquareArea(squareArea);
            vis.imprimir(mod);

        }
        if (shapeType.equals("rectangle")) {
            
            float sideLength;
            float sideHeight;
            float rectangleArea;

            
            System.out.println("what is the rectangles width?");
            sideLength = sc.nextFloat();
            mod.setSideLength(sideLength);
            System.out.println("What is the rectangles height?");
            sideHeight = sc.nextFloat();
            mod.setSideHeight(sideHeight);
            rectangleArea = sideLength * sideHeight;
            mod.setRectangleArea(rectangleArea);
            vis.imprimir(mod);

        }
        if (shapeType.equals("triangle")) {
            
            float baseLength;
            float height;
            float triangleArea;

            
            System.out.println("What is the base length of the triangle?");
            baseLength = sc.nextFloat();
            mod.setBaseLength(baseLength);
            System.out.println("What is the height of the triangle?");
            height = sc.nextFloat();
            mod.setHeight(height);
            triangleArea = (float) (0.5 * baseLength * height);
            mod.setTriangleArea(triangleArea);
            vis.imprimir(mod);

        }
        if (shapeType.equals("circle")) {
          
            float radius;
            float circleArea;

            
            System.out.println("What is the radius of the circle?");
            radius = sc.nextFloat();
            mod.setRadius(radius);
            circleArea = radius * radius;
            circleArea = (float) (3.14159265 * circleArea);
            mod.setCircleArea(circleArea);
            vis.imprimir(mod);
        }

    }

    }
    

