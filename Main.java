import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    /*
    int[] nums = new int[6];
    nums[0] = 5;
    nums[1] = 10;
    nums[2] = 15;
    nums[3] = 20;
    nums[4] = 25;
    nums[5] = 30;
    
    for (int i = 0; i < nums.length; i++)
    {
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
    System.out.println();

    for (int i = nums.length-1; i >= nums.length; i--)
    {
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
    System.out.println();

    int sum = nums[0] + nums[1];
    System.out.println("sum = " + sum);
    nums[5] = nums[5]*2;
    System.out.println("nums[5] " + nums[5]);
    System.out.println();

    for (int i = 0; i < nums.length; i++)
    {
      nums[i] = (nums[i]/5);
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
    System.out.println();


    int[] nums2 = {3, 6, 9, 12, 15, 18};

    for (int i = 0; i < nums2.length; i++)
    {
      System.out.println("nums2[" + i + "] = " + nums2[i]);
    }
    System.out.println();


   /* String[] candy = new String[5];
    Scanner scan = new Scanner(System.in);
    int index = 0;

    while(index < candy.length+1)
    {
      System.out.println("Enter a candy:");
      candy[index] = scan.nextLine();
      System.out.println("candy[" + index + "] = " + candy[index]);
      System.out.println();
      index++;
    } ////////////////////////////////////////////////////////////////////////////////////////

    //Lesson two - searching.
    System.out.println("//////////////////////////");

    int look = 12;
    int indexWhere = -1;

    for (int index = 0; index<nums.length; index++)
    {
      if (nums[index] == look)
      {
        indexWhere = index;
        break;    //break forces you to exit the loop, when you find look you just leave the loop cuz you're done.
      }
    }
    if (indexWhere != -1)
    {
      System.out.println("Look has been found at " + indexWhere);
    }
    else 
    {
      System.out.println("Look has not been found");
    }

//Searching for string.

String [] words = {"I", "like", "to", "run"};

int indexWhere2 = -1;

    for (int index = 0; index<words.length; index++)
    {
      if (words[index].equals("like"))
      {
        indexWhere2 = index;
        break;    //break forces you to exit the loop, when you find look you just leave the loop cuz you're done.
      }
    }
    if (indexWhere2 != -1)
    {
      System.out.println("Word has been found at " + indexWhere);
    }
    else 
    {
      System.out.println("Word has not been found");
    }

//count the values.

int evens = 0;
int odds = 0;

for(int index = 0; index<nums.length; index++)
{
  if (nums[index] % 2 == 0)
  {
    evens++;
  }
  else
  {
    odds++;
  }
}
System.out.println("evens: " + evens + "odds: " + odds);

//Set flag if word has more than 4 letters.

boolean flags = false;

 for (int index = 0; index<words.length; index++)
    {
      if (words[index].length()>=4);
      {
        flags = true;
        break;
      }
    }
    System.out.println("Were there any words with more than four letters? \n" + flags); */

    String words2[] = {"apple", "banana", "strawberry", "blueberries"};

    for (int i = 0; i < words2.length; i++)   //Prints the index value and the first and last letter of that string.
    {
      String first = words2[i].substring(0,1);
      String last = words2[i].substring(words2[i].length()-1, words2[i].length());
      System.out.println("Index value " + i + ": " + words2[i] + " " + first + " " + last);
    }

  }
}