class plus
{
    public static void main(String[] args)
     {
        int[] a={1,2,9};
        int k=a.length;
        int[] b=new int[k+1];
        String s="";
        for(int x=0;x<a.length;x++)
        {
            s=s+Integer.toString(a[x]);
        }
        int t=Integer.parseInt(s) +1;
        s=Integer.toString(t);
        System.out.println();
        System.out.println(s);
        int l=s.length();
        for(int x=0;x<l;x++)
        {
            b[x]=Character.getNumericValue(s.charAt(x));
            System.out.print(b[x]+",");

        }
    }
}