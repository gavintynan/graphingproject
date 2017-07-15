public class Points {
    public void linear(double[][] w, int m, int b, double x, int points, double incr) {
        for (int i = 0; i < points; x = x + incr, i++) {
            w[i][0] = x;
            w[i][1] = (m*x)+b;
        }//end fill x for
    }//end liner
    //////////////////(Array to fill, x coordinate, y coordinate, size and direction, incriment, nbr points)
    
    
public void parabolic(double[][] z, double h, double k, double a, double incr, int points) {
    double x1 = h;
    double x2 = h;
    double y =(a*(x1 - h)*(x1 - h)) + k;
    z[0][0] = x1;
    z[0][1] = y;
        for (int j = 1; j < points;) {
            x1 = x1 + incr;
            y = (a*(x1 - h)*(x1 - h)) + k;
            z[j][0] = x1;
            z[j][1] = y;
            j++;
            if (j < points) {
                x2 = x2 - incr;
                y = (a*(x2 - h)*(x2 - h)) + k;
                z[j][0] = x2;
                z[j][1] = y;
                j++;
            }//end if
        }//end for
    
//    for(int j = 0; j < (points/2)+1; lwrB = lwrB + incr, j++) {
//        z[j][0] = lwrB;
//        z[j][1] = Math.round(a*((lwrB - h)*(lwrB - h)) + k);
//    }//end para for
//for(int i = (points/2)+1; i < z.length; i++, lwrB = lwrB + incr) {
//    double dist = Math.abs(h - z[(i-points/2)+1][0]);
//    z[i][0] = h + dist;
//    //z[i][1] = z[(i-points/2)+1][1];
//    z[i][1] = Math.round(a*((dist - h)*(dist - h)) + k);
//        }//end second para for    
    }//end para
}//end class
