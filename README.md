# Medical Decision Support System

## Overview
This project is an AI-powered platform designed to assist in medical decision-making by suggesting diagnoses based on patient-reported symptoms and medical records. It features a secure login system with three user roles: **patient**, **doctor**, and **admin**. Patients can input symptoms, while doctors validate or adjust AI-generated diagnosis suggestions after reviewing uploaded medical analyses. The system combines artificial intelligence with human expertise to ensure accurate and reliable medical decisions.

## Features
- **Symptom Reporting**: Patients can log symptoms with details like severity and duration.
- **AI Diagnosis Suggestions**: AI analyzes symptoms and medical records to propose potential diagnoses.
- **Doctor Validation**: Doctors review and approve/reject AI suggestions, ensuring accuracy with mandatory analysis uploads.
- **Role-Based Access**: Secure authentication for patients, doctors, and admins.
- **Medical Records Management**: Stores and processes patient analyses and consultation history.

## Technologies Used
- **Backend**:
  - **Java Spring** (with Maven): For building a RESTful API.
  - **PostgreSQL**: Relational database for storing user data, symptoms, diagnoses, and medical records.
- **Frontend**:
  - **React**: For user-friendly interface (planned implementation).
- **AI**:
  - **Python**: For developing machine learning models to generate diagnosis suggestions (planned implementation).

