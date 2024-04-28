package CunstructorAndStatic;

public class Cunstructor {
      int id;
      String name;
      char a;
      Cunstructor(int id,String name,char a){
    	  this.id=id;
    	  this.name=name;
    	  this.a=a;
    	  
      }
      Cunstructor(int id,String name){
    	this.id=id;
    	this.name=name;
    	 
      }
      Cunstructor(Cunstructor obj){
    	 id=obj.id;
    	 name=obj.name;
      }
      Cunstructor(int id){
    	  this.id=id;
      }
      
      void display(){
    	  System.out.println(id+" "+name+" "+a);
      }
}
