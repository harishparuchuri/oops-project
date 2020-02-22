
 import java.util.*;

        
class Login
{
final int student_id=1600;
final private int student_password=1600;
final int librarian_id=1600;
final private int Librarian_password=1600;
 

void  log()
{
int ch,ia,j,k,l;
System.out.println("1:for student account");
System.out.println("2:for librarian account");
Scanner in=new Scanner(System.in);
ch=in.nextInt();
switch(ch)
{
case 1:
{
System.out.println("Enter Id");
ia=in.nextInt();
System.out.println("Enter password");
j=in.nextInt();
if((student_id==ia)&&(student_password==j))
{
break;

}
else
{
System.out.println("entered id or password are incorrect");


}

}

case 2:
{
System.out.println("Enter Id");
k=in.nextInt();
l=in.nextInt();
if((k==librarian_id)&&(l==Librarian_password))
{
break;
}
else
{
System.out.println("enterd id or password are in correct");

}
}
}
    //return 0;

}
}
 
 class Student {
void Profile_s()
{
System.out.println("*******************************Student Profile**********************************");
System.out.println("Student name: "+"Harish");
System.out.println("Student Id  : "+"40677");
}
}
 
 
 
 class Librarian {
    



String cource[]=new String[100];
String books[][]=new String[100][100];
int copy[][]=new int[100][100];
int l[]=new int[100];
int i,j,k,m,lu,u,e,f,klu;
String book,book1,book2,book3;
public  void Profile_library()
{
System.out.println("*****************************LIBRARY************************");
System.out.println("");
System.out.println("Librarian name:"+"KLU");
System.out.println("");
System.out.println("Librarian Id  :"+"1600");
System.out.println("***********Capicity of Library*****************");
System.out.println("");
System.out.println("IT can have Hundred cources of books");
System.out.println("");
System.out.println("Each cource can have hundred Differnt Books");
System.out.println("");
}
public void  set()
{
System.out.println("Enter the number of cources");
Scanner in=new Scanner(System.in);
i=in.nextInt();
klu=i;
for(j=0;j<i;j++)
{
       
    System.out.println("enter name of "+(j+1)+" cources");
Scanner sc=new Scanner(System.in);
cource[j]=sc.nextLine();
}
for(k=0;k<i;k++)
{
System.out.println("Enter number of books in "+cource[k]);
l[k]=in.nextInt();
for(m=0;m<l[k];m++)
{
    System.out.println("enter name of "+(m+1) +""+"_"+"book");
Scanner o=new Scanner(System.in);
books[k][m]=o.nextLine();
System.out.println("Enter number of coppies of :"+books[k][m]);
copy[k][m]=in.nextInt();
}
}
}
public void issue()
{
Scanner hai=new Scanner(System.in);
System.out.println("Enter the title of book asked by the Student");
book=hai.nextLine();
System.out.println("Enter the cource of book that the Student asked");
book1=hai.nextLine();
for(k=0;k<i;k++)
{
if(book1.equalsIgnoreCase(cource[k]))
lu=k;
}
for(u=0;u<=l[lu];u++)
{
if(book.equalsIgnoreCase(books[lu][u]))
{
if(copy[lu][u]>=1)
{
System.out.println("Book Available");
copy[lu][u]=copy[lu][u]-1;
System.out.println("Book Issued");
}
}
}
}
void Return()
{
Scanner ab=new Scanner(System.in);
System.out.println("Enter the cource the book belong to");
book2=ab.nextLine();
System.out.println("Enter the title of the book");
book3=ab.nextLine();
for(k=0;k<i;k++)
{
if(book2.equalsIgnoreCase(cource[k]))
{
e=k;
}
}
for(f=0;f<=l[e];f++)
{
if(book3.equalsIgnoreCase(books[e][f]))
{
System.out.println("Book Shell Found");
copy[e][f]=copy[e][f]+1;
System.out.println("Book Returned");
}
}
}

}
 
 class Cource extends Librarian
{
void print_cource()
{
int g;
System.out.println("Cources");
for(g=0;g<klu;g++)
{
System.out.println(cource[g]);
}
}
void print_Books()
{
int a,b;
System.out.println("Books"+"    -    "+"coppies");
for(a=0;a<i;a++)
{
for(b=0;b<l[a];b++)
{
System.out.println(books[a][b]+"    -    "+copy[a][b]);
}
}
}
}
 
 
 

public class Main {
    public static void main(String[]args){
        Login l=new Login();
        l.log();
        
        Student obj1=new Student();
        Cource obj2=new Cource();
     
        obj2.Profile_library();
        obj2.set();
        
        obj1.Profile_s();
        obj2.print_cource();
        obj2.print_Books();
        obj2.issue();
        
        obj2.print_cource();
        obj2.print_Books();
        obj2.Return();
        
        obj2.print_cource();
        obj2.print_Books();
    }
    
}
    

