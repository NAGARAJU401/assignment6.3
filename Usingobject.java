package Object;
// here I have created a package as object
public class Usingobject {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.

	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
			// TODO Auto-generated method stub
		Integer i = new Integer(8);//here we taking an object of integer data type has variable i
        setToThree(i);//and initialized as 2 and given that method to set had 3
        System.out.println(i);
      //system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.

	}
        public static void setToThree(Integer i) {
        	//Public is a keyword that is used as an access modifier for methods and variables.
    		//static used to prepare a field,method or inner classes as a class field.
    		//void: it is void if the method does not return a value.
        	  i = new Integer(9);
        }

	}



		
	


