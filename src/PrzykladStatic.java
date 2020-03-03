public class PrzykladStatic {

    private int poleInstancji;

    private static int poleStatyczne = 5;

    public PrzykladStatic(int poleInstancji){
        this.poleInstancji = poleInstancji;
    }

    // w tej metodzie odnosimy się do pola statycznego pole statyczne jeszcze przed utworzeniem obiektu,
    // odnosimy się przy pomocy nazwy klasy kropki i nazwy pola statycznego - czyli do zmiennych statycznych pożemy odnosić się na 2 sposoby
    public static void main(String[]args){
        System.out.println("Pole statyczne przez klasę " +
        PrzykladStatic.poleStatyczne);

        PrzykladStatic object1 = new PrzykladStatic(10);
        System.out.println("Pole statyczne przez obiekt1 " + object1.poleStatyczne);

        PrzykladStatic object2 = new PrzykladStatic(15);
        object2.poleStatyczne = -20;
        System.out.println("Pole statyczne po zmianie przez obiekt2 " + PrzykladStatic.poleStatyczne);
        System.out.println("Pole statyczne po zmianie przez obiekt1 " + object1.poleStatyczne);
        System.out.println("Pole statyczne po zmianie przez klasę " + PrzykladStatic.poleStatyczne);

        // do pola instancji-obiektu - czyli zmiennych nistatycznych - możemy odnosić się tylko przy pomocy nazwy obiektu kropki i nazwy pola instancji,
        // ale nie możemy odnosić się przy pomocy nazwy klasy

        //błędna próba odwołania się do pola niesatycznego przy pomocy klasy - jak poniżej
        //System.out.println("Pole niestatyczne przez klasę"+ PrzykladStatic.poleInstancji);
    }



}
