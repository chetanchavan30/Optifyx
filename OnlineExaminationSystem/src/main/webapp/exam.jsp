<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Examination System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 50%;
            margin: 50px auto;
            background: #fff;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .question {
            margin-bottom: 20px;
        }
        .question h3 {
            margin: 0 0 10px 0;
        }
        .btn-submit {
            display: block;
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
        .btn-submit:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Online Examination System</h1>

        <form action="submitAnswers" method="post">
            <div class="question">
                <h3>1. What is the default value of an int in Java?</h3>
                <label><input type="radio" name="q1" value="0" required> 0</label><br>
                <label><input type="radio" name="q1" value="1"> 1</label><br>
                <label><input type="radio" name="q1" value="null"> null</label><br>
                <label><input type="radio" name="q1" value="undefined"> undefined</label>
            </div>

            <div class="question">
                <h3>2. Which of these is not a keyword in Java?</h3>
                <label><input type="radio" name="q2" value="static" required> static</label><br>
                <label><input type="radio" name="q2" value="boolean"> boolean</label><br>
                <label><input type="radio" name="q2" value="void"> void</label><br>
                <label><input type="radio" name="q2" value="main"> main</label>
            </div>

            <div class="question">
                <h3>3. What is the size of a char in Java?</h3>
                <label><input type="radio" name="q3" value="1 byte" required> 1 byte</label><br>
                <label><input type="radio" name="q3" value="2 bytes"> 2 bytes</label><br>
                <label><input type="radio" name="q3" value="4 bytes"> 4 bytes</label><br>
                <label><input type="radio" name="q3" value="8 bytes"> 8 bytes</label>
            </div>

            <div class="question">
                <h3>4. Which method is called to start a thread in Java?</h3>
                <label><input type="radio" name="q4" value="run()" required> run()</label><br>
                <label><input type="radio" name="q4" value="start()"> start()</label><br>
                <label><input type="radio" name="q4" value="begin()"> begin()</label><br>
                <label><input type="radio" name="q4" value="init()"> init()</label>
            </div>

            <div class="question">
                <h3>5. Which of the following is a marker interface?</h3>
                <label><input type="radio" name="q5" value="Serializable" required> Serializable</label><br>
                <label><input type="radio" name="q5" value="Cloneable"> Cloneable</label><br>
                <label><input type="radio" name="q5" value="Runnable"> Runnable</label><br>
                <label><input type="radio" name="q5" value="None of the above"> None of the above</label>
            </div>

            <div class="question">
                <h3>6. Which exception is thrown when an array is accessed with an invalid index?</h3>
                <label><input type="radio" name="q6" value="ArrayIndexOutOfBoundsException" required> ArrayIndexOutOfBoundsException</label><br>
                <label><input type="radio" name="q6" value="NullPointerException"> NullPointerException</label><br>
                <label><input type="radio" name="q6" value="NumberFormatException"> NumberFormatException</label><br>
                <label><input type="radio" name="q6" value="ClassCastException"> ClassCastException</label>
            </div>

            <div class="question">
                <h3>7. What is the superclass of all classes in Java?</h3>
                <label><input type="radio" name="q7" value="Object" required> Object</label><br>
                <label><input type="radio" name="q7" value="Class"> Class</label><br>
                <label><input type="radio" name="q7" value="Interface"> Interface</label><br>
                <label><input type="radio" name="q7" value="None of the above"> None of the above</label>
            </div>

            <div class="question">
                <h3>8. Which of the following is used to handle exceptions in Java?</h3>
                <label><input type="radio" name="q8" value="try-catch" required> try-catch</label><br>
                <label><input type="radio" name="q8" value="if-else"> if-else</label><br>
                <label><input type="radio" name="q8" value="switch-case"> switch-case</label><br>
                <label><input type="radio" name="q8" value="None of the above"> None of the above</label>
            </div>

            <div class="question">
                <h3>9. Which of the following is a valid constructor declaration in Java?</h3>
                <label><input type="radio" name="q9" value="public MyClass()" required> public MyClass()</label><br>
                <label><input type="radio" name="q9" value="MyClass() void"> MyClass() void</label><br>
                <label><input type="radio" name="q9" value="void MyClass()"> void MyClass()</label><br>
                <label><input type="radio" name="q9" value="None of the above"> None of the above</label>
            </div>

            <div class="question">
                <h3>10. What is the purpose of the `final` keyword in Java?</h3>
                <label><input type="radio" name="q10" value="To prevent inheritance" required> To prevent inheritance</label><br>
                <label><input type="radio" name="q10" value="To create constant variables"> To create constant variables</label><br>
                <label><input type="radio" name="q10" value="Both of the above"> Both of the above</label><br>
                <label><input type="radio" name="q10" value="None of the above"> None of the above</label>
            </div>

            <input type="submit" class="btn-submit" value="Submit Answers">
        </form>
    </div>
</body>
</html>
