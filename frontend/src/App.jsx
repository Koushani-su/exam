
import React, { useState } from "react";
import "./App.css";

// Question 1: Student Profile Component
function StudentProfile(props) {
  return (
    <div className="profile-card">
      <h2>Student Profile</h2>

      <img
        src={props.image}
        alt="Student Profile"
        className="profile-img"
      />

      <h3>{props.name}</h3>

      <p><b>Email:</b> {props.email}</p>
      <p><b>Course:</b> {props.course}</p>
    </div>
  );
}

// Question 2: Counter Application
function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div className="counter-card">
      <h2>Counter Application</h2>

      <h1 className="count">{count}</h1>

      <div className="counter-buttons">
        <button onClick={() => setCount(count + 1)}>
          Increment (+)
        </button>

        <button onClick={() => setCount(count - 1)}>
          Decrement (-)
        </button>

        <button onClick={() => setCount(0)}>
          Reset
        </button>
      </div>
    </div>
  );
}

// Main App Component
function App() {
  const [activePage, setActivePage] = useState("student");

  return (
    <div className="app-container">

      <h1 className="main-title">
        React Practical Applications
      </h1>

      {/* Two Navigation Buttons */}
      <div className="nav-buttons">
        <button
          className={activePage === "student" ? "active" : ""}
          onClick={() => setActivePage("student")}
        >
          Student Profile
        </button>

        <button
          className={activePage === "counter" ? "active" : ""}
          onClick={() => setActivePage("counter")}
        >
          Counter Application
        </button>
      </div>

      {/* Display Selected Component */}
      <div className="content">

        {activePage === "student" && (
          <StudentProfile
            name="Koushani Bera"
            email="koushani8170@gmail.com"
            course="Computer Science"
            image="https://i.pravatar.cc/200?img=47"
          />
        )}

        {activePage === "counter" && (
          <Counter />
        )}

      </div>

    </div>
  );
}

export default App;
