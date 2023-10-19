import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class GeometricPrimitiveTest {
    
    GeometricPrimitive arr[] = new GeometricPrimitive[7];
    circle cir;
    diamond dia;
    parallelogram par;
    rectangle rec;
    square sq;
    triangle tri;
    trapezium tra;
    
    @BeforeEach
    void setup(){
        cir = new circle(4);
        dia = new diamond(13,15,18);
        par = new parallelogram(6,7,8);
        rec = new rectangle(2,4);
        sq = new square(7);
        tri = new triangle(4,6,8,10);
        tra = new trapezium(5,7,9,11,13);

        arr[0] = cir;
        arr[1] = dia;
        arr[2] = par;
        arr[3] = rec;
        arr[4] = sq;
        arr[5] = tri;
        arr[6] = tra;
    }

    @Test
    void testArea(){
        double result =0;
        for(int k=0; k<arr.length; k++){
            result += arr[k].area();
        }

        Assert.assertEquals(Double.doubleToLongBits(398.2654824), Double.doubleToLongBits(result));
        
    }

    @Test
    void testPerimeter(){
        double result=0;
        for(int t=0; t<arr.length; t++){
            result += arr[t].perimater();
        }

        Assert.assertEquals(Double.doubleToLongBits(193.1327412), Double.doubleToLongBits(result));

    }

    
}
