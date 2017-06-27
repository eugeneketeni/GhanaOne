

<c:if test="${message}">
	<b>Thanks for registering</b>
	<br />
	<br />
</c:if>
<form action="registerUser" method=get>
	<div class="container">

		<B>THANKS FOR JOINING US</B> <br> <br> <br> <br> <br>
		<label><b>UserId</b></label> <input type="text"
			placeholder="Enter UserId" name="UserID" required> <br>
		<br> <label><b>Email</b></label> <input type="text"
			placeholder="Enter Email" name="email" required> <br> <br>

		<label><b>First Name</b></label> <input type="firstname"
			placeholder="Enter First Name" name="firstname" required> <br>
		<br> <label><b>Last Name</b></label> <input type="lastname"
			placeholder="Enter Last Name" name="lastname" required> <br>
		<br> <label><b>Password</b></label> <input type="password"
			placeholder="Enter Password" name="password" required> <br>
		<br>

		<div class="clearfix">

			<button type="submit" class="signupbtn">Sign Up</button>
		</div>
	</div>
</form>