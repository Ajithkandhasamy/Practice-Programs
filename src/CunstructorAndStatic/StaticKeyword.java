package CunstructorAndStatic;

public class StaticKeyword {
   int id;
   String name;
   static String schoolName="bishop";
   
   
static void change() {
	   schoolName="Bishop Heber college";
   }
   StaticKeyword (int i,String n) {
	   id=i;
	   name=n;
   }
   StaticKeyword (int i,String n,String j) {
	   id=i;
	   name=n;
	   schoolName=j;
   }
   void display() {
	   System.out.println(id+" "+name+" "+schoolName);
   }
  
   }
