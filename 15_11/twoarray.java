class array
{
    public static void main(String args[])
    {
        int[][] d=new int[2][2];
        d[0][0]=56;
        d[0][1]=65;
        d[1][0]=98;
        d[1][1]=78;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(d[i][j]+" ");
            }
        }
        System.out.println("  ");
    }
}