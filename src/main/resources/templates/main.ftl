<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome page</title>
    <link rel = "icon" href =
    "https://cdn-icons-png.flaticon.com/512/29/29302.png"
          type = "image/x-icon">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css2?family=Aclonica&display=swap" rel="stylesheet">

    <link href="https://fonts.googleapis.com/css2?family=Playfair+Display:ital,wght@1,700&display=swap"
          rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@500&display=swap" rel="stylesheet">
    <style>
        /*Подсветка активной вкладки меню*/
        .icon {
            background-color: white;
        }

        body {
            margin-left: 80px;
            margin-top: 10px;
            padding: 10px;


            /*padding: 0;*/
            /*margin: 0;*/
            /*background-image: url(main/library.jpg);*/
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-color: #dab3ff;
            background-position: center;
        }

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


        .title {
            font-family: 'Aclonica', sans-serif;
            color: #660066;
            font-size: 100px;
            text-align: center;
            margin-top: 10%;
            margin-bottom: 5%;
        }

        .myName  {
            margin-right: 3%;
            text-align: right;
            color: #1a001a;
            font-family: 'Dancing Script', cursive;
        }
        .school, .date {
            margin-right: 3%;

            text-align: right;
            font-family: 'Playfair Display', serif;
            color: #1a001a;
        }

    </style>
</head>
<body>
<ul class="mainmenu">
    <li class="icon"><a href="http://localhost:8080/ui/main/" title="Main"><i class="fa fa-home"></i></a></li>
    <li><a href="http://localhost:8080/ui/books/" title="Books"><i class="fa fa-book"></i></a></li>
    <li><a href="http://localhost:8080/ui/readers/" title="Readers"><i class="fa fa-users"></i></a></li>
    <li><a href="http://localhost:8080/ui/lends/" title="Lends"><i class="fa fa-plus-square"></i></a></li>
</ul>
<div class="title">
    Welcome to Magic Library
</div>
<h2 class="school">Summer School Final project</h2>
<h2 class="myName">Made by Olena Lavro</h2>
<h2 class="date">2022</h2>


</body>
</html>