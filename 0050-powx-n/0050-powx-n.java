class Solution {
    public double myPow(double x, int n) {
        if(n>=0) return myPoww(x,n);
            double result = myPoww(x, Math.abs(n));
        return (double)1/result;
        
    }
    public double myPoww(double x, int n){
        if(n==1) return x;
        if(n==0) return 1d;
        double half= myPoww(x, n/2);
        double full = half * half;
        if(n%2==0) return full;
        else return full* x;
    }
}