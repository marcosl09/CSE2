//Marcos Lozano Mendez
//CSE 2
//November 19, 2015

public class Rectangle{
    double width, height;
    
    public void setWidth(double w){width = w;}
    public void setHeight(double h){height = h;}
    
    public double getArea(){
        return width * height;
    }
    
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        
        r1.setHeight(5.3);
        r1.setWidth(7.3);
        
        System.out.println(r1.getArea());
        
    }
    
}