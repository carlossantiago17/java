class FactLoop{
  public static void main (String  a[]){
    int value = Integer.parseInt (a[0]);
    int product = 1;
    for (int i = 1; i <= value; i++){
      product = product * i;


    }
    System.out.println(product);
  }
}
