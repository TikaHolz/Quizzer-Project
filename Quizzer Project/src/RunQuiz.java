import java.util.Scanner;
public class RunQuiz
	{
	public static int counter = 0;
	public static int questionNumber = 12;
	public static void main(String[] args)
		{
		startProgram();
		}
	public static void startProgram()
		{
		Scanner userIntInput = new Scanner(System.in);		
		System.out.println("Would you like to start the quiz?");
		System.out.println("(1) YES");
		System.out.println("(2) NO");
		int startOrNO = userIntInput.nextInt();
		if(startOrNO == 1)
			{
			System.out.println("What will this code print?");
			System.out.println("Animal x = new Animal( );");
			System.out.println("x.runPlataypusEats();");
			System.out.println("(1) ");
			System.out.println("(2) ");
			int animalAnimal = userIntInput.nextInt();
			//if first right
			if(animalAnimal == 1)
				{
				//animal = new platypus
				counter ++;
				System.out.println("What will this code print?");
				System.out.println("Animal x = new Platypus( );");
				System.out.println("x.runPlataypusEats();");
				System.out.println("(1) ");
				System.out.println("(2) ");
				int animalPlatypus = userIntInput.nextInt();
				if(animalPlatypus == 2)
					{
					//platypus = animal
					counter ++;
					System.out.println("What will this code print?");
					System.out.println("Platypus x = new Animal( );");
					System.out.println("x.runPlataypusEats();");
					System.out.println("(1) ");
					System.out.println("(2) ");
					int platypusAnimal = userIntInput.nextInt();
					
					if(platypusAnimal == 2)
						{
						// platypus = platypus
						counter++;	
						System.out.println("What will this code print?");
						System.out.println("Platapus x = new Platypus( );");
						System.out.println("x.runPlataypusEats();");
						System.out.println("(1) ");
						System.out.println("(2) ");
						int platypusPlatypus = userIntInput.nextInt();
						if(platypusPlatypus == 1)
							{
							counter++;	
							end();
							}
						else if (platypusPlatypus == 2)
							{
							end();	
							}
						}
					else if(platypusAnimal == 1)
						{
						//platypus = platypus 2
						System.out.println("What will this code print?");
						System.out.println("Platapus x = new Platypus( );");
						System.out.println("x.runPlataypusEats();");
						System.out.println("(1) ");
						System.out.println("(2) ");
						int platypusPlatypus2 = userIntInput.nextInt();	
						if(platypusPlatypus2 == 1)
							{
							counter++;
							end();	
							}
						else if (platypusPlatypus2 == 2)
							{
							end();		
							}
						}
					}
				else if(animalPlatypus == 1)
					{
					//platypus = animal
					System.out.println("What will this code print?");
					System.out.println("Platapus x = new Animal( );");
					System.out.println("x.runPlataypusEats();");
					System.out.println("(1) ");
					System.out.println("(2) ");
					int  platypusAnimal2 = userIntInput.nextInt();
					if(platypusAnimal2 == 2)
						{
						counter++;	
						//platypus = platypus 3
						System.out.println("What will this code print?");
						System.out.println("Platapus x = new Platypus( );");
						System.out.println("x.runPlataypusEats();");
						System.out.println("(1) ");
						System.out.println("(2) ");
						int platypusPlatypus3 = userIntInput.nextInt();	
						if(platypusPlatypus3 == 1)
							{
							counter++;	
							end();	
							}
						else if (platypusPlatypus3 == 2)
							{
							end();		
							}
						}
					else if(platypusAnimal2 == 1)
						{
						//platypus = platypus 3
						System.out.println("What will this code print?");
						System.out.println("Platapus x = new Platypus( );");
						System.out.println("x.runPlataypusEats();");
						System.out.println("(1) ");
						System.out.println("(2) ");
						int platypusPlatypus3 = userIntInput.nextInt();	
						if(platypusPlatypus3 == 1)
							{
							counter++;	
							end();	
							}
						else if (platypusPlatypus3 == 2)
							{
							end();		
							}	
						}
					}
			
				}
			//if first wrong
			else if(animalAnimal == 2)
				{
				//animal = platypus
				System.out.println("What will this code print?");
				System.out.println("Animal x = new Platypus( );");
				System.out.println("x.runPlataypusEats();");
				System.out.println("(1) ");
				System.out.println("(2) ");
				int animalPlatypus2 = userIntInput.nextInt();
				if(animalPlatypus2 == 2)
					{
					counter ++;
					}
				else if(animalPlatypus2 == 1)
					{
						
					}	
				}
			}
		else if(startOrNO == 2)
			{
			System.out.println("RIP");
			}
		
		}
	public static void end()
		{
		
		}
	}
