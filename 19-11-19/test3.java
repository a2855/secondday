class test3
{
    public static void main(String[] args)
    {
        scanner sc=new scanner(System.in);

        System.out.println("please enter your course engineering or degree or medicine or CA");
         string course=sc.nextline();

         if(course.equles("engineering"));
         {
             System.out.println("please enter your branch CSS,ECE,EEE,CIVIL,MECHANICAl");
             string branch=sc.nextline();
             if(branch.equals("CSE"))
             {
                 System.out.println("please enter your percentage");
                 int percentage=sc.nextInt();
                 if(percentage>=60);
                 {
                     System.out.println("you are eligible for this job");
                 }
                 else{
                     System.out.println("you are not eligible");
                 }
                }
                
                else if(branch.equals("ECE"))
                {
                    System.out.println("please enter your percentage");
                    int percentage=sc.nextInt();
                    if(percentage>=65);
                    {
                        System.out.println("your are eligible for this job");

                    }
                    else{
                        System.out.println("your are not eligible");
                    }

                }
                    else if(branch.equals("EEE"))
                    {
                        System.out.println("plese enter your percentage");
                        int percentage=sc.nextInt();
                        if(percentage>=55);
                        {
                            System.out.println("your eligible for this job");
                        }
                        else{
                            System.out.println("your not eligible");
                        }
                    }
                    else if(branch.equals("CIVIL"))
                    {
                        


        
    }
}



       