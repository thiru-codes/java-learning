# Hands-on: Interfaces

1. **Media Player**

   **Goal:** Understand interface declaration, interface inheritance, and implementation of multiple interfaces.

   **Task:**
   - Create an interface `Metadata` with a method to display metadata.
   - Create an interface `Playable` that extends `Metadata`, with methods to start and stop playback.
   - Create another interface `Chartable` with a method to display chart information.
   - Create a `Music` class that implements both `Playable` and `Chartable`.
   - Create `Video` and `Podcast` classes that implement `Playable`.
   - Implement the required methods in each class using the `@Override` annotation.
   - Demonstrate the interface implementations by creating and using the respective objects.

   **File:** `MediaPlayer.java`