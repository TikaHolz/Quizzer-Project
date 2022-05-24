import java.util.Scanner;
public class quizRunner
    {
    public static int counter = 0;
    public static int total = 12;
    public static void main(String[] args)
        {
        //animal animal
        AnimalAnimalSpeak();
        AnimalAnimalWalk();
        AnimalAnimalEat();
        //animal platypus
        AnimalPlatypusSpeak();
        AnimalPlatypusWalk();
        AnimalPlatypusEat();
        //platypus platypus
        PlatypusPlatypusSpeak();
        PlatypusPlatypusWalk();
        PlatypusPlatypusEat();
        //platypus platypus
        PlatypusAnimalSpeak();
        PlatypusAnimalWalk();
        PlatypusAnimalEat();
        System.out.println();
        System.out.println("Your score was: " + counter + "/12");
        }
    public static void AnimalAnimalSpeak()
        {
         Scanner userIntInput1 = new Scanner(System.in);
        System.out.println("What will this code print?");
        System.out.println("Animal x = new Animal();");
        System.out.println("x.Speak();");
        System.out.println("\t (1) no..");
        System.out.println("\t (2) Left Foot, Right Foot, March!");
        System.out.println("\t (3) Animals love to eat");
        System.out.println("\t (4) I eat Dr.Doofs tears");
        System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
        System.out.println("\t (6) no.. i sits");
        System.out.println("\t (7) Error");
        int AnimalAnimalSpeak = userIntInput1.nextInt();
        if (AnimalAnimalSpeak == 1)
            {
            counter++;
            System.out.println("That is correct");
            }
        else 
            {
            System.out.println("Thats incorrect"); 
            }
        }
    public static void AnimalAnimalWalk()
        {
         Scanner userIntInput2 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Animal x = new Animal();");
         System.out.println("x.Walk();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int AnimalAnimalWalk = userIntInput2.nextInt();
        if(AnimalAnimalWalk == 2)
        	 {
                 counter++;
                 System.out.println("That is correct");
                 }
             else 
                 {
                 System.out.println("Thats incorrect"); 
                 }
        }
    public static void AnimalAnimalEat()
        {
         Scanner userIntInput3 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Animal x = new Animal();");
         System.out.println("x.Eat();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int AnimalAnimalEat = userIntInput3.nextInt();
        if(AnimalAnimalEat == 3)
       	 {
                counter++;
                System.out.println("That is correct");
                }
            else 
                {
                System.out.println("Thats incorrect"); 
                }
        }
    public static void AnimalPlatypusSpeak()
        {
         Scanner userIntInput4 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Animal x = new Platypus();");
         System.out.println("x.Speak();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int AnimalPlatypusSpeak = userIntInput4.nextInt();
        if(AnimalPlatypusSpeak == 5)
       	 {
                counter++;
                System.out.println("That is correct");
                }
            else 
                {
                System.out.println("Thats incorrect"); 
                }
        }
    public static void AnimalPlatypusWalk()
        {
         Scanner userIntInput5 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Animal x = new Platypus();");
         System.out.println("x.Walk();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int AnimalPlatypusWalk = userIntInput5.nextInt();
        if(AnimalPlatypusWalk == 2)
       	 {
                counter++;
                System.out.println("That is correct");
                }
            else 
                {
                System.out.println("Thats incorrect"); 
                }
        }
    public static void AnimalPlatypusEat()
        {
         Scanner userIntInput6 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Animal x = new Platypus();");
         System.out.println("x.Eat();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int AnimalPlatypusEat = userIntInput6.nextInt();
        if(AnimalPlatypusEat == 4)
       	 {
                counter++;
                System.out.println("That is correct");
                }
            else 
                {
                System.out.println("Thats incorrect"); 
                }
        }
    public static void PlatypusPlatypusSpeak()
        {
         Scanner userIntInput7 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Platypus x = new Platypus();");
         System.out.println("x.Speak();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int PlatypusPlatypusSpeak = userIntInput7.nextInt();
        if(PlatypusPlatypusSpeak == 5)
       	 {
                counter++;
                System.out.println("That is correct");
                }
            else 
                {
                System.out.println("Thats incorrect"); 
                }
        }
    public static void PlatypusPlatypusWalk()
        {
         Scanner userIntInput8 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Platypus x = new Platypus();");
         System.out.println("x.Walk();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int PlatypusPlatypusWalk = userIntInput8.nextInt();
        if(PlatypusPlatypusWalk == 2)
       	 {
                counter++;
                System.out.println("That is correct");
                }
            else 
                {
                System.out.println("Thats incorrect"); 
                }
        }
    public static void PlatypusPlatypusEat()
        {
         Scanner userIntInput9 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Platypus x = new Platypus();");
         System.out.println("x.Eat();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");         
        int PlatypusPlatypusEat = userIntInput9.nextInt();
        if(PlatypusPlatypusEat == 4)
       	 {
                counter++;
                System.out.println("That is correct");
                }
            else 
                {
                System.out.println("Thats incorrect"); 
                }
        }
    public static void PlatypusAnimalSpeak()
        {
         Scanner userIntInput10 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Platypus x = new Animal();");
         System.out.println("x.Speak();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int PlatypusAnimalSpeak = userIntInput10.nextInt();
        if(PlatypusAnimalSpeak == 7)
            {
            counter++;
            System.out.println("You got that one correct!");    
            }
        else
            {
            System.out.println("Wrong");    
            }
        }
    public static void PlatypusAnimalWalk()
        {
         Scanner userIntInput11 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Platypus x = new Animal();");
         System.out.println("x.Walk();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int PlatypusAnimalWalk = userIntInput11.nextInt();
        if(PlatypusAnimalWalk == 7)
            {
            counter++;
            System.out.println("You got that one correct!");    
            }
        else
            {
            System.out.println("Wrong");    
            }
        }
    public static void PlatypusAnimalEat()
        {
         Scanner userIntInput12 = new Scanner(System.in);
         System.out.println("What will this code print?");
         System.out.println("Platypus x = new Animal();");
         System.out.println("x.Eat();");
         System.out.println("\t (1) no..");
         System.out.println("\t (2) Left Foot, Right Foot, March!");
         System.out.println("\t (3) Animals love to eat");
         System.out.println("\t (4) I eat Dr.Doofs tears");
         System.out.println("\t (5) /Nnnn-Rrrrrr/ swoosh /AGENT P!!");
         System.out.println("\t (6) no.. i sits");
         System.out.println("\t (7) Error");
        int PlatypusAnimalEat = userIntInput12.nextInt();
        if(PlatypusAnimalEat == 7)
            {
            counter++;
            System.out.println("You got that one correct!");    
            }
        else
            {
            System.out.println("Wrong");    
            }
        }
}
