import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
Scanner sc = new Scanner ( System.in);
Random rand = new Random ();
System.out.println("What class would you like to be. A Wizard, Warrior, or a Rogue");
int Points = 65;
String a = sc.nextLine();

if (a.equals("Wizard"))
{
 System.out.println("Your new class is now a Wizard."); // Copy start here
 System.out.println("Now it's time to pick your stats");
  System.out.println("if you want to pick your stats type ( pick ) , if you want random numbers type ( rand )");
  String b = sc.nextLine();
  if (b.equals("pick"))
  {
    System.out.println("The stats you need to fill in are ");
     System.out.println("Strength - The more pysical damage you can do");
      System.out.println("Dexterity - agility / quick movement");
      System.out.println("Constitution - is manly used for health");
      System.out.println("Intelligance - are you dumb? ( used for magic )");
       System.out.println("Wisdom - also used for magic");
       System.out.println("Charisma - this affects many things( is manly usedful for theifs )");
     System.out.println("You have 65 points to spend on the stats, and no stat ( for now ) is allowed to go over 20 ");
     System.out.println("what do you want for STR");
     int STR_pick = sc.nextInt();
     if ( STR_pick <= 20 )
      {
       int points_A = Points - STR_pick;
        System.out.println(" you have " + points_A + " points left");
         System.out.println("what do you want for DEX");
        int DEX_pick = sc.nextInt();
        if ( DEX_pick <= 20 )
        {
         int point_B = points_A - DEX_pick;
          System.out.println("you have " + point_B + " points left");
           System.out.println("What do you want for CON");
          int CON_pick = sc.nextInt();
          if ( CON_pick <= 20)
          {
           int points_C = point_B - CON_pick;
            System.out.println("You have " + points_C + " points left");
             System.out.println("What do you want for INT");
            int INT_pick = sc.nextInt();
            if (INT_pick <= 20)
            {
             int points_D = points_C - INT_pick;
             if (points_D <= 0)
             {
               System.out.println(" you ran out of points. All remaining stats will be zero");
               System.out.println(" The stats for your Wizard class is ");
                 System.out.println("STR = " + STR_pick);
                  System.out.println("DEX = " + DEX_pick);
                   System.out.println("CON = " + CON_pick);
                    System.out.println("INT = " + INT_pick );
                     System.out.println("WIS = 0");
                      System.out.println("CHA = 0");
                
             }
             else
             {
               System.out.println(" you have " + points_D + " points left");
                System.out.println("what do you want for WIS");
                int WIS_pick = sc.nextInt();
                if (WIS_pick <= 20)
                {
                 int points_E = points_D - WIS_pick;
                 if (points_E == 0)
                 {
                   System.out.println("you ran out of points. All remaning stats will be set to zero");
                    System.out.println("The stats for your wizard class is ");
                     System.out.println("STR = " + STR_pick);
                      System.out.println("DEX = " + DEX_pick);
                       System.out.println("CON = " + CON_pick);
                        System.out.println("INT = " + INT_pick);
                         System.out.println("WIS = " + WIS_pick);
                          System.out.println("CHA = 0");
                 }
                 else
                 {
                   System.out.println("You have " + points_E + " points left");
                   int CHA_pick = sc.nextInt();
                   if(CHA_pick <= 20)
                   {
                     int points_F = points_E - CHA_pick;
                     System.out.println("Your stats are compelete");
                      System.out.println("you have " + points_F + " left over");
                       System.out.println("The stats for your Wizard class is ");
                        System.out.println("STR = " + STR_pick);
                         System.out.println("DEX = " + DEX_pick);
                          System.out.println("CON = " + CON_pick);
                           System.out.println("INT = " + INT_pick);
                            System.out.println("WIS = " + WIS_pick);
                             System.out.println("CHA = " + CHA_pick);
                   }
                   else if (CHA_pick > 20)
                   {
                     System.out.println("Your pick is greater than 20");
                   }
                   else if (CHA_pick > points_E)
                   {
                     System.out.println("You don't have enough points for your pick");
                   }
                 }
                }
                else if (WIS_pick > 20)
                {
                  System.out.println("Your pick is greater than 20");
                }
                else if (WIS_pick > points_D)
                {
                  System.out.println("You don't have enough points for your pick");
                }
             }
            }
            else if (INT_pick > 20)
            {
              System.out.println("you pick was greater than 20");
            }
            else if ( INT_pick > points_C)
            {
              System.out.println("you don't have enough points for your pick");
            }
          }
          else if ( CON_pick > 20)
          {
            System.out.println(" your pick is greater than 20");
          }
        }
        else if ( DEX_pick > 20)
        {
          System.out.println("You pick was greater than 20");
        }
      }
      else if (STR_pick > 20)
      {
        System.out.println("your pick was greater than 20 ");
      }
  }
  else if (b.equals("rand"))
  {
   int STR_rand = rand.nextInt(19) + 1;
   int DEX_rand = rand.nextInt(19) + 1;
   int CON_rand = rand.nextInt(19) + 1;
   int INT_rand = rand.nextInt(19) + 1;
   int WIS_rand = rand.nextInt(19) + 1;
   int CHA_rand = rand.nextInt(19) + 1;
    System.out.println("your Wizard class is compelete, your stats are ");
     System.out.println("STR " + STR_rand);
      System.out.println("DEX " + DEX_rand);
       System.out.println("CON " + CON_rand);
        System.out.println("INT " + INT_rand);
         System.out.println("WIS " + WIS_rand);
          System.out.println("CHA " + CHA_rand);
  } // copy end here
   
}
else if (a.equals("wizard"))
{
  System.out.println("Your new class is now a Wizard");
   System.out.println("Now it's time to pick your stats");
  System.out.println("if you want to pick your stats type ( pick ) , if you want random numbers type ( rand )");
  String b = sc.nextLine();
  if (b.equals("pick"))
  {
    System.out.println("The stats you need to fill in are ");
     System.out.println("Strength - The more pysical damage you can do");
      System.out.println("Dexterity - agility / quick movement");
      System.out.println("Constitution - is manly used for health");
      System.out.println("Intelligance - are you dumb? ( used for magic )");
       System.out.println("Wisdom - also used for magic");
       System.out.println("Charisma - this affects many things( is manly usedful for theifs )");
     System.out.println("You have 65 points to spend on the stats, and no stat ( for now ) is allowed to go over 20 ");
     System.out.println("what do you want for STR");
     int STR_pick = sc.nextInt();
     if ( STR_pick <= 20 )
      {
       int points_A = Points - STR_pick;
        System.out.println(" you have " + points_A + " points left");
         System.out.println("what do you want for DEX");
        int DEX_pick = sc.nextInt();
        if ( DEX_pick <= 20 )
        {
         int point_B = points_A - DEX_pick;
          System.out.println("you have " + point_B + " points left");
           System.out.println("What do you want for CON");
          int CON_pick = sc.nextInt();
          if ( CON_pick <= 20)
          {
           int points_C = point_B - CON_pick;
            System.out.println("You have " + points_C + " points left");
             System.out.println("What do you want for INT");
            int INT_pick = sc.nextInt();
            if (INT_pick <= 20)
            {
             int points_D = points_C - INT_pick;
             if (points_D <= 0)
             {
               System.out.println(" you ran out of points. All remaining stats will be zero");
               System.out.println(" The stats for your Wizard class is ");
                 System.out.println("STR = " + STR_pick);
                  System.out.println("DEX = " + DEX_pick);
                   System.out.println("CON = " + CON_pick);
                    System.out.println("INT = " + INT_pick );
                     System.out.println("WIS = 0");
                      System.out.println("CHA = 0");
                
             }
             else
             {
               System.out.println(" you have " + points_D + " points left");
                System.out.println("what do you want for WIS");
                int WIS_pick = sc.nextInt();
                if (WIS_pick <= 20)
                {
                 int points_E = points_D - WIS_pick;
                 if (points_E == 0)
                 {
                   System.out.println("you ran out of points. All remaning stats will be set to zero");
                    System.out.println("The stats for your wizard class is ");
                     System.out.println("STR = " + STR_pick);
                      System.out.println("DEX = " + DEX_pick);
                       System.out.println("CON = " + CON_pick);
                        System.out.println("INT = " + INT_pick);
                         System.out.println("WIS = " + WIS_pick);
                          System.out.println("CHA = 0");
                 }
                 else
                 {
                   System.out.println("You have " + points_E + " points left");
                   int CHA_pick = sc.nextInt();
                   if(CHA_pick <= 20)
                   {
                     int points_F = points_E - CHA_pick;
                     System.out.println("Your stats are compelete");
                      System.out.println("you have " + points_F + " left over");
                       System.out.println("The stats for your Wizard class is ");
                        System.out.println("STR = " + STR_pick);
                         System.out.println("DEX = " + DEX_pick);
                          System.out.println("CON = " + CON_pick);
                           System.out.println("INT = " + INT_pick);
                            System.out.println("WIS = " + WIS_pick);
                             System.out.println("CHA = " + CHA_pick);
                   }
                   else if (CHA_pick > 20)
                   {
                     System.out.println("Your pick is greater than 20");
                   }
                   else if (CHA_pick > points_E)
                   {
                     System.out.println("You don't have enough points for your pick");
                   }
                 }
                }
                else if (WIS_pick > 20)
                {
                  System.out.println("Your pick is greater than 20");
                }
                else if (WIS_pick > points_D)
                {
                  System.out.println("You don't have enough points for your pick");
                }
             }
            }
            else if (INT_pick > 20)
            {
              System.out.println("you pick was greater than 20");
            }
            else if ( INT_pick > points_C)
            {
              System.out.println("you don't have enough points for your pick");
            }
          }
          else if ( CON_pick > 20)
          {
            System.out.println(" your pick is greater than 20");
          }
        }
        else if ( DEX_pick > 20)
        {
          System.out.println("You pick was greater than 20");
        }
      }
      else if (STR_pick > 20)
      {
        System.out.println("your pick was greater than 20 ");
      }
  }
  else if (b.equals("rand"))
  {
   int STR_rand = rand.nextInt(19) + 1;
   int DEX_rand = rand.nextInt(19) + 1;
   int CON_rand = rand.nextInt(19) + 1;
   int INT_rand = rand.nextInt(19) + 1;
   int WIS_rand = rand.nextInt(19) + 1;
   int CHA_rand = rand.nextInt(19) + 1;
    System.out.println("your Wizard class is compelete, your stats are ");
     System.out.println("STR " + STR_rand);
      System.out.println("DEX " + DEX_rand);
       System.out.println("CON " + CON_rand);
        System.out.println("INT " + INT_rand);
         System.out.println("WIS " + WIS_rand);
          System.out.println("CHA " + CHA_rand);
  } // copy end here
 
}
else if (a.equals("Warrior"))
{
 System.out.println("Your new class is now a Warrior");
  System.out.println("Now it's time to pick your stats");
  System.out.println("if you want to pick your stats type ( pick ) , if you want random numbers type ( rand )");
  String b = sc.nextLine();
  if (b.equals("pick"))
  {
    System.out.println("The stats you need to fill in are ");
     System.out.println("Strength - The more pysical damage you can do");
      System.out.println("Dexterity - agility / quick movement");
      System.out.println("Constitution - is manly used for health");
      System.out.println("Intelligance - are you dumb? ( used for magic )");
       System.out.println("Wisdom - also used for magic");
       System.out.println("Charisma - this affects many things( is manly usedful for theifs )");
     System.out.println("You have 65 points to spend on the stats, and no stat ( for now ) is allowed to go over 20 ");
     System.out.println("what do you want for STR");
     int STR_pick = sc.nextInt();
     if ( STR_pick <= 20 )
      {
       int points_A = Points - STR_pick;
        System.out.println(" you have " + points_A + " points left");
         System.out.println("what do you want for DEX");
        int DEX_pick = sc.nextInt();
        if ( DEX_pick <= 20 )
        {
         int point_B = points_A - DEX_pick;
          System.out.println("you have " + point_B + " points left");
           System.out.println("What do you want for CON");
          int CON_pick = sc.nextInt();
          if ( CON_pick <= 20)
          {
           int points_C = point_B - CON_pick;
            System.out.println("You have " + points_C + " points left");
             System.out.println("What do you want for INT");
            int INT_pick = sc.nextInt();
            if (INT_pick <= 20)
            {
             int points_D = points_C - INT_pick;
             if (points_D <= 0)
             {
               System.out.println(" you ran out of points. All remaining stats will be zero");
               System.out.println(" The stats for your Warrior class is ");
                 System.out.println("STR = " + STR_pick);
                  System.out.println("DEX = " + DEX_pick);
                   System.out.println("CON = " + CON_pick);
                    System.out.println("INT = " + INT_pick );
                     System.out.println("WIS = 0");
                      System.out.println("CHA = 0");
                
             }
             else
             {
               System.out.println(" you have " + points_D + " points left");
                System.out.println("what do you want for WIS");
                int WIS_pick = sc.nextInt();
                if (WIS_pick <= 20)
                {
                 int points_E = points_D - WIS_pick;
                 if (points_E == 0)
                 {
                   System.out.println("you ran out of points. All remaning stats will be set to zero");
                    System.out.println("The stats for your warrior class is ");
                     System.out.println("STR = " + STR_pick);
                      System.out.println("DEX = " + DEX_pick);
                       System.out.println("CON = " + CON_pick);
                        System.out.println("INT = " + INT_pick);
                         System.out.println("WIS = " + WIS_pick);
                          System.out.println("CHA = 0");
                 }
                 else
                 {
                   System.out.println("You have " + points_E + " points left");
                   int CHA_pick = sc.nextInt();
                   if(CHA_pick <= 20)
                   {
                     int points_F = points_E - CHA_pick;
                     System.out.println("Your stats are compelete");
                      System.out.println("you have " + points_F + " left over");
                       System.out.println("The stats for your Warrior class is ");
                        System.out.println("STR = " + STR_pick);
                         System.out.println("DEX = " + DEX_pick);
                          System.out.println("CON = " + CON_pick);
                           System.out.println("INT = " + INT_pick);
                            System.out.println("WIS = " + WIS_pick);
                             System.out.println("CHA = " + CHA_pick);
                   }
                   else if (CHA_pick > 20)
                   {
                     System.out.println("Your pick is greater than 20");
                   }
                   else if (CHA_pick > points_E)
                   {
                     System.out.println("You don't have enough points for your pick");
                   }
                 }
                }
                else if (WIS_pick > 20)
                {
                  System.out.println("Your pick is greater than 20");
                }
                else if (WIS_pick > points_D)
                {
                  System.out.println("You don't have enough points for your pick");
                }
             }
            }
            else if (INT_pick > 20)
            {
              System.out.println("you pick was greater than 20");
            }
            else if ( INT_pick > points_C)
            {
              System.out.println("you don't have enough points for your pick");
            }
          }
          else if ( CON_pick > 20)
          {
            System.out.println(" your pick is greater than 20");
          }
        }
        else if ( DEX_pick > 20)
        {
          System.out.println("You pick was greater than 20");
        }
      }
      else if (STR_pick > 20)
      {
        System.out.println("your pick was greater than 20 ");
      }
  }
  else if (b.equals("rand"))
  {
   int STR_rand = rand.nextInt(19) + 1;
   int DEX_rand = rand.nextInt(19) + 1;
   int CON_rand = rand.nextInt(19) + 1;
   int INT_rand = rand.nextInt(19) + 1;
   int WIS_rand = rand.nextInt(19) + 1;
   int CHA_rand = rand.nextInt(19) + 1;
    System.out.println("your Warrior class is compelete, your stats are ");
     System.out.println("STR " + STR_rand);
      System.out.println("DEX " + DEX_rand);
       System.out.println("CON " + CON_rand);
        System.out.println("INT " + INT_rand);
         System.out.println("WIS " + WIS_rand);
          System.out.println("CHA " + CHA_rand);
  } // copy end here

}
else if (a.equals("warrior"))
{
  System.out.println("Your new class is now a Warrior");
  System.out.println("Now it's time to pick your stats");
  System.out.println("if you want to pick your stats type ( pick ) , if you want random numbers type ( rand )");
  String b = sc.nextLine();
  if (b.equals("pick"))
  {
    System.out.println("The stats you need to fill in are ");
     System.out.println("Strength - The more pysical damage you can do");
      System.out.println("Dexterity - agility / quick movement");
      System.out.println("Constitution - is manly used for health");
      System.out.println("Intelligance - are you dumb? ( used for magic )");
       System.out.println("Wisdom - also used for magic");
       System.out.println("Charisma - this affects many things( is manly usedful for theifs )");
     System.out.println("You have 65 points to spend on the stats, and no stat ( for now ) is allowed to go over 20 ");
     System.out.println("what do you want for STR");
     int STR_pick = sc.nextInt();
     if ( STR_pick <= 20 )
      {
       int points_A = Points - STR_pick;
        System.out.println(" you have " + points_A + " points left");
         System.out.println("what do you want for DEX");
        int DEX_pick = sc.nextInt();
        if ( DEX_pick <= 20 )
        {
         int point_B = points_A - DEX_pick;
          System.out.println("you have " + point_B + " points left");
           System.out.println("What do you want for CON");
          int CON_pick = sc.nextInt();
          if ( CON_pick <= 20)
          {
           int points_C = point_B - CON_pick;
            System.out.println("You have " + points_C + " points left");
             System.out.println("What do you want for INT");
            int INT_pick = sc.nextInt();
            if (INT_pick <= 20)
            {
             int points_D = points_C - INT_pick;
             if (points_D <= 0)
             {
               System.out.println(" you ran out of points. All remaining stats will be zero");
               System.out.println(" The stats for your Warrior class is ");
                 System.out.println("STR = " + STR_pick);
                  System.out.println("DEX = " + DEX_pick);
                   System.out.println("CON = " + CON_pick);
                    System.out.println("INT = " + INT_pick );
                     System.out.println("WIS = 0");
                      System.out.println("CHA = 0");
                
             }
             else
             {
               System.out.println(" you have " + points_D + " points left");
                System.out.println("what do you want for WIS");
                int WIS_pick = sc.nextInt();
                if (WIS_pick <= 20)
                {
                 int points_E = points_D - WIS_pick;
                 if (points_E == 0)
                 {
                   System.out.println("you ran out of points. All remaning stats will be set to zero");
                    System.out.println("The stats for your warrior class is ");
                     System.out.println("STR = " + STR_pick);
                      System.out.println("DEX = " + DEX_pick);
                       System.out.println("CON = " + CON_pick);
                        System.out.println("INT = " + INT_pick);
                         System.out.println("WIS = " + WIS_pick);
                          System.out.println("CHA = 0");
                 }
                 else
                 {
                   System.out.println("You have " + points_E + " points left");
                   int CHA_pick = sc.nextInt();
                   if(CHA_pick <= 20)
                   {
                     int points_F = points_E - CHA_pick;
                     System.out.println("Your stats are compelete");
                      System.out.println("you have " + points_F + " left over");
                       System.out.println("The stats for your Warrior class is ");
                        System.out.println("STR = " + STR_pick);
                         System.out.println("DEX = " + DEX_pick);
                          System.out.println("CON = " + CON_pick);
                           System.out.println("INT = " + INT_pick);
                            System.out.println("WIS = " + WIS_pick);
                             System.out.println("CHA = " + CHA_pick);
                   }
                   else if (CHA_pick > 20)
                   {
                     System.out.println("Your pick is greater than 20");
                   }
                   else if (CHA_pick > points_E)
                   {
                     System.out.println("You don't have enough points for your pick");
                   }
                 }
                }
                else if (WIS_pick > 20)
                {
                  System.out.println("Your pick is greater than 20");
                }
                else if (WIS_pick > points_D)
                {
                  System.out.println("You don't have enough points for your pick");
                }
             }
            }
            else if (INT_pick > 20)
            {
              System.out.println("you pick was greater than 20");
            }
            else if ( INT_pick > points_C)
            {
              System.out.println("you don't have enough points for your pick");
            }
          }
          else if ( CON_pick > 20)
          {
            System.out.println(" your pick is greater than 20");
          }
        }
        else if ( DEX_pick > 20)
        {
          System.out.println("You pick was greater than 20");
        }
      }
      else if (STR_pick > 20)
      {
        System.out.println("your pick was greater than 20 ");
      }
  }
  else if (b.equals("rand"))
  {
   int STR_rand = rand.nextInt(19) + 1;
   int DEX_rand = rand.nextInt(19) + 1;
   int CON_rand = rand.nextInt(19) + 1;
   int INT_rand = rand.nextInt(19) + 1;
   int WIS_rand = rand.nextInt(19) + 1;
   int CHA_rand = rand.nextInt(19) + 1;
    System.out.println("your Warrior class is compelete, your stats are ");
     System.out.println("STR " + STR_rand);
      System.out.println("DEX " + DEX_rand);
       System.out.println("CON " + CON_rand);
        System.out.println("INT " + INT_rand);
         System.out.println("WIS " + WIS_rand);
          System.out.println("CHA " + CHA_rand);
  } // copy end here

}
else if (a.equals("Rogue"))
{
 System.out.println("Your new class is now a Rogue");
   System.out.println("Now it's time to pick your stats");
  System.out.println("if you want to pick your stats type ( pick ) , if you want random numbers type ( rand )");
  String b = sc.nextLine();
  if (b.equals("pick"))
  {
    System.out.println("The stats you need to fill in are ");
     System.out.println("Strength - The more pysical damage you can do");
      System.out.println("Dexterity - agility / quick movement");
      System.out.println("Constitution - is manly used for health");
      System.out.println("Intelligance - are you dumb? ( used for magic )");
       System.out.println("Wisdom - also used for magic");
       System.out.println("Charisma - this affects many things( is manly usedful for theifs )");
     System.out.println("You have 65 points to spend on the stats, and no stat ( for now ) is allowed to go over 20 ");
     System.out.println("what do you want for STR");
     int STR_pick = sc.nextInt();
     if ( STR_pick <= 20 )
      {
       int points_A = Points - STR_pick;
        System.out.println(" you have " + points_A + " points left");
         System.out.println("what do you want for DEX");
        int DEX_pick = sc.nextInt();
        if ( DEX_pick <= 20 )
        {
         int point_B = points_A - DEX_pick;
          System.out.println("you have " + point_B + " points left");
           System.out.println("What do you want for CON");
          int CON_pick = sc.nextInt();
          if ( CON_pick <= 20)
          {
           int points_C = point_B - CON_pick;
            System.out.println("You have " + points_C + " points left");
             System.out.println("What do you want for INT");
            int INT_pick = sc.nextInt();
            if (INT_pick <= 20)
            {
             int points_D = points_C - INT_pick;
             if (points_D <= 0)
             {
               System.out.println(" you ran out of points. All remaining stats will be zero");
               System.out.println(" The stats for your Rogue class is ");
                 System.out.println("STR = " + STR_pick);
                  System.out.println("DEX = " + DEX_pick);
                   System.out.println("CON = " + CON_pick);
                    System.out.println("INT = " + INT_pick );
                     System.out.println("WIS = 0");
                      System.out.println("CHA = 0");
                
             }
             else
             {
               System.out.println(" you have " + points_D + " points left");
                System.out.println("what do you want for WIS");
                int WIS_pick = sc.nextInt();
                if (WIS_pick <= 20)
                {
                 int points_E = points_D - WIS_pick;
                 if (points_E == 0)
                 {
                   System.out.println("you ran out of points. All remaning stats will be set to zero");
                    System.out.println("The stats for your Rogue class is ");
                     System.out.println("STR = " + STR_pick);
                      System.out.println("DEX = " + DEX_pick);
                       System.out.println("CON = " + CON_pick);
                        System.out.println("INT = " + INT_pick);
                         System.out.println("WIS = " + WIS_pick);
                          System.out.println("CHA = 0");
                 }
                 else
                 {
                   System.out.println("You have " + points_E + " points left");
                   int CHA_pick = sc.nextInt();
                   if(CHA_pick <= 20)
                   {
                     int points_F = points_E - CHA_pick;
                     System.out.println("Your stats are compelete");
                      System.out.println("you have " + points_F + " left over");
                       System.out.println("The stats for your Rogue class is ");
                        System.out.println("STR = " + STR_pick);
                         System.out.println("DEX = " + DEX_pick);
                          System.out.println("CON = " + CON_pick);
                           System.out.println("INT = " + INT_pick);
                            System.out.println("WIS = " + WIS_pick);
                             System.out.println("CHA = " + CHA_pick);
                   }
                   else if (CHA_pick > 20)
                   {
                     System.out.println("Your pick is greater than 20");
                   }
                   else if (CHA_pick > points_E)
                   {
                     System.out.println("You don't have enough points for your pick");
                   }
                 }
                }
                else if (WIS_pick > 20)
                {
                  System.out.println("Your pick is greater than 20");
                }
                else if (WIS_pick > points_D)
                {
                  System.out.println("You don't have enough points for your pick");
                }
             }
            }
            else if (INT_pick > 20)
            {
              System.out.println("you pick was greater than 20");
            }
            else if ( INT_pick > points_C)
            {
              System.out.println("you don't have enough points for your pick");
            }
          }
          else if ( CON_pick > 20)
          {
            System.out.println(" your pick is greater than 20");
          }
        }
        else if ( DEX_pick > 20)
        {
          System.out.println("You pick was greater than 20");
        }
      }
      else if (STR_pick > 20)
      {
        System.out.println("your pick was greater than 20 ");
      }
  }
  else if (b.equals("rand"))
  {
   int STR_rand = rand.nextInt(19) + 1;
   int DEX_rand = rand.nextInt(19) + 1;
   int CON_rand = rand.nextInt(19) + 1;
   int INT_rand = rand.nextInt(19) + 1;
   int WIS_rand = rand.nextInt(19) + 1;
   int CHA_rand = rand.nextInt(19) + 1;
    System.out.println("your Rogue class is compelete, your stats are ");
     System.out.println("STR " + STR_rand);
      System.out.println("DEX " + DEX_rand);
       System.out.println("CON " + CON_rand);
        System.out.println("INT " + INT_rand);
         System.out.println("WIS " + WIS_rand);
          System.out.println("CHA " + CHA_rand);
  } // copy end here

}
else if (a.equals("rogue"))
{
  System.out.println("Your new class is now a Rogue");
     System.out.println("Now it's time to pick your stats");
  System.out.println("if you want to pick your stats type ( pick ) , if you want random numbers type ( rand )");
  String b = sc.nextLine();
  if (b.equals("pick"))
  {
    System.out.println("The stats you need to fill in are ");
     System.out.println("Strength - The more pysical damage you can do");
      System.out.println("Dexterity - agility / quick movement");
      System.out.println("Constitution - is manly used for health");
      System.out.println("Intelligance - are you dumb? ( used for magic )");
       System.out.println("Wisdom - also used for magic");
       System.out.println("Charisma - this affects many things( is manly usedful for theifs )");
     System.out.println("You have 65 points to spend on the stats, and no stat ( for now ) is allowed to go over 20 ");
     System.out.println("what do you want for STR");
     int STR_pick = sc.nextInt();
     if ( STR_pick <= 20 )
      {
       int points_A = Points - STR_pick;
        System.out.println(" you have " + points_A + " points left");
         System.out.println("what do you want for DEX");
        int DEX_pick = sc.nextInt();
        if ( DEX_pick <= 20 )
        {
         int point_B = points_A - DEX_pick;
          System.out.println("you have " + point_B + " points left");
           System.out.println("What do you want for CON");
          int CON_pick = sc.nextInt();
          if ( CON_pick <= 20)
          {
           int points_C = point_B - CON_pick;
            System.out.println("You have " + points_C + " points left");
             System.out.println("What do you want for INT");
            int INT_pick = sc.nextInt();
            if (INT_pick <= 20)
            {
             int points_D = points_C - INT_pick;
             if (points_D <= 0)
             {
               System.out.println(" you ran out of points. All remaining stats will be zero");
               System.out.println(" The stats for your Rogue class is ");
                 System.out.println("STR = " + STR_pick);
                  System.out.println("DEX = " + DEX_pick);
                   System.out.println("CON = " + CON_pick);
                    System.out.println("INT = " + INT_pick );
                     System.out.println("WIS = 0");
                      System.out.println("CHA = 0");
                
             }
             else
             {
               System.out.println(" you have " + points_D + " points left");
                System.out.println("what do you want for WIS");
                int WIS_pick = sc.nextInt();
                if (WIS_pick <= 20)
                {
                 int points_E = points_D - WIS_pick;
                 if (points_E == 0)
                 {
                   System.out.println("you ran out of points. All remaning stats will be set to zero");
                    System.out.println("The stats for your Rogue class is ");
                     System.out.println("STR = " + STR_pick);
                      System.out.println("DEX = " + DEX_pick);
                       System.out.println("CON = " + CON_pick);
                        System.out.println("INT = " + INT_pick);
                         System.out.println("WIS = " + WIS_pick);
                          System.out.println("CHA = 0");
                 }
                 else
                 {
                   System.out.println("You have " + points_E + " points left");
                   int CHA_pick = sc.nextInt();
                   if(CHA_pick <= 20)
                   {
                     int points_F = points_E - CHA_pick;
                     System.out.println("Your stats are compelete");
                      System.out.println("you have " + points_F + " left over");
                       System.out.println("The stats for your Rogue class is ");
                        System.out.println("STR = " + STR_pick);
                         System.out.println("DEX = " + DEX_pick);
                          System.out.println("CON = " + CON_pick);
                           System.out.println("INT = " + INT_pick);
                            System.out.println("WIS = " + WIS_pick);
                             System.out.println("CHA = " + CHA_pick);
                   }
                   else if (CHA_pick > 20)
                   {
                     System.out.println("Your pick is greater than 20");
                   }
                   else if (CHA_pick > points_E)
                   {
                     System.out.println("You don't have enough points for your pick");
                   }
                 }
                }
                else if (WIS_pick > 20)
                {
                  System.out.println("Your pick is greater than 20");
                }
                else if (WIS_pick > points_D)
                {
                  System.out.println("You don't have enough points for your pick");
                }
             }
            }
            else if (INT_pick > 20)
            {
              System.out.println("you pick was greater than 20");
            }
            else if ( INT_pick > points_C)
            {
              System.out.println("you don't have enough points for your pick");
            }
          }
          else if ( CON_pick > 20)
          {
            System.out.println(" your pick is greater than 20");
          }
        }
        else if ( DEX_pick > 20)
        {
          System.out.println("You pick was greater than 20");
        }
      }
      else if (STR_pick > 20)
      {
        System.out.println("your pick was greater than 20 ");
      }
  }
  else if (b.equals("rand"))
  {
   int STR_rand = rand.nextInt(19) + 1;
   int DEX_rand = rand.nextInt(19) + 1;
   int CON_rand = rand.nextInt(19) + 1;
   int INT_rand = rand.nextInt(19) + 1;
   int WIS_rand = rand.nextInt(19) + 1;
   int CHA_rand = rand.nextInt(19) + 1;
    System.out.println("your Rogue class is compelete, your stats are ");
     System.out.println("STR " + STR_rand);
      System.out.println("DEX " + DEX_rand);
       System.out.println("CON " + CON_rand);
        System.out.println("INT " + INT_rand);
         System.out.println("WIS " + WIS_rand);
          System.out.println("CHA " + CHA_rand);
  } // copy end here

}
else
{
 System.out.println("Your input does not macth any of the classes above. ");
}

	}
}
