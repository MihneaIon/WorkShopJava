

    class A
    {
        public void afisare()
        {
            System.out.println("da");
        }

        public void nuda()
        {
            System.out.println("nu");
        }
    }

    class B extends A
    {
        @Override
        public void afisare() {
            super.afisare();
        }

        @Override
        public void nuda() {
            super.nuda();
        }
        public void apelare()
        {
            System.out.println("ceva");
        }
    }

    class C extends B
    {

    }

    public class Exemple1
    {
        static void myMethod(A a)
        {
            System.out.println("One");
        }


        static  void myMethode( Object obj)
        {
            System.out.println("Three");
        }

        public static void main(String[] args)
        {
            A a= new B();
            ((B) a).apelare();
            a.afisare();
        }
    }


