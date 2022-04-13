public class Main
{

    public static void main(String[] args)
    {
        guessing();
    }

    public static void guessing()
    {
        int guess = 0;
        int weapon = 1;
        int location = 1;
        int name = 1;
        int wrong = 5;
        AssistantJack jack = new AssistantJack(3);

        while (wrong != 0) {
            Theory theory = new Theory(weapon, location, name);
            wrong = jack.checkAnswer(theory);
            if (wrong == 1) {
                weapon++;
            }
            else if (wrong == 2) {
                location++;
            }
            else if (wrong == 3) {
                name++;
            }
            System.out.println("Guess: " + guess + " " + theory.toString());
            guess++;
        }
    }
}

