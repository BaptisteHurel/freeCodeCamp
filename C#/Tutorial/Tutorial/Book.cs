using System;
namespace Tutorial_csharp
{
    // Classes & Objects
    public class Book
	{
		public string title;
		public string author;
		public int pages;

		public Book()
		{

		}

		public Book(string aTitle, string aAuthor, int aPages)
		{
			title = aTitle;
			author = aAuthor;
			pages = aPages;
		}
	}
}

