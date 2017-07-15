import java.util.*;

public class testPoints {
    public static void main(String args[]) {
        //////////////////////////LINEAR SECTION//////////////////////
        int slope = 8;
        int yint = 3;
        int nbrPoints = 50;//HAS TO BE LESS THAN ARRAY SIZE
        double lowerD = -25;//lowest poessible number
        double upperD = 30;//highest possible number
        int arraySize = 51;//amount of wanted points
        double amtInc = (upperD - lowerD)/(nbrPoints);
        double[][] arrayLinear = new double[nbrPoints][2];
        double[][] arrayPoints = {{0, 10},{7, 20},{-7,20},{15,30},{-15,30},{0,-10},{7,-20},{-7,-20},{15,-30},{-15,-30}};
        Points x = new Points();
        x.linear(arrayLinear, slope, yint, lowerD, nbrPoints, amtInc);
//        System.out.println("The slope is " + slope);
//        System.out.println("The y-intercept is " + yint);        
//            for (int i = 0; i < nbrPoints; i++, lowerD = lowerD + amtInc) {
//               System.out.println(String.format("Ordered Pair " + (i+1) + " (%.4s, %5.5s)", arrayLinear[i][0], arrayLinear[i][1]));
//            }//end for
//                System.out.println();
            ///////////////////////PARABOLIC SECTION/////////////////////////////////            
        int nbrPointsPara = 5;
        double[][] arrayPara = new double[nbrPointsPara][2];
        //int nbrPointsPara = 49;//HAS TO BE LESS THAN ARRAY SIZE
        double xVert = 0;
        double yVert = 0;
        double lowerBX = -10;
        int upperBX = 10;
        double pInc = 3;
        //double pInc = (upperBX - lowerBX)/(nbrPointsPara);
        double SD = .05;
        
        x.parabolic(arrayPara, xVert, yVert, SD, pInc, nbrPointsPara);
//            if (SD > 0)
//                System.out.println("The direction is up");
//            else 
//                System.out.println("The direction is down");
//            System.out.println("The vertex is (" + xVert + ", " + yVert + ")");
//                for (int j = 0; j < nbrPointsPara; j++, lowerBX = lowerBX + pInc) {
//                    System.out.println(String.format("Ordered Pair " + (j+1) + " (%.4s, %5.6s)", arrayPara[j][0], arrayPara[j][1]));
//                }//end for
    
                ////////GRAPHING SECTION/////////////////////////////
        //Order of Args for CoordParms constructor: xinterval, xsubinterval, xmin, xmax, yinterval, ysubinterval, ymin, ymax
        
        CoordParms parms01 = new CoordParms(10, 9, -10, 10, 10, 9, -10, 10);
        //CoordParms parms02 = new CoordParms(25, 2, -50, 100, 20, 2, -50, 100);
        CoordPlane plane01 = new CoordPlane(parms01);
        System.out.println("Coord Plane xInterval is " + plane01.p.xInterval);
        plane01.buildXAxis();
        plane01.buildYAxis();
        plane01.buildPlane();
//        for (int i = 0; i < plane01.cartPlane.size(); i++)
//             System.out.println(plane01.cartPlane.get(i));
        System.out.println("obj parms01 xinterval is " + parms01.xInterval);
        //System.out.println("obj parms02 xinterval is " + parms02.xInterval);
        PointPlotter plotter = new PointPlotter(arrayPara, plane01);
        //x.linear(arrayLinear, slope, yint, lowerD, nbrPoints, amtInc);
        plotter.plotPoints();
        for (int i = 0; i < plane01.cartPlane.size(); i++)
             System.out.println(plane01.cartPlane.get(i));
        
        
        
        
        
        
        
        
//                
//                ArrayList<StringBuilder> grid = new ArrayList<>();
//                StringBuilder xAxis = new StringBuilder();
//                StringBuilder yAxis = new StringBuilder();
//                StringBuilder yAxis2 = new StringBuilder();
//                xAxis.append("|----|----|----|----|----|----|----|----|----|----|----|----|----|----|----|----|----|----");
//                yAxis.append("                                        |                                                 ");
//                yAxis2.append("                                        |                                                 ");
//
//        
//                for (int i = 0; i < 10; i ++)
//                    grid.add(yAxis);
//                grid.add((grid.size()/2), xAxis);
//          
//                   yAxis2.replace(10,11,"x");
//                   grid.set(2,yAxis2);
//                  
//                
//                
//                for (int j = 0; j < grid.size(); j++)
//                    System.out.println(grid.get(j));
//                
//                StringBuilder quiz02[] = new StringBuilder[5];
//                for (int i = 0; i <quiz02.length; i++) {
//                    StringBuilder quiz01 = new StringBuilder(); 
//                    quiz01.append("0000099800000");
//                    quiz02[i] = quiz01;
//                    }
//                    quiz02[2].insert(6,"#");
//                    for (int i = 0; i < quiz02.length; i++)
//                        System.out.println(quiz02[i]);
//                
//                StringBuilder strB02[] = new StringBuilder[83000];
//                StringBuilder strIns = new StringBuilder();
//                int nbrIns = 1;                
//                for (int i = 0; i <strB02.length; i ++) {
//                    strIns.append("Element " + nbrIns + " --> '$ " + nbrIns + ".00'");
//                    strB02[i] = strIns;
//                    if (i == 6700 || i == 0)
//                        System.out.println(strB02[i].toString());
//                    if (i == 1)
//                    if (i == 48000) {
//                        strB02[i].insert(20,"!#@!!");
//                        System.out.println(strB02[i].toString());
//                    }
//                    strIns.delete(0, strIns.length()-1);
//                    nbrIns = nbrIns + 1;
//                }
//                    
                
              
                
//                System.out.println("\n\nSize of sb01 = " + xAxis.length());
//                System.out.println("Contents of sb01 = " + xAxis);
//        
//                xAxis.replace(6,7,"x");
//                System.out.println("\n\nSize of sb01 = " + xAxis.length());
//                System.out.println("Contents of sb01 = " + xAxis);
    }//end main    
}//end class


       //ARRAYLIST SECTION
        
        ////////////////////////////////////////////////////////////////////////
//        StringBuilder sb01 = new StringBuilder();

//ArrayList<Integer> list01 = new ArrayList<>();
//        list01.add(1);
//        list01.add(3);
//        list01.add(1,2);
//        System.out.println("\n\nSize of list01 = " + list01.size());
//        System.out.println("Contents of list01 = " + list01);
//        
         ////////////////////////////////////////////////////////////////////////
                
        
        
