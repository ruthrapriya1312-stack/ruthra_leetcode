// Last updated: 05/02/2026, 10:03:34
class Solution {
    public int subtractProductAndSum(int n) {
int product =1;
int sum =0;
while(n!=0){
    sum+=n%10;
    product*=n%10;
    n/=10;
}
       return product-sum;
    }
}