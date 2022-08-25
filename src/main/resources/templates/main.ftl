<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome page</title>
    <link rel="icon" href=
    "https://cdn-icons-png.flaticon.com/512/29/29302.png"
          type="image/x-icon">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css2?family=Aclonica&display=swap" rel="stylesheet">

    <link href="https://fonts.googleapis.com/css2?family=Playfair+Display:ital,wght@1,700&display=swap"
          rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@500&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Indie+Flower&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Caveat&display=swap" rel="stylesheet">
    <style>
        /*Подсветка активной вкладки меню*/
        .icon {
            background-color: white;
        }

        body {
            margin-left: 80px;
            margin-top: 10px;
            padding: 10px;

            background-image: url("https://i.postimg.cc/YSBrXFH4/abstract-blur-defocused-bookshelf-library.jpg");
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
            opacity: 0.8;
            font-family: 'Aclonica', sans-serif;
            font-size: 100px;
            text-align: center;
            margin-top: 3%;
            margin-bottom: 4%;
            margin-right: 2%;
            color: #330033;
            background-color: #f2f2f2;
            filter: alpha(Opacity=70);

            box-shadow: 0 0 3px 7px #f2f2f2;

        }


        .myName {
            filter: alpha(Opacity=70);
            margin-right: 3%;
            text-align: right;
            color: #1a001a;
            font-family: 'Dancing Script', cursive;
        }

        .school, .date {
            margin-right: 3%;
            filter: alpha(Opacity=70);
            text-align: right;
            font-family: 'Playfair Display', serif;
            color: #1a001a;
        }

        .quote {
            background-color: #f2f2f2;
            opacity: 0.8;
            padding: 5px;

            box-shadow: 0 0 3px 7px #f2f2f2;
        }

        .sign {
            background-color: #f2f2f2;
            opacity: 0.8;
            padding: 1px;

        }


        q {
            /*font-style: italic;*/
            text-align: center;
            color: black;
            font-size: 25px;
            font-family: 'Indie Flower', cursive;
        }

        .author {
            color: black;
            font-family: 'Caveat', cursive;
            font-size: 23px;
        }

        .contents {
            margin-top: 1%;
            text-align: center;
        }

        .mySlides {
            display: none;
            text-align: center;
        }

        /*Изображение курсора(рука)*/
        .cursor {
            cursor: pointer;
        }

        /*Следующие и предыдущие кнопки*/
        .prev, .next {
            cursor: pointer; /*устанавливаем курсор принаведении - рука*/
            position: absolute;
            margin-left: -33%;
            display: inline-block;
            margin-right: 10%;
            top: 10%;
            /*margin-left: -50px;*/
            margin-top: -50px;
            padding: 16px;
            color: #1a001a;
            font-weight: bold; /*полужирное начертание*/
            font-size: 20px;
            border-radius: 0 3px 3px 0;
            user-select: none;
            -webkit-user-select: none;
            text-decoration: none;
        }

        /*Ставим кнопку"next" справа*/
        .next {
            right: 70px;
            border-radius: 3px 0 0 3px;

        }

        /*Добавляем черный фон с прозрачностью при наведении*/
        .prev:hover, .next:hover {
            background-color: #f2f2f2;
        }

    </style>
</head>
<body>
<ul class="mainmenu">
    <li class="icon"><a href="http://localhost:8080/ui/main/" title="Main"><i class="fa fa-home"></i></a></li>
    <li><a href="http://localhost:8080/ui/books/" title="Books"><i class="fa fa-book"></i></a></li>
    <li><a href="http://localhost:8080/ui/readers/" title="Readers"><i class="fa fa-users"></i></a></li>
    <li><a href="http://localhost:8080/ui/lends/" title="Lends"><i class="fa fa-plus-square"></i></a></li>
    <li><a href="http://localhost:8080/ui/links/" title="Information"><i class="fa fa-info-circle" aria-hidden="true"></i></a></li>

</ul>

<div class="contents">
    <div class="mySlides">
        <span class="quote"><q>The only thing that you absolutely have to know, is the location of the library</q>
        <p class="author">- Albert Einstein -</p></span>
    </div>
    <div class="mySlides">
        <span class="quote"><q>Books may well be the only true magic</q>
        <p class="author">- Alice Hoffman -</p></span>
    </div>
    <div class="mySlides">
        <span class="quote"><q>Books are a uniquely portable magic</q>
        <p class="author">- Stephen King -</p></span>
    </div>
    <div class="mySlides">
        <span class="quote"><q>Books are mirrors: You only see in them what you already have inside you</q>
        <p class="author">- Carlos Ruiz Zafón -</p></span>
    </div>
    <div class="mySlides">
        <span class="quote"><q>If you don’t like to read, you haven’t found the right book</q>
        <p class="author">- J.K. Rowling -</p></span>
    </div>
    <div class="mySlides">
        <span class="quote"><q>Some books leave us free and some books make us free</q>
        <p class="author">- Ralph Waldo Emerson -</p></span>
    </div>
    <div class="mySlides">
        <span class="quote"><q>Once you learn to read, you will be forever free</q>
        <p class="author">- Frederick Douglass -</p></span>
    </div>


    <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
    <a class="next" onclick="plusSlides(1)">&#10095;</a>
</div>

<script>
    var slideIndex = 1;
    showSlides(slideIndex);

    //Следующий/предыдущий слайд
    function plusSlides(n) {
        showSlides(slideIndex += n);
    }

    function currentSlide(n) {
        showSlides(slideIndex = n);
    }

    function showSlides(n) {
        var i;
        var slides = document.getElementsByClassName("mySlides");
        var dots = document.getElementsByClassName("demo");
        var captionText = document.getElementById('caption');
        if (n > slides.length) {
            slideIndex = 1
        }
        if (n < 1) {
            slideIndex = slides.length
        }

        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }
        for (i = 0; i < dots.length; i++) {
            dots[i].className = dots[i].className.replace("active", "");
        }
        slides[slideIndex - 1].style.display = "block";
        dots[slideIndex - 1].className += "active";
        captionText.innerHTML = dots[slideIndex - 1].alt;
    }
</script>

<div class="title">
    Welcome to Midnight Library
</div>
<h2 class="date"><span class="sign">University of Economics and Management of Bratislava</span></h2>
<h2 class="school"><span class="sign">Summer School Final project</span></h2>

<h2 class="myName"><span class="sign">Made by Olena Lavro</span></h2>

<h2 class="date"><span class="sign">2022</span></h2>


</body>
</html>