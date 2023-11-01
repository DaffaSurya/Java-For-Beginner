import java.util.Scanner;
public class Index {
 public static void main(String[] args) {
    // Create Input
    Scanner Myvar = new Scanner(System.in);
    System.out.println("Masukkan angka");
    int Mynum = Myvar.nextInt();
    // Create Input
    
    // Create Variabel
    String Mycity = "Surabaya";
    System.out.println(Mycity);

    int Hasil = Mynum/2;
    System.out.println(Hasil);
    // Create Variabel

    // Create condition
    if (Hasil < 10) {
        System.out.println("Angka kecill");
      if (Hasil < 5) {
        System.out.println("Angka sangatt kecill");
      }
    } else {
        System.out.println("Angka besarr");
    }
    //Create condition
    
    Myfunc(12, 12);       // Call function in Function main
    Myarr();                        // Call function in Function main
    System.out.println(Myreturn()); // Call function in function main
    Myloop();                       // Call function in function main
    System.out.println(Myrecur(5, 10));
 }

 // Create function
 // Function beserta 2 Parameters

 static void Myfunc(int Num1, int Num2) { // Parameters in Function Myfunc
    int Result = Num1 + Num2;
    System.out.println(Result);
 }
// Function and Parameters

// Function with Array
  static void Myarr() {
   int[] arr = {12, 4, 6, 8, 9}; // Array in Function Myarr
   System.out.println(arr[2]);
 }
 // Function with Array 
 
 // Function with Return
  static String Myreturn() {
    String Myword = "Inii function dengan return di Java";
    return Myword;  // return in function
  }
 // Function with return

// function with looping
   static void Myloop() {
    for(int i = 0; i < 5; i++) {  // for looping in function
       System.out.println(i);
    }
   }
// function with looping

// function with rekursif
  static int Myrecur(int start , int end) {
     if(end > start) {
      return start + Myrecur(start, end - 1); // rekursif in Function java
     } else {
        return 0;
     }
  }
// function with rekursif
}

  
  

