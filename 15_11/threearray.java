class array
{
    public static void main(String[] args)
    {
        int[][][] d= new int[2][2][2];
        d[0][0][0]=21;
        d[0][0][1]=32;
        d[0][1][0]=34;
        d[0][1][1]=56;
        d[1][0][0]=76;
        d[1][0][1]=88;
        d[1][1][0]=90;
        d[1][1][1]=67;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                System.out.print(d[i][j][k]+"");
                }
            }
    
        System.out.println("");
        }
    }
}