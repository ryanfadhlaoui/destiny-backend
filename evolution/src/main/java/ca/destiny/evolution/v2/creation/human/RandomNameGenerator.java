package ca.destiny.evolution.v2.creation.human;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomNameGenerator {

    private static final List<String> males;
    private static final List<String> lastName;
    private static final List<String> females;

    static {
        males = Arrays.asList(
                "James",
                "Sylvain",
                "Liam",
                "John",
                "Robert",
                "Michael",
                "William",
                "Hamza",
                "David",
                "zoro",
                "Richard",
                "Joseph",
                "Thomas",
                "Charles",
                "Christopher",
                "Daniel",
                "Matthew",
                "Aragorn",
                "Legolas",
                "Frodon",
                "Gandalf",
                "Gimli",
                "Elrond",
                "Sam",
                "Anthony",
                "Harry",
                "Donald",
                "Mark",
                "Paul",
                "Gohan",
                "Steven",
                "Andrew",
                "Kenneth",
                "Joshua",
                "Kevin",
                "Brian",
                "George",
                "Edward",
                "Ronald",
                "Timothy",
                "Jason",
                "Jeffrey",
                "Luffy",
                "Ryan",
                "Jacob",
                "Gary",
                "Evan",
                "Nicholas",
                "Eric",
                "Jonathan",
                "Stephen",
                "Larry",
                "Justin",
                "Scott",
                "Usop",
                "Brandon",
                "Benjamin",
                "Samuel",
                "Sammy",
                "Frank",
                "Gregory",
                "Raymond",
                "Alexander",
                "Patrick",
                "Jack",
                "Dennis",
                "Jerry",
                "Tyler",
                "Aaron",
                "Jose",
                "Henry",
                "Adam",
                "Douglas",
                "Nathan",
                "Peter",
                "Zachary",
                "Kyle",
                "Walter",
                "Harold",
                "Jeremy",
                "Ethan",
                "Carl",
                "Keith",
                "Roger",
                "Gerald",
                "Christian",
                "Terry",
                "Sean",
                "Frank",
                "Arthur",
                "Austin",
                "Noah",
                "Lawrence",
                "Jesse",
                "Joe",
                "Bryan",
                "Billy",
                "Jordan",
                "Albert",
                "Dylan",
                "Bruce",
                "Willie",
                "Gabriel",
                "Alan",
                "Juan",
                "Logan",
                "Wayne",
                "Ralph",
                "Roy",
                "Eugene",
                "Randy",
                "Vincent",
                "Russell",
                "Louis",
                "Philip",
                "Bobby",
                "Johnny",
                "Bradley");
        lastName = Arrays.asList("Smith",
                "Johnson",
                "Williams",
                "Brown",
                "Jones",
                "Garcia",
                "Miller",
                "Davis",
                "Rodriguez",
                "Martinez",
                "Hernandez",
                "Lopez",
                "Gonzales",
                "Wilson",
                "Anderson",
                "Thomas",
                "Taylor",
                "Moore",
                "Jackson",
                "Martin",
                "Lee",
                "Perez",
                "Thompson",
                "White",
                "Harris",
                "Sanchez",
                "Clark",
                "Ramirez",
                "Lewis",
                "Robinson",
                "Walker",
                "Young",
                "Allen",
                "King",
                "Scott",
                "Torres",
                "Nguyen",
                "Hill",
                "Flores",
                "Green",
                "Adams",
                "Nelson",
                "Baker",
                "Hall",
                "Rivera",
                "Campbell",
                "Mitchell",
                "Carter",
                "Roberts",
                "Gomez",
                "Phillips",
                "Evans",
                "Turner",
                "Diaz",
                "Cruz",
                "Edwards",
                "Collins",
                "Reyes",
                "Morris",
                "Morales",
                "Murphy",
                "Cook",
                "Rogers",
                "Gutierrez",
                "Ortiz",
                "Cooper",
                "Peterson",
                "Bailey",
                "Reed",
                "Kelly",
                "Howard",
                "Ramos",
                "Cox",
                "Ward",
                "Richardson",
                "Watson",
                "Chavez",
                "Wood",
                "Bennet",
                "Mendoza",
                "Ruiz",
                "Hughes",
                "Price",
                "Alvarez",
                "Castillo",
                "Sanders",
                "Patel",
                "Myers",
                "Long",
                "Ross",
                "Jimenez",
                "Murphy",
                "Kelly",
                "O’Sullivan",
                "Walsh",
                "Smith",
                "O’Brien",
                "Byrne",
                "Ryan",
                "O’Connor",
                "O’Neill",
                "O’Reilly",
                "Doyle",
                "McCarthy",
                "Gallagher",
                "O’Doherty",
                "Kennedy",
                "Lynch",
                "Murray",
                "Quinn",
                "Moore",
                "McLoughlin",
                "O’Carroll",
                "Connolly",
                "Daly",
                "O’Connell",
                "Wilson",
                "Dunne",
                "Brennan",
                "Burke",
                "Collins",
                "Campbell",
                "Clarke",
                "Johnston",
                "Hughes",
                "O’Farrell",
                "Fitzgerald",
                "Brown",
                "Martin",
                "Maguire",
                "Nolan",
                "Flynn",
                "Thompson",
                "O’Callaghan",
                "O’Donnell",
                "Duffy",
                "O’Mahony",
                "Boyle",
                "Healy",
                "O’Shea",
                "White",
                "Sweeney",
                "Hayes",
                "Kavanagh",
                "Power",
                "McGrath",
                "Moran",
                "Brady",
                "Stewart",
                "Casey",
                "Foley",
                "Fitzpatrick",
                "O’Leary",
                "McDonnell",
                "Roronoa",
                "MacMahon",
                "Donnelly",
                "Regan",
                "Donovan",
                "Burns",
                "Flanagan",
                "Mullan",
                "Barry",
                "Kane",
                "Robinson",
                "Cunningham",
                "Griffin",
                "Kenny",
                "Sheehan",
                "Ward",
                "Whelan",
                "Lyons",
                "Reid",
                "Graham",
                "Higgins",
                "Cullen",
                "Keane",
                "King",
                "Maher",
                "MacKenna",
                "Bell",
                "Scott",
                "Hogan",
                "O’Keeffe",
                "Magee",
                "MacNamara",
                "MacDonald",
                "MacDermott",
                "Molony",
                "O’Rourke",
                "Monkey",
                "Buckley",
                "O’Dwyer"
        );
        females = Arrays.asList("Mary",
                "Patricia",
                "Jennifer",
                "Linda",
                "Raissa",
                "Arwen",
                "Eowyn",
                "Jade",
                "Christalle",
                "Rubis",
                "Saphir",
                "Emeraude",
                "Ambre",
                "Elizabeth",
                "Nami",
                "Barbara",
                "Susan",
                "Jessica",
                "Sarah",
                "Karen",
                "Nancy",
                "Lisa",
                "Margaret",
                "Betty",
                "Sandra",
                "Ashley",
                "Dorothy",
                "Kimberly",
                "Emily",
                "Donna",
                "Michelle",
                "Carol",
                "Amanda",
                "Melissa",
                "Deborah",
                "Stephanie",
                "Rebecca",
                "Robin",
                "Laura",
                "Sharon",
                "Cynthia",
                "Kathleen",
                "Amy",
                "Shirley",
                "Angela",
                "Helen",
                "Anna",
                "Brenda",
                "Pamela",
                "Nicole",
                "Samantha",
                "Katherine",
                "Emma",
                "Ruth",
                "Christine",
                "Catherine",
                "Debra",
                "Rachel",
                "Carolyn",
                "Janet",
                "Virginia",
                "Maria",
                "Heather",
                "Diane",
                "Julie",
                "Joyce",
                "Victoria",
                "Kelly",
                "Christina",
                "Lauren",
                "Joan",
                "Evelyn",
                "Olivia",
                "Judith",
                "Megan",
                "Cheryl",
                "Martha",
                "Andrea",
                "Frances",
                "Hannah",
                "Jacqueline",
                "Ann",
                "Gloria",
                "Jean",
                "Kathryn",
                "Alice",
                "Teresa",
                "Sara",
                "Janice",
                "Doris",
                "Madison",
                "Julia",
                "Grace",
                "Judy",
                "Abigail",
                "Marie",
                "Denise",
                "Beverly",
                "Amber",
                "Theresa",
                "Marilyn",
                "Danielle",
                "Diana",
                "Brittany",
                "Natalie",
                "Sophia",
                "Rose",
                "Isabella",
                "Alexis",
                "Kayla",
                "Charlotte");
    }

    public static String getMaleFirstName() {
        return males.get(getRandomNumberInts(0, males.size() - 1));
    }

    public static String getLastName() {
        return lastName.get(getRandomNumberInts(0, lastName.size() - 1));
    }

    public static String getFemaleFirstName() {
        return females.get(getRandomNumberInts(0, females.size() - 1));
    }

    public static int getRandomNumberInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, (max + 1)).findFirst().orElse(0);
    }
}