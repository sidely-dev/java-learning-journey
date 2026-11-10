# 🖥️ System Metrics Engine
### Phase 1 – Core System Engine (Beginner Milestone)

> A standalone Java utility that reads real-time system metrics (CPU, RAM, and processes) from the host computer and prints them to the terminal.

![Status](https://img.shields.io/badge/Status-Phase%201-blue?style=for-the-badge)
![Language](https://img.shields.io/badge/Language-Java%2017%2B-orange?style=for-the-badge)
![Library](https://img.shields.io/badge/Library-OSHI-yellow?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

---

## 📌 About This Phase

This is **Phase 1** of a larger system monitoring tool.

Before adding databases, networking, or a graphical interface, the application must first be able to reliably read system information from the operating system.

**Goal of Phase 1:**  
Build a simple Java program that continuously queries and displays:

- CPU usage
- Available / used RAM
- List of active processes

---

## 🎯 What You Will Build

A terminal-based Java application that:

- Uses the **OSHI** library to read native system information
- Refreshes metrics every few seconds using a polling loop
- Formats raw values into human-readable output (e.g. bytes → GB)
- Runs as a standalone utility

---

## 🛠️ Tech Stack

| Component          | Technology              | Purpose                              |
|--------------------|-------------------------|--------------------------------------|
| Language           | Java 17+                | Core application                     |
| System Info Library| OSHI                    | Read CPU, memory, processes          |
| Build Tool         | Maven or Gradle         | Dependency management                |
| Concurrency        | Java Threads / Loops    | Periodic data refresh                |
| Output             | Terminal (System.out)   | Display metrics                      |

> Note: This phase is intentionally **not** using Swing yet.  
> The focus is purely on getting reliable system data.

---

## 🧠 Skills You Will Build

- Adding third-party libraries with Maven or Gradle
- Using OSHI to access operating system information
- Creating simple polling loops with threads
- Formatting raw system data (bytes, percentages, time)
- Structuring a clean Java project

---

## 📂 Suggested Project Structure

```text
system-metrics-engine/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── metrics/
│                   ├── Main.java
│                   ├── SystemReader.java
│                   └── Formatter.java
│
├── pom.xml                  # or build.gradle
├── README.md
└── .gitignore
