package CWH_Ch3_PracticeSett;

public class practise {
    public static void main(String[] args) {
        String name = "Tanishq";
        int x=7;
        int y=5;
        System.out.format("The the value of x = %d and name is %s",x,name);

        int z=name.length();
        String a=name.toLowerCase();
        String b=name.toUpperCase();
        String c=name.trim(); //Removes all the spaces from beginning and end of string only
        String d=name.substring(2);
        String e=name.substring(3,7);
        String f=name.replace("q","h");
        boolean g=name.startsWith("Ta");
        Boolean h=name.endsWith("q");
        System.out.println(name.charAt(3));
        int i=name.indexOf("q");
        int j=name.indexOf("q",4);
        System.out.print(j);
    }
}