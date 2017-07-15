import java.util.*;

public class PointPlotter {
    CoordPlane plane;
    char plotSymbol;
    double points[][];
    int xindex;
    int yindex;
    int nbr;
       
    public PointPlotter(double pointlist[][], CoordPlane plane01) {
    plane = plane01;
    points = pointlist;
    plotSymbol = 8226;
    nbr = 97;
    
    
        
    }//end overload
    
    public void findXIndex(double nbr) {
                xindex = plane.originXAxis + ((int)nbr/(plane.p.xInterval/(plane.p.xSubIntervalCnt+1)));
    }//end FindX
    
    public void findYIndex(double nbr) {

                yindex = plane.originYAxis - ((int)nbr/(plane.p.yInterval/(plane.p.ySubIntervalCnt+1)));
        

    }//end FindY
    
    public void plotPoints() {
        for (int i = 0; i<points.length; i++) {
            
            findXIndex(points[i][0]);
            findYIndex(points[i][1]);
            plane.cartPlane.get(yindex).setCharAt(xindex, plotSymbol);
            }
        
        
    }//end PlotPoints
    
    public void getInvalidPoints() {
        
    }//end Invalid

}//end Class
