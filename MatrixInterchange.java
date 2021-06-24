public class MatrixInterchange {
    //Logic or solution of the problem starts from here
    static void interchange(int a[][],int r, int c){
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(j==0)
                {
                    int temp=a[i][j];
                    a[i][j]=a[i][c-1];
                    a[i][c-1]=temp;
                }
            }
        }
        
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
    }
}