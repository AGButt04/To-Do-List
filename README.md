# ✅ Java To-Do List Application

A desktop task management application built with Java Swing, demonstrating Object-Oriented Programming and GUI development skills. Users can manage tasks through a simple list interface with add, edit, delete, and completion functionality.

## 🎯 What I Built
- **Task Management**: Add, edit, remove, and mark tasks as complete
- **Priority Levels**: Assign priority levels (high, medium, low) to tasks
- **Swing GUI**: Desktop interface using JList and button controls
- **Interactive Design**: Dialog-based input and list selection

## ✨ Key Features
- ➕ **Add Tasks**: Create tasks with a name and priority using dialog prompts
- ✏️ **Edit Tasks**: Modify task name, priority, or completion status
- ✅ **Mark Complete**: Set tasks as done with visual status update
- 🗑️ **Remove Tasks**: Delete selected tasks from the list
- 🎨 **Styled Interface**: Custom fonts and color scheme (green/dark gray theme)
- 📋 **Pre-loaded Examples**: Starts with sample tasks to demonstrate functionality

## 🏗️ Project Architecture
```
src/
├── TaskList.java      # Main GUI class with event handling and interface
├── Task.java          # Task model class (name, priority, status)
└── README.md          # Project documentation
```

### Core Components
- **`TaskList.java`**: Main application with Swing GUI, JList display, and button event handlers
- **`Task.java`**: Simple task object with name, priority, and completion status properties

## 🔧 Implementation Details
- **JList Interface**: Displays tasks in a scrollable list format
- **Dialog Input**: Uses JOptionPane for user input (add/edit operations)
- **Event Handling**: ActionListener implementation for button interactions
- **Custom Styling**: Green/dark gray color theme with custom fonts

## 🚀 Getting Started
```bash
# Clone the repository
git clone https://github.com/AGButt04/To-Do-List.git

# Navigate to project directory
cd To-Do-List

# Compile the Java files
javac *.java

# Run the application
java TaskList
```

**IDE Setup:**
1. Import the project into your preferred Java IDE (IntelliJ IDEA, Eclipse, VS Code)
2. Ensure JDK 8+ is configured
3. Run `TaskList.java` as the main class

## 🔧 Technologies & Concepts
- **Java SE** - Core programming language
- **Swing GUI** - Desktop user interface framework
- **OOP Principles** - Encapsulation, abstraction, and clean class design
- **Event-Driven Programming** - Button clicks and user interaction handling
- **Data Structures** - ArrayList for dynamic task storage

## 📖 Learning Outcomes
This project demonstrates:
- **Java Swing Development**: Creating functional desktop GUIs with JList, JButton, and JPanel
- **Event-Driven Programming**: Implementing ActionListeners for user interactions
- **Object-Oriented Design**: Using separate classes for data (Task) and interface (TaskList)
- **User Input Handling**: Dialog-based input collection and validation
- **List Management**: Adding, removing, and updating elements in DefaultListModel

---
**Part of my programming portfolio** | [Github](https://github.com/AGButt04) | [Github](https://www.linkedin.com/in/abdul-ghani-butt-290056338/)
Open the project in your Java IDE (Eclipse, IntelliJ IDEA, NetBeans).

Compile and run TaskList.java.
