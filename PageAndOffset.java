/**
 * Name:  Robert Parson
 * Date:  10-21-15
 * Course Number:  45180
 * Section:  1
 */
import java.lang.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

import java.util.*;

public class PageAndOffset
{
    
    
    
    public static void main(String[] args)
    {
        
        
        System.out.println("Please enter the system page size:  ");
        Scanner inp = new Scanner(System.in);  //constructor for scanner
        String input = inp.next();  //input from scanner is set to String input
        int pages = parseInt(input);  //parses input to int pages
        double vPage = 0;
        double offset = 0;
        
        
            switch(pages)  //since switch statements can only accept char, byte, short, and int it was necessary to parse input as int pages
            {
                case 512:  //test for 2^9
                    System.out.println("Please enter the virtual address:  ");
                    String virtMem = inp.next();  //sets input from scanner to String virtMem
                    long vM = parseLong(virtMem);  //since virtMem can be long, had to parse string to long
                    if(vM < 4294967295L) //since its 32-bit had to use (2^32)-1 and L to indicate Long
                    {
                        vPage = (vM / pages);   //gets address in virtual page
                        offset = (vM % pages);  //gets the offset
                    }
                    else
                    {
                        System.out.println("The Virtual Address input is unacceptable.");
                    }
                    break;
                    
                case 1024:
                    System.out.println("Please enter the virtual address:  ");
                    virtMem = inp.next();  //sets input from scanner to String virtMem
                    vM = parseLong(virtMem);  //since virtMem can be long, had to parse string to long
                    if(vM < 4294967295L)  //since its 32-bit had to use (2^32)-1 and L to indicate Long
                    {
                        vPage = (vM / pages);   //gets address in virtual page
                        offset = (vM % pages);  //gets the offset
                    }
                    else
                    {
                        System.out.println("The Virtual Address input is unacceptable.");
                    }
                    break;
                    
                case 2048:
                    System.out.println("Please enter the virtual address:  ");
                    virtMem = inp.next();  //sets input from scanner to String virtMem
                    vM = parseLong(virtMem);  //since virtMem can be long, had to parse string to long
                    if(vM < 4294967295L)  //since its 32-bit had to use (2^32)-1 and L to indicate Long
                    {
                        vPage = (vM / pages);  //gets address in virtual page
                        offset = (vM % pages);  //gets the offset
                    }
                    else
                    {
                        System.out.println("The Virtual Address input is unacceptable.");
                    }
                    break;
                    
                case 4096:
                    System.out.println("Please enter the virtual address:  ");
                     virtMem = inp.next();  //sets input from scanner to String virtMem
                    vM = parseLong(virtMem);  //since virtMem can be long, had to parse string to long
                    if(vM < 4294967295L)  //since its 32-bit had to use (2^32)-1 and L to indicate Long
                    {
                        vPage = (vM / pages);   //gets address in virtual page
                        offset = (vM % pages);  //gets the offset
                    }
                    else
                    {
                        System.out.println("The Virtual Address input is unacceptable.");
                    }
                    break;
                    
                    
                case 8192:
                    System.out.println("Please enter the virtual address:  ");
                     virtMem = inp.next();  //sets input from scanner to String virtMem
                     vM = parseLong(virtMem);  //since virtMem can be long, had to parse string to long
                    if(vM < 4294967295L)  //since its 32-bit had to use (2^32)-1 and L to indicate Long
                    {
                        vPage = (vM / pages);   //gets address in virtual page
                        offset = (vM % pages);  //gets the offset
                    }
                    else
                    {
                        System.out.println("The Virtual Address input is unacceptable.");
                    }
                    break;
                    
                    
                case 16384:
                    System.out.println("Please enter the virtual address:  ");
                     virtMem = inp.next();  //sets input from scanner to String virtMem
                     vM = parseLong(virtMem);  //since virtMem can be long, had to parse string to long
                    if(vM < 4294967295L)  //since its 32-bit had to use (2^32)-1 and L to indicate Long
                    {
                        vPage = (vM / pages);  //gets address in virtual page
                        offset = (vM % pages);  //gets the offset
                    }
                    else
                    {
                        System.out.println("The Virtual Address input is unacceptable.");
                    }
                    break;
                  
                default:
                    System.out.println("The Page Size input is unacceptable.");
                
                    
                
            }
            System.out.println("This address is in virtual page:  "+vPage);
            System.out.println("At offset:  "+offset);
        }
}