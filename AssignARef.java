class AssignARef {
public static void main(String args[]) {
int i;
int num1[]=new int[10];
int num2[]=new int[10];
for(i=0;i<10;i++)
num1[i]=i;
for(i=0;i<10;i++)
num2[i]=-i;
System.out.println("Here is num one : ");
for(i=0;i<10;i++)
System.out.println("Here is num one : ");
System.out.println();
System.out.print("here the num2: ");
for(i=0;i<10;i++)
System.out.println(num2[i] + " ");
System.out.println();
num2=num1;
System.out.println("Here the num2 after assignment: ");
for(i=0;i<10;i++)
System.out.println(num2[i] + " ");
System.out.println();
num2[3]=99;
System.out.println(" Here the num1 after changre num2: ");
for(i=0;i<10;i++)
System.out.println(num1[i] + " ");
System.out.println();
}
}