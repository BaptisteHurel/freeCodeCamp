using System;
using System.Xml.Linq;

namespace Tutorial_csharp
{
    class Program
    {
        static void Main(string[] args)
        {
            // - Variables
            /*
            string characterName = "Casper";
            int characterAge;
            characterAge = 25;
            Console.WriteLine("There once was a man named " + characterName);
            Console.WriteLine("He was " + characterAge + " years old");
            characterName = "Stephen";
            Console.WriteLine("he really liked the name " + characterName);
            Console.WriteLine("But didn't like being " + characterAge);
            */

            /*
            // - Data Type
            string phrase = "C# Tutorial";
            char grade = 'A';
            int age = 25;
            // float , double, decimal
            double gpa = 3.6;
            bool isMale = true;
            */

            /*
            // - Working with Strings
            string phrase = "C# Tutorial" + " is cool";
            //Console.WriteLine(phrase.Contains("Tutorial") );
            //Console.WriteLine(phrase[6]);
            Console.WriteLine(phrase.Substring(5));
            */

            /*
            // - Working with numbers
            int num1 = 6;
            int num2 = 3;
            num1++;
            Console.WriteLine(Math.Pow(num1, num2));
            //Console.WriteLine(num);
            //Console.WriteLine(5 % 2);
            //Console.WriteLine(5 / 2.O);
            */

            /*
            // - Getting User Input
            Console.Write("Enter your name: ");
            string name = Console.ReadLine();
            Console.Write("Enter your age: ");
            string age = Console.ReadLine();
            Console.WriteLine("Hello " + name + " you are " + age + " years old");
            */

            /*
            // - Building a Caculator
            //num = Convert.ToInt32("98");
            //Console.WriteLine(num + "8");
            Console.Write("Entrer a number: ");
            double num1 = Convert.ToDouble(Console.ReadLine());
            Console.Write("Entrer another number: ");
            double num2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine(num1 + num2);
            */

            /*
            // - Building a Mad Lib
            string color, pluralNoun, celebrity;
            Console.Write("Entrer a color: ");
            color = Console.ReadLine();
            Console.Write("Entrer a plural noun: ");
            pluralNoun = Console.ReadLine();
            Console.Write("Entrer a celebrity: ");
            celebrity = Console.ReadLine();
            Console.WriteLine("Roses are " + color);
            Console.WriteLine(pluralNoun + " are blue");
            Console.WriteLine("I Love " + celebrity);
            */

            /*
            // - Arrays
            int[] luckyNumbers = { 3, 4, 8, 12, 32, 78};
            string[] friends = new string[10];
            friends[0] = "Jim";
            friends[0] = "Anne";
            luckyNumbers[1] = 100;
            Console.WriteLine(luckyNumbers[1]);
            */

            /*
            // - Methods
            SayHi("Baptiste", 24);
            SayHi("John", 34);
            */

            /*
            // - Return Statement
            int cubedNumber = cube(5);
            Console.WriteLine(cubedNumber) ;
            */

            /*
            // - If Statements
            bool isMale = true;
            bool isTall = false;

            if (isMale && isTall) // (isMale || isTall) 
            {
                Console.WriteLine("You are a tall male");
            } else if (isMale && !isTall) {
                Console.WriteLine("You are a short male");
            } else if (!isMale && isTall){
                Console.WriteLine("You are not a male but you are tall");
            } else
            {
                Console.WriteLine("You are not male and not tall");
            }
            */

            /*
            // - If Statements (con't)
            Console.WriteLine(GetMax(10, 8, 22));
            */

            /*
            // - Building a Better Calculator
            Console.WriteLine("Enter a number: ");
            double num1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Enter Operator");
            string op = Console.ReadLine();

            Console.WriteLine("Enter a number: ");
            double num2 = Convert.ToDouble(Console.ReadLine());

            if (op == "+")
            {
                Console.WriteLine(num1 + num2);
            }
            else if (op == "-")
            {
                Console.WriteLine(num1 - num2);

            }
            else if (op == "/")
            {
                Console.WriteLine(num1 / num2);

            }
            else if (op == "*")
            {
                Console.WriteLine(num1 * num2);

            }
            else
            {
                Console.WriteLine("Invalid Operator");
            }
            */

            /*
            // - Switch Statements
            Console.WriteLine(GetDay(0));
            */

            /*
            // - While Loops / Do While Loops
            int index = 6;
            do
            {
                Console.WriteLine(index);
                index++;
            } while (index <= 5);
            */

            /*
            // - Building a Guessing Game
            string secretWord = "tutorial";
            string guess = "";
            int guessCount = 0;
            int guessLimit = 3;
            bool outOfGuesses = false;

            while(guess != secretWord && !outOfGuesses)
            {
                if (guessCount <= guessLimit)
                {
                    Console.Write("Entrer guess: ");
                    guess = Console.ReadLine();
                    guessCount++;
                }
                else
                {
                    outOfGuesses = true;
                }
                
            }
            if (outOfGuesses)
            {
                Console.Write("You Lose!");
            }
            else
            {
                Console.Write("You Win!");
            }
            */

            /*
            // - For Loops
            int[] luckyNumbers = { 3, 4, 8, 12, 32, 78 };
            for (int i = 0; i <= luckyNumbers.Length; i++)
            {
                Console.WriteLine(luckyNumbers[i]);
            }
            */

            /*
            // - Building an Exponent Method
            Console.WriteLine(GetPow(4, 5));
            */

            /*
            // - 2D Arrays
            int[,] numberGrid =
            {
                {1, 2 },
                {3, 4 },
                {5, 6 }
            };
            int[,] myArray = new int[2, 3];
            Console.WriteLine(numberGrid[1, 1]);
            */

            /*
            // - Exception Handling
            try
            {
                Console.Write("Entrer a number: ");
                double num1 = Convert.ToDouble(Console.ReadLine());
                Console.Write("Entrer another number: ");
                double num2 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(num1 / num2);
            }
            catch(DivideByZeroException e)
            {
                Console.WriteLine(e.Message );
            }
            catch (FormatException e) // Message de l'erreur
            {
                Console.WriteLine(e.Message);
            }
            */

            /*
            // Classes & Objects
            Book book1 = new Book("Harry Potter", "JK Rowling", 400);
            Book book2 = new Book("Lord of the Rings", "Tolkien", 700);
            Book book3 = new Book();
            book1.title = "The Hobbit";
            Console.WriteLine(book1.title);
            Console.WriteLine(book2.author);
            */

            /*
            // Objects Methods
            Student student1 = new Student("Jim", "Business", 2.8);
            Student student2 = new Student("Pam", "Art", 3.6);

            Console.WriteLine(student1.HasHonors());
            Console.WriteLine(student2.HasHonors());
            */

            /*
            // - Getters & Setters 
            Movie avengers = new Movie("The Avengers", "Joss Whedon", "Dog");
            Movie shrek = new Movie("Shrek", "Adam Adamson", "PG");
            shrek.Rating = "R"; 
            Console.WriteLine(avengers.Rating);
            */

            /*
            // - Static Class Attibutes
            Song holiday = new Song("Holiday", "Green Day", 200);
            Console.WriteLine(Song.songCount);
            Song kashmir = new Song("Kashmir", "Led Zeppelin", 150);
            Console.WriteLine(Song.songCount);
            Console.WriteLine(kashmir.getSongCount());
            */

            /*
            // - Static Methods & Classes
            UsefulTools.SayHi("Baptiste");
            */

            // - Inheritance
            Chef chef = new Chef();
            chef.MakeChicken();

            ItalianChef italianChef = new ItalianChef();
            italianChef.MakeChicken();
            italianChef.MakePasta();


            Console.ReadLine();
        }

        /*
        // - Methods
        static void SayHi(string name, int age)
        {
            Console.Write("Hello " + name + "you are " + age);
        }
        */

        /*
        // - Return Statement
        static int cube(int num)
        {
            int result = num * num * num;
            return result;
        }
        */

        /*
        // - If Statements (con't)
        static int GetMax(int num1, int num2, int num3)
        {
            int result;
            if (num1 >= num2 && num1 >= num3) 
            {
                result = num1;
            }
            else if(num2 >= num1 && num2 >= num3)
            {
                result = num2;
            }
            else
            {
                result = num3;
            }
            return result;
        }
        */

        /*
        // - Switch Statements
        static string GetDay(int dayNum)
        {
            string dayName;

            switch (dayNum)
            {
                case 0:
                    dayName = "Sunday";
                    break;
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                default:
                    dayName = "Invalid Day Number";
                    break;
            }
            return dayName;
        }
        */

        /*
        // - Building an Exponent Method
        static int GetPow(int baseNum, int powNum)
        {
            int result = 1;

            for (int i = 0; i < powNum; i++)
            {
                result = result * baseNum;
            }

            return result;
        }
        */


    }
}

