public class CoordParms {
    
        //object instance variables
    int xInterval;
    int xSubIntervalCnt;
    int xAxisMin;
    int xAxisMax;
    int yInterval;
    int ySubIntervalCnt;
    int yAxisMin;
    int yAxisMax;
    
    public CoordParms(){}//empty body constructor
    
    public CoordParms(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        xInterval = x1;
        xSubIntervalCnt = x2;
        xAxisMin = x3;
        xAxisMax = x4;
        yInterval = y1;
        ySubIntervalCnt = y2;
        yAxisMin = y3;
        yAxisMax = y4;
    }//end class constructor
            
}// end class








