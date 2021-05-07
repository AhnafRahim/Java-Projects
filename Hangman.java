
package hangman;
import java.util.*;
public class Hangman 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice;
		do
		{
			char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
					'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
			String answer = getWord();
			sc.nextLine();
			char[] blanks = new char[answer.length()];
			char[] ans = new char[answer.length()];
			for(int i = 0; i < answer.length();i++)
			{
				if(inSpecial(answer.charAt(i)))
				{
					blanks[i] = answer.charAt(i);
				}
				else
				{
					blanks[i] = '_';
				}
				
				
				ans[i] = answer.charAt(i);
			}
			int num = 0;
			boolean gameOn = true;
			String guess = "";
			do 
			{
				draw(num);
				printRemLetters(letters);
				printArr(blanks);
				System.out.print("Guess a letter: ");
				guess = sc.nextLine();
				if(guess.equals(answer))
				{
					gameOn = false;
					System.out.println("Congratulations! You guessed the answer and saved a life!");
					break;
				}
				else if(guess.length() > 1 && !guess.equals(answer))
				{
					gameOn = false;
					draw(10);
					System.out.println("The correct answer was " + answer);
				}
				else
				{
					char let = guess.charAt(0);
					boolean inAns = false;
					for(int i = 0; i < ans.length; i++)
					{
						if(let == ans[i])
						{
							blanks[i] = let;
							inAns = true;
						}
					}
					if(!inAns)
					{
						num++;
					}
					for(int i = 0; i < letters.length; i++)
					{
						
						if(letters[i] == toUpper(let))
						{
							letters[i] = ' ';
						}
					}
					
				}
				boolean correct = true;
				for(int i = 0; i < ans.length; i++)
				{
					if(blanks[i] != answer.charAt(i))
					{
						correct = false;
					}
				}
				if(correct)
				{
					gameOn = false;
					System.out.println("Congratulations! You solved it and saved a life!\n" + answer);
				}
				if(num == 10)
				{
					gameOn = false;
					draw(10);
				}
			}while(gameOn);
			System.out.println("Would you like to play again (1 - yes / 2 - no): ");
			choice = sc.nextInt();
		}while(choice != 2);
	}
	
	public static boolean inSpecial(char x)
	{
		char spec[] = {' ', '\'', ',', '-'};
		for(int i = 0; i < spec.length; i++)
		{
			if(spec[i] == x)
			{
				return true;
			}
		}
		return false;
	}
	
	public static char toUpper(char x)
	{
		if(x >= 97 && x <= 122)
		{
			x -= 32;
			return x;
		}
		else
		{
			return x;
		}
	}
	
	public static void printArr(char[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void printRemLetters(char[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
			if(i == arr.length/2-1)
			{
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static void draw(int x)
	{
		switch(x)
		{
		case 0:
			System.out.println();
			break;
		case 1:
			System.out.println("____________________");
			break;
		case 2:
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("________________|___");
			break;
		case 3:
			System.out.println("_________________   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("________________|___");
			break;
		case 4:
			System.out.println("_________________   ");
			System.out.println("      |         |   ");
			System.out.println("      |         |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("________________|___");
			break;
		case 5:
			System.out.println("_________________   ");
			System.out.println("      |         |   ");
			System.out.println("      |         |   ");
			System.out.println("      O         |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("________________|___");
			break;
		case 6:
			System.out.println("_________________   ");
			System.out.println("      |         |   ");
			System.out.println("      |         |   ");
			System.out.println("      O         |   ");
			System.out.println("      |         |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("________________|___");
			break;
		case 7:
			System.out.println("_________________   ");
			System.out.println("      |         |   ");
			System.out.println("      |         |   ");
			System.out.println("      O         |   ");
			System.out.println("      |/        |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("________________|___");
			break;
		case 8:
			System.out.println("_________________   ");
			System.out.println("      |         |   ");
			System.out.println("      |         |   ");
			System.out.println("      O         |   ");
			System.out.println("     \\|/        |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("________________|___");
			break;
		case 9:
			System.out.println("_________________   ");
			System.out.println("      |         |   ");
			System.out.println("      |         |   ");
			System.out.println("      O         |   ");
			System.out.println("     \\|/        |   ");
			System.out.println("     /          |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("________________|___");
			break;
		case 10:
			System.out.println("_________________   ");
			System.out.println("      |         |   ");
			System.out.println("      |         |   ");
			System.out.println("      O         |   ");
			System.out.println("     \\|/        |   ");
			System.out.println("     / \\        |   ");
			System.out.println("                |   ");
			System.out.println("                |   ");
			System.out.println("________________|___");
			System.out.println("YO THAT DUDE IS DEAD!");
			break;
		}
	}

	public static String getWord()
	{
		Random rand = new Random();
		System.out.print("Choose a Category:\n1. Actors\n2. Actresses\n3. Stores\n4. Restaurants" + 
							"\n5. U.S. Cities\n6. Technology\n7. Continents\n8. Bodies of Water" + 
							"\n9. Animals\n10. School Subjects\n11. Food\n12. States\n13. Capital Cities" + 
							"\n14. Singers\n15. Random\nYour choice: ");
		int choice = sc.nextInt();
		
		String actors[] = {"brad pitt", "george clooney", "matt damon", "ben affleck", "ryan reynolds", "ryan gosling", "channing tatum", "robert downey jr", "chadwick boseman", "chris pratt", "steve carell", "zach galifianakis", "jet li", "sylvester stallone", "jason statham", "vin diesel", "idris elba", "john boyega", "scott eastwood", "forest whitaker"};
		String actresses[] = {"julia roberts", "lupita nyongo", "charlize theron", "gwyneth paltrow", "gwendoline christie", "angelina jolie", "jennifer anniston", "jennifer garner", "lucy liu", "drew barrymore", "cameron diaz", "viola davis", "meryl streep", "gal gadot", "zoe saldana", "kate winslet", "natalie portman", "jennifer lawrence", "scarlet johannson", "anne hathaway"};
		String stores[] = {"target", "walmart", "best buy", "aeropostale", "hollister", "sephora", "home depot", "abercrombie", "pet smart", "nordstrom", "toys r us", "zumiez", "macy's", "jcpenney", "zara", "marshall's", "five below", "claire's", "foot locker", "banana republic", "old navy", "dick's sporting goods"};
		String restaurants[] = {"wendy's", "mcdonald's", "burger king", "chick-fil-a", "smashburger", "chipotle", "taco bell", "charleys", "applebees", "cheesecake factory", "chili's", "pizza hut", "dominos", "papa john's", "qdoba"};
		String cities[] = {"new york city", "dallas", "philadelphia", "san antonio", "miami", "boston", "los angeles", "chicago", "detroit", "cleveland", "salt lake city", "trenton", "newark", "baltimore", "san fransisco", "san diego", "columbus", "portland", "des moines", "buffalo", "albany", "camden", "pittsburgh", "indianapolis", "annapolis", "baton rouge", "montgomery", "atlanta", "salem", "hartford", "concord", "oakland", "new orleans", "kansas city", "cincinnati", "st. louis", "albuquerque", "seattle", "denver", "richmond", "houston", "san jose", "syracuse"};
		String tech[] = {"processor", "computer", "smart phone", "laptop", "tablet", "hotspot", "wireless", "ultra high definition", "facial recognition", "biometric locks", "fingerprint scanner", "megapixel", "touch screen"};
		String continents[] = {"north america", "south america", "europe", "asia", "africa", "australia", "antarctica"};
		String bodiesWater[] = {"atlantic ocean", "pacific ocean", "indian ocean", "arctic ocean", "carribean sea", "mediterranean sea", "gulf of mexico", "black sea", "caspian sea", "nile river", "mississippi river", "amazon river", "lake erie", "lake superior", "lake huron", "lake michigan", "lake ontario", "colorado river", "lake mead"};
		String animals[] = {"eagle", "tiger", "lion", "bear", "hawk", "horse", "snake", "elephant", "giraffe", "turkey", "monkey", "gorilla", "zebra", "chimpanzee", "turtle", "dolphin", "shark", "gecko", "frog", "llama", "donkey", "rooster", "chicken"};
		String subjects[] = {"english", "literature", "science", "history", "economics", "chemistry", "biology", "physics", "algebra", "geometry", "calculus", "statistics", "mythology", "computer science", "physical education", "drivers education", "health", "music", "fashion", "programming"};
		String food[] = {"apple", "strawberry", "pizza", "hamburger", "hot dog", "fried chicken", "mashed potatoes", "steak", "burrito", "cake", "apple pie", "cherry pie", "blueberry pie", "chocolate", "taco", "spaghetti", "pepperoni", "lettuce", "tomato", "cucumber", "olive", "vanilla", "ice cream", "mango", "banana", "cherry", "peach", "pear", "orange", "lemon", "lime", "eggplant", "zucchini", "butternut squash", "sweet potato", "onions", "lamb chop", "pork chop", "cheesesteak", "shrimp scampi"};
		String states[] = {"alabama", "alaska", "arizona", "arkansas", "california", "colorado", "connecticut", "delaware", "florida", "georgia", "hawaii", "idaho", "illinois", "indiana", "iowa", "kansas", "kentucky", "louisiana", "maine", "maryland", "massachusetts", "michigan", "minnesota", "mississippi", "missouri", "montana", "nebraska", "nevada", "new hampshire", "new jersey", "new mexico", "new york", "north carolina", "north dakota", "ohio", "oklahoma", "oregon", "pennsylvania", "rhode island", "south carolina", "south dakota", "tennessee", "texas", "utah", "vermont", "virginia", "washington", "west virginia", "wisconsin", "wyoming"};
		String capitals[] = {"montgomery, alabama", "juneau, alaska", "phoenix, arizona", "little rock, arkansas", "sacramento, california", "denver, colorado", "hartford, connecticut", "dover, delaware", "tallahassee, florida", "atlanta, georgia", "honolulu, hawaii", "boise, idaho", "springfield, illinois", "des moines, iowa", "topeka, kansas", "frankfort, kentucky", "baton rouge, louisiana", "augusta, maine", "annapolis, maryland", "boston, massachusetts", "lansing, michigan", "saint paul, minnesota", "jackson, mississippi", "jefferson city, missouri", "helena, montana", "lincoln, nebraska", "carson city, nevada", "concord, new hampshire", "trenton, new jersey", "santa fe, new mexico", "albany, new york", "raliegh, north carolina", "bismarck, north dakota", "columbus, ohio", "oklahoma city, oklahoma", "salem, oregon", "harrisburg, pennsylvania", "providence, rhode island", "columbia, south carolina", "pierre, south dakota", "nashville, tennessee", "austin, texas", "salt lake city, utah", "montpelier, vermont", "richmond, virginia", "olympia, washington", "charleston, west virginia", "madison, wisconsin", "cheyenne, wyoming"};
		String singers[] = {"eminem", "beyonce", "rihanna", "taylor swift", "ariana grande", "katy perry", "justin bieber", "adele", "mariah carey", "bruno mars", "lil wayne", "shawn mendes", "justin timberlake", "madonna", "charlie puth", "alicia keys", "aretha franklin", "usher", "kanye west", "ed sheeran", "nicki minaj"};
		
		if(choice == 15)
		{
			choice = rand.nextInt(14) + 1;
		}
		
		System.out.print("The Category is: ");
		switch(choice)
		{
		case 1:
			System.out.println("Actors: ");
			return actors[rand.nextInt(actors.length)];
		case 2:
			System.out.println("Actresses: ");
			return actresses[rand.nextInt(actresses.length)];
		case 3:
			System.out.println("Stores: ");
			return stores[rand.nextInt(stores.length)];
		case 4:
			System.out.println("Restaurants: ");
			return restaurants[rand.nextInt(restaurants.length)];
		case 5:
			System.out.println("U.S. Cities: ");
			return cities[rand.nextInt(cities.length)];
		case 6:
			System.out.println("Technology: ");
			return tech[rand.nextInt(tech.length)];
		case 7:
			System.out.println("Continents: ");
			return continents[rand.nextInt(continents.length)];
		case 8:
			System.out.println("Bodies of Water: ");
			return bodiesWater[rand.nextInt(bodiesWater.length)];
		case 9:
			System.out.println("Animals: ");
			return animals[rand.nextInt(animals.length)];
		case 10:
			System.out.println("School Subjects: ");
			return subjects[rand.nextInt(subjects.length)];
		case 11:
			System.out.println("Food: ");
			return food[rand.nextInt(food.length)];
		case 12:
			System.out.println("States: ");
			return states[rand.nextInt(states.length)];
		case 13:
			System.out.println("Capital Cities: ");
			return capitals[rand.nextInt(capitals.length)];
		case 14:
			System.out.println("Singers: ");
			return singers[rand.nextInt(singers.length)];
		default:
			return "follow instructions";
		}
		
	}
	
}
