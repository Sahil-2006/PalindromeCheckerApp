/**
 * ==============================================================
 * Resume — data model for ResumeTinder
 * ==============================================================
 * Holds the key details shown to a recruiter when swiping.
 */
public class Resume {

    private final String candidateName;
    private final String role;
    private final int yearsOfExperience;
    private final String skills;
    private final String summary;

    public Resume(String candidateName, String role, int yearsOfExperience,
                  String skills, String summary) {
        this.candidateName   = candidateName;
        this.role            = role;
        this.yearsOfExperience = yearsOfExperience;
        this.skills          = skills;
        this.summary         = summary;
    }

    public String getCandidateName()    { return candidateName; }
    public String getRole()             { return role; }
    public int    getYearsOfExperience(){ return yearsOfExperience; }
    public String getSkills()           { return skills; }
    public String getSummary()          { return summary; }

    /** Maximum characters per summary line inside the card. */
    private static final int DISPLAY_WIDTH = 41;

    /** Pretty-prints the resume card shown during swiping. */
    public void display() {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.printf( "│  Candidate : %-27s│%n", candidateName);
        System.out.printf( "│  Role      : %-27s│%n", role);
        System.out.printf( "│  Experience: %-2d year(s)                  │%n", yearsOfExperience);
        System.out.printf( "│  Skills    : %-27s│%n", skills);
        System.out.println("│  Summary   :                             │");
        // wrap summary lines to DISPLAY_WIDTH chars
        String[] words = summary.split(" ");
        StringBuilder line = new StringBuilder();
        for (String word : words) {
            if (line.length() + word.length() + 1 > DISPLAY_WIDTH) {
                System.out.printf("│  %-" + DISPLAY_WIDTH + "s│%n", line.toString().trim());
                line = new StringBuilder();
            }
            line.append(word).append(" ");
        }
        if (line.length() > 0) {
            System.out.printf("│  %-" + DISPLAY_WIDTH + "s│%n", line.toString().trim());
        }
        System.out.println("└─────────────────────────────────────────┘");
    }
}
