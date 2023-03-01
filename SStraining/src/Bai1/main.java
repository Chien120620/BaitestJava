package Bai1;
import java.util.Scanner;
public class main {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		 try{
	            System.out.println("Nhập bán kính: ");
	           double radius = in.nextDouble();
	            if(radius < 0){
	                throw new RuntimeException("Error");
	            }
	            
	            System.out.println(new circle(radius));
	        }
	        catch (NumberFormatException e){
	            System.out.println("Nhập sai định dạng bán kính");
	        }
	        catch (Exception e){
	            System.out.println(e);
	        }
	}
}
