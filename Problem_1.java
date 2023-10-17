// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {

    int n = 10;
    int counter = 0;
    int inp[] = {0,0,0,1,0,0,0,0,0,0};
    
    // Logic below for ascending
    // find midpoint
    int mid = n / 2;
    
    // one pointer at first (f), one pointer at last (l)
    int f = 0, l = n-1;
    
    // iterate midpoint times
    while ( (f < l) && (f < n) && (l < n)) {
        if(inp[l] == 1) {
            l = l-1;
        }
        else{
            if(inp[f] == 1) {
                inp[f] = 0;
                inp[l] = 1;
                f++;
                l--;
                counter++;
            }
            else{
                f = f +1;
            }
        }
    }
    
    
        System.out.print(counter);
        
        // 1 0 0 1 1 0 1 1 1 0
        // 0 0 0 1 1 0 1 1 1 1
        // 0 0 0 0 1 1 1 1 1 1  
        
        
        // 10 0001000000
        
        
    }
}