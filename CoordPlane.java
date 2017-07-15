import java.util.*;

public class CoordPlane {
    
    //Object Instance Variables
    CoordParms p = new CoordParms();
    StringBuilder xAxis = new StringBuilder("|");
    StringBuilder yAxis01 = new StringBuilder();
    StringBuilder yAxisVert = new StringBuilder();
    StringBuilder yAxisHoriz = new StringBuilder();
    ArrayList<StringBuilder> cartPlane = new ArrayList<>();
    int originXAxis;
    int originYAxis; 
    
    StringBuilder axis = new StringBuilder();
    
    public CoordPlane(CoordParms parms) {
        p.xInterval = parms.xInterval;
        p.xSubIntervalCnt = parms.xSubIntervalCnt;
        p.xAxisMin = parms.xAxisMin;
        p.xAxisMax = parms.xAxisMax;
        p.yInterval = parms.yInterval;
        p.ySubIntervalCnt = parms.ySubIntervalCnt;
        p.yAxisMin = parms.yAxisMin;
        p.yAxisMax = parms.yAxisMax;
    }//end constructor
    
    public void buildXAxis() {

        if (p.xAxisMin <= 0)
            originXAxis = (-p.xAxisMin/p.xInterval) * (p.xSubIntervalCnt + 1);
        for (int i = 0; i < (((p.xAxisMax-p.xAxisMin)/(p.xInterval))); i++) {
            for (int j = 0; j <p.xSubIntervalCnt; j++) {
                xAxis.append("-");
            }
            xAxis.append("|");
        }
        xAxis.setCharAt(originXAxis, '+');
    }//end buildXAxis
    
    public void buildYAxis() {      
        for (int i = 0; i <xAxis.length(); i++) { 
            yAxisVert.append(" ");
            if (xAxis.charAt(i)=='+')
                yAxisVert.setCharAt(i, '|');
        }//end vert for
        for (int i = 0; i < xAxis.length(); i++) {
            yAxisHoriz.append(" ");
            if (xAxis.charAt(i)=='+')
                yAxisHoriz.setCharAt(i, '-');            
        }//end horiz for           
    }//end buildYAxis   
    
    public void buildPlane() {
        if (p.yAxisMin <= 0)
            originYAxis = (-p.yAxisMin/p.yInterval) * (p.ySubIntervalCnt + 1);
        cartPlane.add(yAxisHoriz);
        for (int i = 0; i <(((p.yAxisMax-p.yAxisMin)/(p.yInterval))); i++) {
            for (int j = 0; j < p.ySubIntervalCnt; j++) {
                yAxisVert = new StringBuilder(yAxisVert);
                cartPlane.add(yAxisVert);
            }
            yAxisHoriz = new StringBuilder(yAxisHoriz);
            cartPlane.add(yAxisHoriz);            
        }
        cartPlane.set((originYAxis), xAxis);       
    }//end buildPlane
}//end class CoordPlane
