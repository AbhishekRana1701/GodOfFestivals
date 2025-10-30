class Pattern 
 {
        public void printPattern(int start, int count) 
    {
        if (count == 0) 
        {
            return;
        }
        
        for (int i = start; i >= start - count + 1; i--) 
        {
            System.out.print(i);
        }
        
        System.out.println();
        
        printPattern(start, count - 1);
    }

     public static void main(String[] args) 
     {
        Pattern P= new Pattern();
        P.printPattern(5,5);
     }
 }