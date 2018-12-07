 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1"/>
<title>NIIT ECOMMERCE</title>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" />
    
<style type="text/css">
   .navbar.navbar-inverse {
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
          <a class="navbar-brand" href="home.html">McNiels <span class="glyphicon glyphicon-headphones"></span></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
          <ul class="nav navbar-nav">
            <li class="active"><a href="home.html">Home <span class="glyphicon glyphicon-home"></span></a>
            </li>
            <li><a href="news.html">News<span class="glyphicon glyphicon-bell"></span> </a>
            </li>
            <li><a href="music.html">Music <span class="glyphicon glyphicon-music"></span></a>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
            </li>
            <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
      </ol>

      <!-- Wrapper for slides -->
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img src="http://placehold.it/2500x750/f00" alt="David Guetta">
        </div>

        <div class="item">
          <img src="http://placehold.it/2500x750/000" alt="Zedd">
        </div>

        <div class="item">
          <img src="http://placehold.it/2500x750/ff0" alt="Steve Aoki">
        </div>

        <div class="item">
          <img src="http://placehold.it/2500x750/444" alt="Hardwell">
        </div>
      </div>

      <!-- Left and right controls -->
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>



    <img id="avicii" class="img-responsive" src="http://placehold.it/2500x750/666" alt="" />
    <img id="martin" class="img-responsive" src="http://placehold.it/2500x750/444" alt="" />
    <img id="david" class="img-responsive" src="http://placehold.it/2500x750/000" alt="" />
    <img id="zedd" class="img-responsive" src="http://placehold.it/2500x750/f00" alt="" />

</body>
</html>