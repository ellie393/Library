<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Useful links</title>
    <link rel="icon" href=
    "https://cdn-icons-png.flaticon.com/512/29/29302.png"
          type="image/x-icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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

        body {
            padding: 0;
            margin: 0;
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-color: #39004d;
            background-position: center;
            background-image: url("https://img.freepik.com/free-photo/wooden-table-with-blurred-background_1134-14.jpg?w=1060&t=st=1661453386~exp=1661453986~hmac=6f74c4d406ec3ab2d210f570aff382e895cf666798fb26a55addce66f5a46568");
        }

    </style>
</head>

<body>
<ul class="mainmenu">
    <li><a href="http://localhost:8080/ui/main/" title="Main"><i class="fa fa-home"></i></a></li>
    <li><a href="http://localhost:8080/ui/books/" title="Books"><i class="fa fa-book"></i></a></li>
    <li><a href="http://localhost:8080/ui/readers/" title="Readers"><i class="fa fa-users"></i></a></li>
    <li ><a href="http://localhost:8080/ui/lends/" title="Lends"><i class="fa fa-plus-square"></i></a></li>
    <li class="icon"><a href="http://localhost:8080/ui/links/" title="Information"><i class="fa fa-info-circle"
                                                                         aria-hidden="true"></i></a></li>

</ul>
</body>
</html>