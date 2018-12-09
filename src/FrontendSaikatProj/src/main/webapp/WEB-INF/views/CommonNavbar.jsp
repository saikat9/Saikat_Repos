<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1"/>
<title>NIIT ECOMMERCE</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
.navbar.navbar-inverse
{
 margin-bottom: 0;
}
</style>
</head>
<body>
    <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
          <ul class="nav navbar-nav">
            <li class="active"><a href = "http://localhost:8090/FrontendSaikatProj/">Home <span class="glyphicon glyphicon-home"></span></a>
            </li>
            <li><a href="<c:url value="/aboutus"/>">About Us </a>
            </li>
            <li><a href="<c:url value="/contactus"/>">Contact Us</a>
            </li>
            <li>
            <a href="http://localhost:8090/FrontendSaikatProj/">SiteMap</a>
            </li>
            <li>
            <a href="<c:url value="/listcategories"/>">Category</a>
             </li>
            <li >
            <a href="<c:url value="/listproducts"/>">Product</a>
            </li>
            <li >
            <a href="<c:url value="/showproductimage"/>">ProductImage</a>
            </li>            
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="http://localhost:8090/FrontendSaikatProj/"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
            </li>
            <li><a href="http://localhost:8090/FrontendSaikatProj/"><span class="glyphicon glyphicon-log-in"></span> Login</a>
            </li>
            
            <li><a href="http://localhost:8090/FrontendSaikatProj/"><span class="glyphicon glyphicon-registration-mark"></span> Register</a>
            </li>            
          </ul>
        </div>
      </div>
    </nav>
</body>
</html>