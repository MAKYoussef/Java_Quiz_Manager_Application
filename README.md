# Java\_Quiz\_Manager\_Application

A console-based educational application developed in Java for creating, managing, and taking multiple-choice quizzes (QCMs). It features separate interfaces for Teachers (quiz creation, results visualization) and Students (taking quizzes, score review, and correction consultation).







\# 📚 Java Quiz Manager Application



This project is a console-based \*\*Quiz Manager\*\* application developed in Java. It is designed for \*\*educational use\*\* to manage the creation, administration, and completion of multiple-choice quizzes (QCMs) in various academic modules. The application provides distinct functionalities for two main user roles: \*\*Teachers\*\* and \*\*Students\*\*.



\## ✨ Core Functionalities



\### For Teachers 🧑‍🏫



Teachers can manage quizzes and analyze student performance:



\* \*\*Quiz Management:\*\* Create, modify, and delete quizzes with multiple questions and options.

\* \*\*Quiz Visualization:\*\* Display the content of any existing quiz.

\* \*\*Results Visualization:\*\* View the scores obtained by students for a given quiz.

\* \*\*Performance Analysis:\*\* View the success rate (correct/false answer rate) for each question to identify complex concepts.



\### For Students 🧑‍🎓



Students can test their knowledge and track their results:



\* \*\*Quiz Access:\*\* Identify themselves and view available quizzes.

\* \*\*Quiz Taking:\*\* Answer a quiz only once and immediately receive their score upon completion.

\* \*\*Score Consultation:\*\* Review a list of scores for all quizzes they have completed.

\* \*\*Correction Review:\*\* Consult the correct answers for a quiz after they have submitted their response.



\## 💻 Project Structure



The application uses \*\*Object-Oriented Programming (OOP)\*\* principles in Java, structured around the following classes:



| Class Name | Description | Key Responsibilities |

| :--- | :--- | :--- |

| \*\*`Utilisateur`\*\* | Abstract Parent Class for `Enseignant` and `Etudiant`. | Stores common attributes: last name, first name, and ID. |

| \*\*`Enseignant`\*\* | Teacher Role. | Manages quiz creation, modification, deletion, and results viewing. |

| \*\*`Etudiant`\*\* | Student Role. | Takes quizzes, reviews scores, and consults corrections. |

| \*\*`Quiz`\*\* | Quiz Definition. | Stores the quiz theme, author, and a list of questions. Includes a method to calculate a student's score. |

| \*\*`Question`\*\* | Question Structure. | Stores the question number, text, and a list of answer options. |

| \*\*`Option`\*\* | Answer Choice. | Stores the option text and a boolean flag indicating if it is correct. |

| \*\*`ResultatQuiz`\*\* | Student Performance Record. | Stores the quiz, the score obtained, and the student's specific answers. |

| \*\*`Gestionnaire`\*\* | Application Manager. | Manages lists of Teachers, Students, and Quizzes. Implemented using the \*\*Singleton Pattern\*\*. |



\## 🚀 Getting Started



\### Prerequisites



\* Java Development Kit (JDK) 8 or newer.



\### Running the Application



1\.  \*\*Clone the repository.\*\*

2\.  \*\*Compile the Java files\*\* (if not using an IDE like IntelliJ or Eclipse).

3\.  \*\*Run the main class\*\* to start the application's console interface.

