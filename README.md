# Email Spam Detection System

A simple rule-based Java console program that classifies an email as spam or
not spam by checking its subject and message for common spam phrases.

## How it works

- You enter an email subject and message
- The text is converted to lowercase and checked against a list of spam phrases
  (e.g. "win money", "free prize", "lottery", "click here", "urgent")
- Each matching phrase adds one point to the spam score
- A score of **2 or more** is classified as **spam**

## Project structure

```
email-spam-detection/
├── src/
│   └── EmailSpamDetection.java
├── .gitignore
└── README.md
```

## Requirements

- Java Development Kit (JDK) 8 or newer

## Build and run

```bash
git clone https://github.com/<your-username>/email-spam-detection.git
cd email-spam-detection
javac -d out src/EmailSpamDetection.java
java -cp out EmailSpamDetection
```

## Example

```
================================
   EMAIL SPAM DETECTION SYSTEM
================================
Enter email subject: Congratulations! You have won
Enter email message: Click here to claim your reward

-------- RESULT --------
Warning: Spam Email Detected!
------------------------
```

## Limitations

This is a keyword-matching demo, not a production spam filter. It can miss
spam that uses different wording and may flag legitimate emails that happen to
contain two of the listed phrases.

## License

MIT
