import java.io.*;
import java.util.Scanner;
class Customer{
	String name;
    String pincode;
    String cakename;
    int quantity;
    
	Customer(String name,String pincode,String cakename,int quantity){
        String pincodearr[] ={"1","2","3"};
        for(int i=0;i<3;i++){
            if(pincode.equals(pincodearr[i])){
                this.name = name;
                this.pincode = pincode;
                this.cakename = cakename;
                this.quantity = quantity;
            }
            else{
                this.name = name;
                this.pincode = "notavailable";
                this.cakename = cakename;
                this.quantity = quantity;
            }
        }
		
	}
    public void display(){
        System.out.println("Customer name is:"+name+"Customer pincode:"+pincode+"customer cakename:"+cakename+"quantity is"+quantity);
        System.out.println();
    }
    public String getcakename(){
        return cakename;
    }
    public String getpincode(){
        return pincode;
    }
    public String getname(){
        return name;
    }
    public int getquantity(){
        return quantity;
    }
}
class cakeshop{
    public static String[] TotalBill(Customer []arr){
        int length = arr.length;
        String total;
        int temp;
        String[] result = new String[length];
        int quantity =0;
        for(int i=0;i<length;i++){
            if(arr[i].cakename.equals("BlackForest")&&(!arr[i].pincode.equals("notavailable"))){
               temp = arr[i].quantity*500;
               total = Integer.toString(temp);
               result[i] = total;
            }
            else if(arr[i].cakename.equals("Chocolate")&&(!arr[i].pincode.equals("notavailable"))){
                temp = arr[i].quantity*450;
                total = Integer.toString(temp);
                result[i] = total;
             }
            else if(arr[i].cakename.equals("RedVelvet")&&(!arr[i].pincode.equals("notavailable"))){
                temp = arr[i].quantity*650;
                total = Integer.toString(temp);
                result[i] = total;
             }
             else{
                 total = "notavailable";
                 result[i] = total;
             }

        }
        return result;
    }
	public static void main (String[] args){
       
        System.out.println("enter the number of customers");
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        Customer[]arr = new Customer[size];
        Customer cu;
        System.out.println("enter the customer details");
        String name ,pincode,cakename;
        int quantity;
        for(int i=0;i<size;i++){
            name = sc.next();
            pincode = sc.next();
            cakename = sc.next();
            quantity = sc.nextInt();
            arr[i] = new Customer(name,pincode,cakename,quantity);
        }
        String[] result = TotalBill(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
	}
}
