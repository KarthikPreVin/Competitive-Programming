int reverse(int x){
    long int out=0;
    while (x>0){
        out=out*10+x%10;
        x=x/10;
    }
    return out;
}

bool isPalindrome(int x) {
    if(x<0 || (x!=0 && x%10==0))return false;
    return x==reverse(x);
}