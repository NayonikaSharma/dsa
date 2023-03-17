import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Assignment2 {
    public static void printTokens(StringTokenizer tokens) {
        String studentName= tokens.nextToken();
        String Email= tokens.nextToken();
        String regNo= tokens.nextToken();
        String contactNumber= tokens.nextToken();

        System.out.println("Current Data: "+studentName+" "+Email+" "+regNo+" "+contactNumber);

    }
    public static String[] arrayTokens(StringTokenizer st) {

        String[] CurrentDataArray=new String[4];
        int i=0;
        while(st.hasMoreTokens()) {
            CurrentDataArray[i]=st.nextToken();
            i++;
        }
        System.out.print("Current Data Array: ");
        printArray(CurrentDataArray);
        return CurrentDataArray;
    }
    public static void printArray(String[] Arr) {
        for(String element :Arr ) {
            System.out.print(element+" ");
        }
    }
    public static void printIntArray(int[] arr,int l) {
        for(int j=0;j<l;j++) {
            System.out.print(arr[j]+" ");
        }
    }
    public static String replaceFile(String ReplacedDataArray[], StringTokenizer tokens, String str, String fileLocation) {
        Scanner sc= new Scanner(System.in);
        System.out.print("\nEnter First char of Name: ");
        char first = sc.next().charAt(0);
        System.out.print("Enter Second Last char of Name: ");
        char secondLast = sc.next().charAt(0);
        String FinalText="";
        FileWriter writer = null;
        ReplacedDataArray[0] = first+ ReplacedDataArray[0].substring(1,ReplacedDataArray[0].length() -2) + secondLast + ReplacedDataArray[0].substring(ReplacedDataArray[0].length()-1);
        System.out.print("Replaced Name Values: ");
        printArray(ReplacedDataArray);
        try {
            writer = new FileWriter(fileLocation);

            for(int i=0;i<ReplacedDataArray.length;i++) {
                if(i==0) {
                    FinalText=FinalText+ReplacedDataArray[i];
                }
                else {
                    FinalText=FinalText+" "+ReplacedDataArray[i];
                }
            }
            writer.write(FinalText);

        }
        catch(IOException e){
            System.out.println(e);
        }
        finally
        {
            try
            {

                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return FinalText;

    }
    static void ASCIISentence(String str)
    {
        int l = str.length();
        int convert;
        int arr[]=new int[l];
        for (int i = 0; i < l; i++) {

            convert = str.charAt(i);
            arr[i]=convert;

        }
        System.out.print("\nASCII Sentence:");
        printIntArray(arr,l);
        Arrays.sort(arr);
        System.out.print("\nSorted ASCII Sentence:");
        printIntArray(arr,l);
    }

    public static void main(String[] args) throws FileNotFoundException {
        String str;
        String fileLocation="C:\\Users\\Nayonika Sharma\\IdeaProjects\\Lab\\Student_info.txt";
        File log= new File(fileLocation);
        FileReader fr = new FileReader(log);
        try {
            BufferedReader br = new BufferedReader(fr);
            while ((str=br.readLine())!=null) {
                StringTokenizer tokens = new StringTokenizer(str);
                printTokens(tokens);
                StringTokenizer st = new StringTokenizer(str, " ");
                String[] DataArray=arrayTokens(st);
                String FinalText=replaceFile(DataArray,tokens,str,fileLocation);
                ASCIISentence(FinalText);
            }
            br.close();
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}