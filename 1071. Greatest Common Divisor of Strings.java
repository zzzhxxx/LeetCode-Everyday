class Solution{
public String gcdOfStrings(String var1, String var2) {
      if (!(var1 + var2).equals(var2 + var1)) {
         return "";
      } else {
         int var3 = this.gcd(var1.length(), var2.length());
         return var1.substring(0, var3);
      }
   }

   private int gcd(int var1, int var2) {
      return var2 == 0 ? var1 : this.gcd(var2, var1 % var2);
   }
}