# Blood Test Scheduler Application

A Java-based application for efficiently managing and scheduling blood tests in healthcare settings. This system uses priority-based scheduling to ensure patients are seen according to urgency, hospital status, and age considerations.
Developed as part of [BSHCIFSC2 2025 DSA CA, NSI].
## Features

### Priority-Based Scheduling
Automatically prioritizes patients based on:
- **Hospital ward status** (inpatients receive higher priority)
- **Medical urgency** (urgent, medium, low)
- **Age** (older patients prioritized within the same category)

### Patient Management
- Register new patients with their details
- Track all registered patients
- Search for patients by name

### Appointment Handling
- Schedule the next highest-priority patient
- Mark patients as no-shows
- View the highest priority patient in the queue

### No-Show Tracking
- Keep record of patients who miss appointments (limited to last 5)
- Reference no-show history for administrative purposes

### User-Friendly Interface
- Intuitive GUI for healthcare staff
- Separate panels for different patient lists
- Quick-access buttons for common operations

---

## System Architecture

The application implements various **Abstract Data Types (ADTs)** to efficiently manage patient data:

- **Priority Queue**: For ordered scheduling based on medical need
- **Queue**: For tracking no-shows in FIFO order
- **List**: For general patient record management

---

## Screenshots
<img width="744" alt="image" src="https://github.com/user-attachments/assets/ff7094e6-54fa-4ea1-84ea-b7c44e1b949e" />


---

## Requirements

- **Java JDK 8 or higher**
- **Swing GUI library** (included in JDK)

---

## Installation

### Clone this repository:
```sh
[git clone ] (https://github.com/Mosafridi/Bloodtestscheduler.git)

