PalindromeCheckerApp
====================

This repository contains two Java applications.

---

### 1. PalindromeCheckerApp

Benchmarks two palindrome-checking algorithms (iterative pointer-based and stack-based) and prints their execution times in nanoseconds.

**Run:**
```
javac PalindromeCheckerApp.java
java  PalindromeCheckerApp
```

---

### 2. ResumeTinder

A Tinder-style, swipe-based resume review tool for recruiters.  
Resume cards are shown one at a time; the recruiter types:

| Key | Action |
|-----|--------|
| `R` | Swipe **Right** — shortlist the candidate |
| `L` | Swipe **Left**  — pass on the candidate   |
| `Q` | Quit the session early                    |

At the end of the session a summary of shortlisted and passed candidates is displayed.

**Run:**
```
javac Resume.java ResumeTinder.java
java  ResumeTinder
```
