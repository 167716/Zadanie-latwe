class Main {
  public static void main(String[] args) {
    double k;
        double[] potegi = new double[10];
        for(int i=0;i<10;i++){
          k=i;
          potegi[i]=Math.pow(2,k);
        }
        for(int i=9;i!=-1;i--){
          System.out.print(potegi[i]+" ");
        }
  }
}