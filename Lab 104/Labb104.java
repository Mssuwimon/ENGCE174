// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Labb104 {
   public Labb104() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Pless Enter Score :");
      int var2 = var1.nextInt();
      String var3 = "";
      if (var2 >= 80 && var2 <= 100) {
         var3 = "A";
      } else if (var2 >= 70 && var2 <= 79) {
         var3 = "B";
      } else if (var2 >= 60 && var2 <= 69) {
         var3 = "C";
      } else if (var2 >= 50 && var2 <= 59) {
         var3 = "D";
      } else if (var2 >= 0 && var2 <= 49) {
         var3 = "F";
      } else {
         var3 = "Invalid Score";
      }

      System.out.println("Score: " + var3);
      var1.close();
   }
}
