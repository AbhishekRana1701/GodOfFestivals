class InstanceVar{
    public String geek;
    public int i = 33;
    public Integer I;
    public InstanceVar()
    {
        this.geek = "Kallu Kalia";
    }
    public static void main(String[] args)
{
    InstanceVar name = new InstanceVar();

    System.out.println("Geek name is " + name.geek);
    System.out.println("Default value for int is " + name.i);

    System.out.println("Default value for Integer is " + name.I);
}
}