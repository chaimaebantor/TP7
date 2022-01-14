package ma.education.tp6.annotations;

public class TestReflectionAnnotation
{
    public static void main(String[] args)
    {
      Class c1=CalculatriceMath.class;
      Programmer programmer=(Programmer)c1.getAnnotation(Programmer.class);
        System.out.println("id : " + programmer.id() +" ; "+"name : " + programmer.name());
    }
}
