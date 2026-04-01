class SumofSquares{
    public int calculateSumofSquares(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum+(i*i);
        }
        return sum;
    }
    public static void main(String args[]){
        SumofSquares obj = new SumofSquares();
        int result = obj.calculateSumofSquares(3);
        System.out.println(result);
    }
}