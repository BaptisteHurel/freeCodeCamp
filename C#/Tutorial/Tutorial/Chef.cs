using System;
namespace Tutorial_csharp
{
	public class Chef
	{
		public void MakeChicken()
		{
			Console.WriteLine("The Chef makes chicken");
		}

        public void MakeSalad()
        {
            Console.WriteLine("The Chef makes salad");
        }

        public virtual void MakeSpecialDish() // virtual --> only have access in Chef / not in inheritance classes
        {
            Console.WriteLine("The Chef makes bbq ribs");
        }

    }
}

