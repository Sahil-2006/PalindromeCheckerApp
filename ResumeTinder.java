import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ==============================================================
 * ResumeTinder — swipe-based resume review (like Tinder)
 * ==============================================================
 * Presents resume cards one at a time.
 * The recruiter types:
 *   R  → swipe right  (shortlist the candidate)
 *   L  → swipe left   (pass on the candidate)
 *   Q  → quit early
 *
 * At the end a summary of shortlisted candidates is displayed.
 */
public class ResumeTinder {

    public static void main(String[] args) {
        List<Resume> resumes = buildSampleResumes();

        List<String> shortlisted = new ArrayList<>();
        List<String> passed      = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("  Welcome to ResumeTinder — swipe your way to the perfect hire!");
        System.out.println("============================================================");
        System.out.println("  R = Swipe Right (shortlist)   L = Swipe Left (pass)   Q = Quit");
        System.out.println("------------------------------------------------------------\n");

        swipeLoop:
        for (int i = 0; i < resumes.size(); i++) {
            Resume resume = resumes.get(i);
            System.out.printf("Resume %d / %d%n", i + 1, resumes.size());
            resume.display();
            System.out.print("Your swipe (R / L / Q): ");

            String input = scanner.nextLine().trim().toUpperCase();

            switch (input) {
                case "R":
                    shortlisted.add(resume.getCandidateName());
                    System.out.println("  ✔  Shortlisted: " + resume.getCandidateName() + "\n");
                    break;
                case "L":
                    passed.add(resume.getCandidateName());
                    System.out.println("  ✘  Passed: " + resume.getCandidateName() + "\n");
                    break;
                case "Q":
                    System.out.println("  Quitting early...\n");
                    break swipeLoop;
                default:
                    System.out.println("  Unknown input — treating as pass.\n");
                    passed.add(resume.getCandidateName());
            }
        }

        scanner.close();
        printSummary(shortlisted, passed);
    }

    // ---------------------------------------------------------------
    // Helper: print the end-of-session summary
    // ---------------------------------------------------------------
    private static void printSummary(List<String> shortlisted, List<String> passed) {
        System.out.println("============================================================");
        System.out.println("  Session Summary");
        System.out.println("============================================================");
        System.out.println("  Shortlisted (" + shortlisted.size() + "):");
        if (shortlisted.isEmpty()) {
            System.out.println("    (none)");
        } else {
            for (String name : shortlisted) {
                System.out.println("    • " + name);
            }
        }
        System.out.println("  Passed (" + passed.size() + "):");
        if (passed.isEmpty()) {
            System.out.println("    (none)");
        } else {
            for (String name : passed) {
                System.out.println("    • " + name);
            }
        }
        System.out.println("============================================================");
    }

    // ---------------------------------------------------------------
    // Sample resume data
    // ---------------------------------------------------------------
    private static List<Resume> buildSampleResumes() {
        List<Resume> list = new ArrayList<>();

        list.add(new Resume(
            "Alice Johnson",
            "Software Engineer",
            4,
            "Java, Spring Boot, SQL",
            "Backend developer with 4 years building scalable REST APIs and microservices."
        ));

        list.add(new Resume(
            "Bob Martinez",
            "Frontend Developer",
            2,
            "React, TypeScript, CSS",
            "Passionate UI developer focused on accessible and responsive web experiences."
        ));

        list.add(new Resume(
            "Carol Lee",
            "Data Scientist",
            6,
            "Python, TensorFlow, R",
            "ML practitioner with expertise in NLP and time-series forecasting models."
        ));

        list.add(new Resume(
            "David Kim",
            "DevOps Engineer",
            3,
            "Docker, Kubernetes, AWS",
            "Cloud-native engineer skilled in CI/CD pipelines and infrastructure as code."
        ));

        list.add(new Resume(
            "Eva Patel",
            "Product Manager",
            5,
            "Agile, JIRA, Roadmapping",
            "Experienced PM who has shipped multiple B2B SaaS products from 0 to 1."
        ));

        return list;
    }
}
