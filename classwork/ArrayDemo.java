package ClassWork;
import java.util.*;
    class ArrayDemos1
    {
        public static void main(String s[])
        {
            int ar[][]=new int[5][2];
            int ar1[][]={{1,2,3},{4,5,6}};//passing the value

            for(int i=0;i<ar1.length;i++)//this take care about row
            {
                for(int j=0;j<ar1[i].length;j++)//this take care about no of column in each row
                {
                    System.out.print(" "+ar1[i][j]);
                }
                System.out.println();
            }
            for(int i[]:ar1)//use toString to print the value otherwise it will print address
            {
                System.out.println(Arrays.toString(i));
            }

            int arr[][]=new int[3][];//in 2 d row size is mandatory
            arr[0]=new int[1];
            arr[1]=new int[2];
            arr[2]=new int[3];
//below is the example of jagged array where row size is fixed but column size varry
/*
            1
            1 2
            1 2 3
            1 2 3 4
                */
            int p1[]={7,8,9};//this is 1d array
            int p2[],p3;//here p2 is array type but p3 is var
            int[] p5,p6;//here bith p5 and p6 are array
            int arr3[][]={p1,{2,3},{5,6}};
//passing the array directly in the value of 2 d array which is seprated with comma
            int arr4[][]={arr[0],arr[1]};
//2d array where u have passed arr[0] and arr[1] which itself represt 1 d array



        }
    }

/*
class ArraysDemoForPractice1
    {
        static void get(int a[])
        {
            for(int i:a)
            {
                System.out.println(i);
            }
        }
        static void call(int... a)
        {
            for(int i:a)
            {
                System.out.println(i);
            }
        }
        public static void main(String... st)
        {

            int a[]={2,3,4,5};
            get(a);
            call(2,3,4,5);
            call(2,3);
        }
    }
 */