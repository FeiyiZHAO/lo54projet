<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Registre</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="CSS.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
 
 
<body>
	<br>
	<br>
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
			<div class="panel panel-info">
				<div class="panel-heading">
					<h3 class="text-center">Sign Up</h3>
				</div>
				<div class="panel-heading">
					<h4 class="text-center">Selected session is </h4>
					<h4 class="text-center"> ${sessionId}</h4>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" role="form" action="CheckRegister.jsp" accept-charset="UTF-8" method="post" οnsubmit="return validate()">
						<input name="utf8" type="hidden" value="&#x2713;" />
						<input type="hidden" name="authenticity_token" value="cFE0MDKxyoAORTDnrgojEr0WGEMN3S9VYjEFJC10zUOgvHCCWlC1e6BcV7c0p7u/Zgjp8vHqYdDiXenxRJWiIw==" />
 
						<div class="form-group">
							<label class="col-sm-3 control-label" for="client_lastname">Last Name</label>
							<div class="col-sm-9">
								<div class="input-group">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-user"></span>
									</div>
									<input class="form-control" placeholder="Enter your lastname" type="text" name="firstname" maxlength="16" οnfοcus="if(this.value == 'Enter your lastname') this.value =''" />
								</div>
							</div>
						</div>
 
						<div class="form-group">
							<label class="col-sm-3 control-label" for="client_firstname">First Name</label>
							<div class="col-sm-9">
								<div class="input-group">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-user"></span>
									</div>
									<input class="form-control" placeholder="Enter your firstname" type="text" name="lastname" maxlength="16" οnfοcus="if(this.value == 'Enter your firstname') this.value =''" />
								</div>
							</div>
						</div>
 
						<div class="form-group">
							<label class="col-sm-3 control-label" for="client_phone">Phone</label>
							<div class="col-sm-9">
								<div class="input-group">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-earphone"></span>
									</div>
									<input class="form-control" placeholder="Enter your phone number" type="text" name="phone" maxlength="20" οnfοcus="if(this.value == 'Enter your phone number') this.value =''">
								</div>
							</div>
						</div>
 
						<div class="form-group">
							<label class="col-sm-3 control-label" for="client_address">Address</label>
							<div class="col-sm-9">
								<div class="input-group">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-map-marker"></span>
									</div>
									<input class="form-control" placeholder="Enter your address" type="text" name="address" maxlength="20" οnfοcus="if(this.value == 'Enter your address') this.value =''">
								</div>
							</div>
						</div>
 
						<div class="form-group">
							<label class="col-sm-3 control-label" for="client_email">Email</label>
							<div class="col-sm-9">
								<div class="input-group">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-envelope"></span>
									</div>
									<input class="form-control" placeholder="Enter your email" type="text" name="email" maxlength="20" οnfοcus="if(this.value == 'Enter your email') this.value =''">
								</div>
							</div>
						</div>
 
						<a class="btn btn-default btn-block" href="/">Sign Up</a>
						<a class="btn btn-default btn-block" href="/">Cancel</a>
 
					</form>
				</div>
			</div>
		</div>
 
	</div>
 
</body>
</html>
