interface Function{
    int Evaluate(int num);
}
class Half implements Function{
    public int Evaluate(int num)
    {
        return num/2;
    }
}
class Client extends Half
{
    public  void main(String args[])
    {
        int[] arr={4,6,8,12};
        int[] newarr=Division(arr);
        for (int i=0;i<4;i++)
        {
            System.out.print(" "+ newarr[i]);
        }
    }

    public int[] Division(int[] arr)
    {
        int[] newarr={0,0,0,0};
        for(int i=0;i<4;i++)
        {
            newarr[i]=Evaluate(arr[i]);
        }
        return newarr;
    }
}