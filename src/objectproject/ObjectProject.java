/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectproject;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author MİNE AYGÜN
 */
public class ObjectProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape list [] = new Shape[100] ;
        try{
            FileReader fr = new FileReader("shapes.txt");
            BufferedReader br = new BufferedReader(fr);
            String text;
            String[] dizi ;
            int i=0;
            while((text = br.readLine()) != null){
                dizi = text.split(" ");
            
                switch(dizi[0]){
                    case "Rectangle":
                        Rectangle rec = new Rectangle();
                        rec.setX_y(dizi[1]);
                        rec.setWidth(Integer.parseInt(dizi[2]));
                        rec.setHeight(Integer.parseInt(dizi[3]));
                        list[i]=rec;
                        break;
                    case "Square":
                        Square sq = new Square();
                        sq.setX_y(dizi[1]);
                        sq.setWidth(Integer.parseInt(dizi[2]));
                        
                        list[i]=sq;
                        break;
                    case "Circle":
                        Circle crc = new Circle();
                        crc.setX_y(dizi[1]);
                        crc.setRadius(Integer.parseInt(dizi[2]));
                        list[i]= crc;
                        break;
                        
                    default:
                       break;
                        
                
            }
                i++;
        }
     
          ArrayIterator ai = new ArrayIterator(list);        
	  while(ai.hasNext()) {            
		System.out.println(ai.next());        
		}       
            
        }catch(Exception ex){
            ex.getMessage();
        }
        
    }
    
    
}
