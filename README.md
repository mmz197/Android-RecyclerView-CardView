# Android RecyclerView with CardView Project

This project demonstrates how to build a modern Android application using **RecyclerView** and **CardView** in Java. The app displays a scrollable list of movie cards using Material Design components, making the interface clean, responsive, and user-friendly.

The source code is organized properly so it can be used easily in both **Android Studio** and **online Android coding platforms** for assignment demonstrations, testing, and screenshots.

---

# Project Files Overview

### `[MainActivity.java]()`
  Handles the initialization of the RecyclerView, prepares the movie data list, and connects the adapter with the layout manager.

### `[Movie.java]()`
  A simple model class used to define movie objects and store item information.

### `[MovieAdapter.java]()`
  Works as the bridge between the dataset and RecyclerView. It uses the ViewHolder pattern for smooth scrolling and better performance.

### `[activity_main.xml]()`
  Main layout file that contains the RecyclerView component.

### `[item_card_layout.xml]()`
  Custom CardView layout used to design each movie item with rounded corners, spacing, and elevation effects.

### `[build.gradle]()`
  Contains all required dependencies and Gradle configurations for RecyclerView and CardView support.

---

# Android UI Components Used

## RecyclerView :
RecyclerView is used to efficiently display large lists by recycling item views. It improves app performance and provides smooth scrolling behavior.

## CardView :
CardView gives each list item a modern Material Design appearance using elevation, shadows, and rounded corners.

---

# Features Included

* RecyclerView implementation using Adapter and ViewHolder
* Modern CardView design with elevation and rounded corners
* Dynamic list rendering
* Smooth scrolling performance
* Toast click interaction support
* Clean Java-based Android architecture
* Beginner-friendly project structure

---

# How to Run the Project in Android Studio

1. Open Android Studio and create a new **Empty Views Activity** project.
2. Select **Java** as the project language.
3. Replace the default `MainActivity.java` with the provided source code.
4. Create the following additional Java files:

   * `Movie.java`
   * `MovieAdapter.java`
5. Open the `res/layout/` directory:

   * Replace `activity_main.xml`
   * Create `item_card_layout.xml`
6. Open app-level `build.gradle` and add these dependencies:

```gradle
implementation 'androidx.recyclerview:recyclerview:1.3.0'
implementation 'androidx.cardview:cardview:1.0.0'
```

7. Sync Gradle files and run the application.

---

# Running on Online Android Compilers

You can also test this project on browser-based Android environments or sandbox compilers.

### Steps:

1. Copy all Java source files into the online editor.
2. Add XML layout files in the layout section.
3. Ensure RecyclerView and CardView libraries are enabled if supported.
4. Run the project and capture screenshots for reports or assignments.

---

# Assignment Requirements Covered

* RecyclerView with Adapter implementation
* Proper ViewHolder usage
* CardView styling and layout design
* LayoutManager integration
* Dynamic item rendering
* User interaction using Toast messages

---

# Purpose of the Project

This project is designed for Android beginners who want to understand how RecyclerView and CardView work together to build modern list-based mobile applications efficiently.
