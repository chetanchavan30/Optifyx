<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Details</title>
<style>
.container {
	max-width: 600px;
	margin: 50px auto;
	padding: 20px;
	border: 1px solid #ddd;
	border-radius: 10px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	font-family: Arial, sans-serif;
}

.container h1 {
	text-align: center;
}

.user-details {
	margin-top: 20px;
}

.user-details p {
	font-size: 1.2rem;
	line-height: 1.5;
}

.link-button {
	display: inline-block;
	margin: 0.5rem;
	padding: 0.75rem 1.5rem;
	font-size: 1rem;
	color: white;
	background-color: #4CAF50;
	text-decoration: none;
	border-radius: 5px;
	transition: background-color 0.3s;
}

.link-button:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<div class="container">
		<h1>User Details</h1>
		<div class="user-details">
			<p>
				<strong>ID:</strong> ${user.uId}
			</p>
			<p>
				<strong>First Name:</strong> ${user.firstName}
			</p>
			<p>
				<strong>Last Name:</strong> ${user.lastName}
			</p>
			<p>
				<strong>Number:</strong> ${user.number}
			</p>
			<p>
				<strong>User Name:</strong> ${user.userName}
			</p>
			<p>
				<strong>Email:</strong> ${user.email}
			</p>
			<p>
				<strong>Marks:</strong> ${user.marks}
			</p>

		</div>
		<a href="logout" class="link-button">logout</a> <a href="exam.jsp"
			class="link-button">Start Exam</a>
	</div>
</body>
</html>
