using System;
namespace Tutorial_csharp
{
	public class ItalianChef : Chef
	{
        public void MakePasta()
        {
            Console.WriteLine("The Chef makes pasta");
        }

        public virtual void MakeSpecialDish()
        {
            Console.WriteLine("The Chef makes chicken parm ");
        }
    }
}

