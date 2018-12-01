 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1"/>
<title>Common bootstrap to be included in web pages</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<style type="text/css">
.container
{
background-color:olive;
}
.container-fluid
{
background-color:fuchsia;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-success navbar-light">
<a class="navbar-brand" href="#"><img src="C:\Users\DELL\Desktop\Home.jpg" width="25" height="25"></a>
<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="collapsibleNavbar">
<ul class="navbar-nav">
<li class="nav-item">
<font color="white">
<span class="glyphicon glyphicon-home"></span>
</font>
<a class="nav-link" href="#">Home</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">Login</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">Register</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">About Us</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">Contact Us</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">SiteMap</a>
</li>
</ul>
</div>
</nav>
<div class="container">
<h4>container</h4>
<div id="ecommCarousel" class="carousel slide" data-ride="carousel">
<ol class="carousel-indicators">
<li data-target="#ecommCarousel" data-slide-to="0" class="active"></li>
<li data-target="#ecommCarousel" data-slide-to="1"></li>
<li data-target="#ecommCarousel" data-slide-to="2"></li>
</ol>
<div class="carousel-inner">
<div class="item active">
<img src="carousel1.png" alt="first carousel" style="width:100%;">
</div>
<div class="item">
<img src="carousel2.png" alt="second carousel" style="width:100%;">
</div>
<div class="item">
<img src="carousel3.png" alt="third carousel" style="width:100%;">
</div>
</div>
<a class="left carousel-control" href="#ecommCarousel" data-slide="prev">
<span class="glyphicon glyphicon-chevron-left"></span>
<span class="sr-only">Previous</span>
</a>
<a class="right carousel-control" href="#ecommCarousel" data-slide="next">
<span class="glyphicon glyphicon-chevron-right"></span>
<span class="sr-only">Next</span>
</a>
</div>
</div>
<div class="container-fluid">
<h4>container-fluid</h4>
</div>
</body>
</html>