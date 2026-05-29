# Android RecyclerView with CardView Project

This directory contains the accurate source files for the RecyclerView and CardView android assignment project.
You can easily utilize this source code in your local Android Studio workspace or copy it into online android compilers or sandbox engines for verification and report screenshots.

## Project Structure
- [MainActivity.java]() : Handles initialization of RecyclerView container, layouts, and data.
- [FoodItem.java]() : Represents the Model schema representing item schemas.
- [FoodAdapter.java]() : Adapter which connects list datasets to CardView components.
- [activity_main.xml]() : Layout housing the RecyclerView node.
- [item_card_layout.xml]() : Layout design containing the CardView structure.
- [build.gradle]() : Configured build structure with complete dependencies included.

## Core Android UI Components Applied
1. **RecyclerView**: Used to render scrolled lists optimally using the ViewHolder pattern, recycling visual cells to preserve smartphone CPU & RAM resources.
2. **CardView**: Placed inside lists to highlight individual item structures styled with Elevation boundaries, smooth Rounded corners, and deep shadows, giving material-design standard hierarchy.

## How to Import & Run this Project

### Standard Android Studio Setup
1. Launch Android Studio -> **New Project** -> Select **Empty Views Activity**.
2. Name your project `com.example.recyclerviewcardview` and select **Java** as the primary language.
3. Replace your `MainActivity.java` content with the supplied code.
4. Create three new files under the same package identifier:
   - `FoodItem.java`
   - `FoodAdapter.java`
5. Open your `res/layout/` folder:
   - Replace `activity_main.xml` with the supplied design code.
   - Create a new Layout file named `item_card_layout.xml` and paste the card markup.
6. Open your app-level `build.gradle` and confirm you have mapped the latest libraries:
   - `implementation 'androidx.recyclerview:recyclerview:1.3.0'`
   - `implementation 'androidx.cardview:cardview:1.0.0'`
7. Click **Sync Project with Gradle Files** and click **Run**.

### Online Compilers Instructions
If testing on compiler environments (like Jdoodle Android, PlayCode, or similar sandboxes):
1. Copy the Java classes sequentially (`MainActivity.java`, `FoodItem.java`, `FoodAdapter.java`).
2. Make sure you include the class wrappers or adjust imports based on the sandbox requirements.
3. Use this interactive visualizer simulator right here in our web-workspace to preview layout configurations and easily capture screenshots!

## Assignment Documentation Deliverables Checked
- [x] Correct Adapter implementation using ViewHolder subclass.
- [x] CardView usage highlighting Elevation & Comer-radius attributes.
- [x] Accurate RecyclerView attachment with dynamic linear/grid LayoutManager configurations.
- [x] Interactive action response (onClick listener -> visual custom details popup / dynamic system Toast messages).
