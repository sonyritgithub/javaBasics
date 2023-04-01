class parent {
   int a = 10;

   public void pdisplay() {
      System.out.println("parent");
   }
}

class child extends parent {
   int b = 20;

   public void cdisplay() {
      System.out.println("child");
   }
}

class inheritance {
   public static void main(String[] args) {
      child c = new child();
      c.cdisplay();
      System.out.println(c.b);
      c.pdisplay();
      System.out.println(c.a);
   }
}