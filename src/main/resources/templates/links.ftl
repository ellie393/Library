<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Additional information</title>
    <link rel="icon" href=
    "https://cdn-icons-png.flaticon.com/512/29/29302.png"
          type="image/x-icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Playfair+Display:ital@1&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Aclonica&display=swap" rel="stylesheet">

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <style>

        .mainmenu {
            position: fixed;
            top: 50%;
            -webkit-transform: translateY(-50%);
            -ms-transform: translateY(-50%);
            transform: translateY(-50%);
            left: 0;
            padding-left: 0;

        }

        .mainmenu a {
            display: block;
            text-align: center;
            padding: 16px;
            transition: all 0.3s ease;
            color: #730099;
            font-size: 40px;

        }

        .mainmenu li:hover {
            background-color: #ce99ff;
        }

        /*Подсветка активной вкладки меню*/
        .icon {
            background-color: white;
        }

        body {
            margin-left: 80px;
            margin-top: 10px;
            padding: 10px;

        }

        body, .navbar {
            padding: 0;
            margin: 0;
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-color: #39004d;
            background-position: center;
            background-image: url("https://i.postimg.cc/ydQzzgwy/wooden-table-with-blurred-background.jpg");
        }

        .nav {
            display: inline;
            font-family: 'Playfair Display', serif;
            font-size: 35px;
            color: #330033;
            background-color: #f2f2f2;
        }

        .nav li:hover {
            background-color: #ce99ff;

        }

        .sections-body {
            margin-left: 100px;
            margin-top: 65px;
            padding: 0;
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-position: center;

        }

        .image {
            margin-left: 10%;
        }

        .sections-headers {
            opacity: 0.8;
            font-family: 'Aclonica', sans-serif;
            font-size: 55px;
            text-align: center;
            color: #330033;
            background-color: #f2f2f2;
            filter: alpha(Opacity=70);
            margin-right: 2%;
            margin-bottom: 2%;
            margin-top: 7%;

        }

        /* Section 2*/
        body {
            /*background: #262a2b;*/
        }

        .tilesWrap {
            padding: 0;
            margin: 50px auto;
            list-style: none;
            text-align: center;
        }

        .tilesWrap li {
            display: inline-block;
            width: 25%;
            min-width: 260px;
            max-width: 270px;
            padding: 80px 20px 40px;
            position: relative;
            vertical-align: top;
            margin: 10px;
            font-family: 'helvetica', sans-serif;
            min-height: 25vh;
            /*background: #262a2b;*/
            background: #13001a;
            border: 1px solid #252727;
            text-align: left;
        }

        .tilesWrap li h2 {
            font-size: 114px;
            margin: 0;
            position: absolute;
            opacity: 0.5;
            top: 50px;
            right: 10px;
            transition: all 0.3s ease-in-out;
        }

        .tilesWrap li h3 {
            font-size: 20px;
            color: #b7b7b7;


            margin-left: 0;
            margin-right: 8px;
            margin-bottom: 5px;
        }

        .tilesWrap li p {
            font-size: 16px;
            line-height: 18px;
            color: #b7b7b7;
            margin-top: 5px;
        }

        .tilesWrap li button {
            background: transparent;
            border: 1px solid #b7b7b7;
            padding: 10px 20px;
            color: #b7b7b7;
            border-radius: 3px;
            position: relative;
            transition: all 0.3s ease-in-out;
            transform: translateY(-40px);
            opacity: 0;
            cursor: pointer;
            overflow: hidden;
        }

        .tilesWrap li button:before {
            content: '';
            position: absolute;
            height: 100%;
            width: 120%;
            background: #b7b7b7;
            top: 0;
            opacity: 0;
            left: -140px;
            border-radius: 0 20px 20px 0;
            z-index: -1;
            transition: all 0.3s ease-in-out;

        }

        .tilesWrap li:hover button {
            transform: translateY(5px);
            opacity: 1;
        }

        .tilesWrap li button:hover {
            color: #262a2b;
        }

        .tilesWrap li button:hover:before {
            left: 0;
            opacity: 1;
        }

        .tilesWrap li:hover h2 {
            top: 0px;
            opacity: 0.6;
        }

        .tilesWrap li:before {
            content: '';
            position: absolute;
            top: -2px;
            left: -2px;
            right: -2px;
            bottom: -2px;
            z-index: -1;
            background: #fff;
            transform: skew(2deg, 2deg);
        }

        .tilesWrap li:after {
            content: '';
            position: absolute;
            width: 40%;
            height: 100%;
            left: 0;
            top: 0;
            background: rgba(255, 255, 255, 0.02);
        }

        .tilesWrap li:nth-child(1):before {
            background: #C9FFBF;
            background: -webkit-linear-gradient(to right, #FFAFBD, #C9FFBF);
            background: linear-gradient(to right, #FFAFBD, #C9FFBF);
        }

        .tilesWrap li:nth-child(2):before {
            background: #f2709c;
            background: -webkit-linear-gradient(to right, #ff9472, #f2709c);
            background: linear-gradient(to right, #ff9472, #f2709c);
        }

        .tilesWrap li:nth-child(3):before {
            background: #c21500;
            background: -webkit-linear-gradient(to right, #ffc500, #c21500);
            background: linear-gradient(to right, #ffc500, #c21500);
        }

        .tilesWrap li:nth-child(4):before {
            background: #FC354C;
            background: -webkit-linear-gradient(to right, #0ABFBC, #FC354C);
            background: linear-gradient(to right, #0ABFBC, #FC354C);
        }

    </style>
</head>

<#--<body>-->
<body data-spy="scroll" data-target=".navbar" data-offset="50">
<ul class="mainmenu">
    <li><a href="http://localhost:8080/ui/main/" title="Main"><i class="fa fa-home"></i></a></li>
    <li><a href="http://localhost:8080/ui/books/" title="Books"><i class="fa fa-book"></i></a></li>
    <li><a href="http://localhost:8080/ui/readers/" title="Readers"><i class="fa fa-users"></i></a></li>
    <li><a href="http://localhost:8080/ui/lends/" title="Lends"><i class="fa fa-plus-square"></i></a></li>
    <li class="icon"><a href="links.ftl" title="Information"><i class="fa fa-info-circle"
                                                                aria-hidden="true"></i></a></li>

</ul>


<!-- The navbar - The <a> elements are used to jump to a section in the scrollable area -->
<nav class="navbar navbar-inverse navbar-fixed-top">

    <ul class="nav navbar-nav">
        <li><a href="#section1">UML diagram</a></li>
        <li><a href="#section2">Used technologies</a></li>
        <#--        <li><a href="#section3">REST</a></li>-->
    </ul>
</nav>

<div class="sections-body">
    <!-- Section 1 -->
    <div id="section1">
        <h1 class="sections-headers">UML diagram</h1>
        <div class="image"><img
                    src='https://i.postimg.cc/k5KdHLpy/uml.png' border='0' alt='uml'/>
        </div>
    </div>
    <div id="section2">
        <h1 class="sections-headers">Used technologies</h1>

        <ul class="tilesWrap">
            <li>
                <h2>01</h2>

                <h3>Java 11</h3>

            </li>
            <li>
                <h2>02</h2>
                <h3>IntelliJ IDEA <br>Ultimate</h3>
            </li>
            <li>
                <h2>03</h2>
                <h3> JUnit 5</h3>

            </li>
            <li>
                <h2>04</h2>
                <h3>Maven</h3>
            </li>
        </ul>
        <ul class="tilesWrap">
            <li>
                <h2>05</h2>
                <h3> Spring Boot <br> 2.6 </h3>
            </li>
            <li>
                <h2>06</h2>
                <h3>N-tier <br> architecture </h3>
            </li>
            <li>
                <h2>07</h2>
                <h3>UML diagram </h3>

            </li>
            <li>
                <h2>08</h2>
                <h3>REST API </h3>
            </li>
        </ul>

        <ul class="tilesWrap">
            <li>
                <h2>09</h2>
                <h3>Java Servlet </h3>
            </li>
            <li>
                <h2>10</h2>
                <h3>Apache<br>Freemarker </h3>
            </li>
            <li>
                <h2>11</h2>
                <h3>Tomcat server <br> 9.0.65 </h3>

            </li>
            <li>
                <h2>12</h2>
                <h3>MongoDB </h3>
            </li>
        </ul>

        <ul class="tilesWrap">
            <li>
                <h2>13</h2>
                <h3>Mongo <br> Compass</h3>
            </li>
            <li>
                <h2>14</h2>
                <h3>ORM <br>MongoRepository </h3>
            </li>
            <li>
                <h2>15</h2>
                <h3>Postman </h3>

            </li>
            <li>
                <h2>16</h2>
                <h3>BootStrap <br> framework </h3>
            </li>
        </ul>

        <ul class="tilesWrap">
            <li>
                <h2>17</h2>
                <h3>WEB design:<br><br>- CSS <br>- JavaScript</h3>
            </li>
            <li>
                <h2>18</h2>
                <h3>VCS <br>GitHub <br><br><br></h3>
            </li>

        </ul>
    </div>
</div>
</body>
</html>

