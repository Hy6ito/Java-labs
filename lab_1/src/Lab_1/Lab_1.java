package Lab_1;

public class Lab_1 {

    public static void main(String[] args)
    {
        powerclassA rand = new powerclassA();
        powerclassB func = new powerclassB();
        powerclassC fuct = new powerclassC();
        rand.start();
        func.start();
        fuct.start();
        int number;
        while (true)
        {
            number = powerclassA.randRun();
            try {
                rand.sleep(1000);
                if (number % 2 == 0)
                    powerclassB.Square(number);
                else
                    powerclassC.Cube(number);
            } catch (InterruptedException e) {
                System.out.println("Exception!");
            }
        }
    }

}
class powerclassA extends Thread {
    public static int randRun()
    {
        return (int) (Math.random()*10);
    }
}

class powerclassB extends Thread {
    public static void Square(int a)
    {
        System.out.println(a + ": " + Math.pow(a,2));
    }
}

class powerclassC extends Thread {
    public static void Cube(int a)
    {
        System.out.println( a + ": " + Math.pow(a,3));
    }
}

