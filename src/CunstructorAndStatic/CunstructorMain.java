package CunstructorAndStatic;

public class CunstructorMain {
     public static void main(String[]args) {
    	 Cunstructor obj=new Cunstructor(241343,"ajith",'s');
    	 Cunstructor obj1=new Cunstructor(6899227);
    	 Cunstructor obj2=new Cunstructor(obj1);
    	 obj.display();
    	 obj1.display();
    	 obj2.display();
     }
}
