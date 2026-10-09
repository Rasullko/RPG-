Console RPG Battle Simulator 

A turn-based Java console RPG where custom or pre-made fighters battle it out in real-time. Built with clean OOP principles and JSON data persistence.

Features

- Fighter Customization: Create your own custom fighter or pick from pre-existing ones.
- Detailed Stats System:
  - HP: Determines how much damage a fighter can take.
  - Strength: Powers up attack damage.
  - Defense: Reduces incoming damage.
  - Speed: Grants the first-strike advantage and affects the dodge chance.
  - Luck: Influences both the dodge chance and critical hit chance.
- Real-Time Turn-Based Combat:** Watch the battle unfold step-by-step in your terminal with built-in time delays so you can follow the action seamlessly.
- JSON Persistence: Fighter profiles are saved locally using Jackson's `ObjectMapper`, meaning your characters and progress persist even after restarting the application.

Tech Stack

- Java (Core OOP, Collections, Exception Handling)
- Jackson Library (for JSON data serialization & deserialization)
- Java Concurrency (Thread.sleep for combat pacing)

How to Run

1. Clone or download the repository to your local machine.
2. Open the project in your favorite Java IDE (such as IntelliJ IDEA or VS Code).
3. Ensure you have the Jackson dependency added (if managing via Maven/Gradle) or included in your classpath.
4. Simply locate and run the Main class.
