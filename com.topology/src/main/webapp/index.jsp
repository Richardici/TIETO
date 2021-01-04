<%@ include file="WEB-INF/views/include.jsp"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewreport" content="width=device-width, initial-scale=1.0">
	<title>
		Topology of routers
	</title>
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
	<link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet" />
	<link href="<c:url value="/web-resources/main.css" />" rel="stylesheet">
</head>
<body>
	<div class="container-fluid banner">
		<div class="row">
			<div class="col-md-12">
				<nav class="navbar navbar-md">
					<div class="navbar-brand">BASIC TOPOLOGY OF NETWORK</div>
				</nav>
			</div>
			
			<div class="inputForm">
		<form action = "show" method = "post" enctype = "multipart/form-data">
         <input type = "file" name = "uploadedFile" size = "50" />
         <br />
         <div class="col text-center">
         <input type = "submit" class="btn btn-outline-primary" style="margin-top: 30px;" value = "Make Topology" />
         </div>
      </form>
				</div>
			</div>
		</div>
	
</body>
</html>
