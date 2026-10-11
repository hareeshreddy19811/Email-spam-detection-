import java.util.Scanner;

/**
 * Email Spam Detection System
 *
 * A simple rule-based console program that classifies an email as spam
 * if its subject and message contain two or more known spam phrases.
 */
public class EmailSpamDetection {

    private static final String[] SPAM_WORDS = {
        "win money",
        "free prize",
        "lottery",
        "claim your reward",
        "click here",
        "urgent",
        "congratulations",
        "cash prize",
        "limited offer",
        "send password",
        "you have won",
        "earn money"
    };

    // An email is flagged as spam when it matches at least this many phrases
    private static final int SPAM_THRESHOLD = 2;

    public static String detectSpam(String email) {
        String message = email.toLowerCase();

        int spamScore = 0;
        for (String word : SPAM_WORDS) {
            if (message.contains(word)) {
                spamScore++;
            }
        }

        return spamScore >= SPAM_THRESHOLD ? "SPAM EMAIL" : "NOT SPAM EMAIL";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   EMAIL SPAM DETECTION SYSTEM");
        System.out.println("================================");

        System.out.print("Enter email subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter email message: ");
        String message = sc.nextLine();

        String email = subject + " " + message;
        String result = detectSpam(email);

        System.out.println("\n-------- RESULT --------");

        if (result.equals("SPAM EMAIL")) {
            System.out.println("Warning: Spam Email Detected!");
        } else {
            System.out.println("Email classified as Not Spam.");
        }

        System.out.println("------------------------");

        sc.close();
    }
}
