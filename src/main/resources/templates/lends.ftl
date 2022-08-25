<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of lends</title>
    <link rel="icon" href=
    "https://cdn-icons-png.flaticon.com/512/29/29302.png"
          type="image/x-icon">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

    <link href="https://fonts.googleapis.com/css2?family=DynaPuff:wght@500&display=swap" rel="stylesheet">
    <style>
        body {
            padding: 0;
            margin: 0;
            background-image: url("https://i.postimg.cc/ydQzzgwy/wooden-table-with-blurred-background.jpg");
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-color: #dab3ff;
            background-position: center;
        }

        h1 {

            font-family: 'DynaPuff', cursive;
            color: #660066;
            font-size: 3em;
            text-align: center;
            /*float: center;*/
            margin-bottom: 30px;

        }

        a {
            text-decoration: none;
            color: #660066;
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

        /*Подсветка активной вкладки меню*/
        .icon {
            background-color: white;
        }

        body {
            margin-left: 80px;
            margin-top: 10px;
            padding: 10px;

        }

        table {
            background-color: #d7c1cc;
            opacity: 0.8;
            font-family: 'DynaPuff', cursive;
            font-size: medium;
        }


        th, td {
            border-bottom: 1px solid #ddd;
        }

        .icons {
            /*background-color: #dab3ff;*/
            color: #660066;
        }


    </style>
</head>
<body>
<ul class="mainmenu">
    <li><a href="http://localhost:8080/ui/main/" title="Main"><i class="fa fa-home"></i></a></li>
    <li><a href="http://localhost:8080/ui/books/" title="Books"><i class="fa fa-book"></i></a></li>
    <li><a href="http://localhost:8080/ui/readers/" title="Readers"><i class="fa fa-users"></i></a></li>
    <li class="icon"><a href="http://localhost:8080/ui/lends/" title="Lends"><i class="fa fa-plus-square"></i></a></li>
    <li><a href="http://localhost:8080/ui/links/" title="Information"><i class="fa fa-info-circle" aria-hidden="true"></i></a></li>

</ul>

<h1 class="display-4">List of our Magic Lends <a
            href="http://localhost:8080/ui/lends/add"><i class="fa fa-magic" aria-hidden="true"></i></a></h1>
<div class="table-center">
    <div>
        <table class="table table-hover">
            <thead>
            <#--            <th> ID</th>-->
            <th> Book</th>
            <th> Reader</th>
            <th> Issued Date</th>
            <th> Expected Return Date</th>
            <th> Amount Of Discount</th>
            <th> Actual Return Date</th>
            <#--            <th> Is Over Or Damaged</th>-->
            <th> Final Sum</th>
            <#--            <th></th>-->
            <#--            <th></th>-->
            </thead>
            <tbody
            <#list lends as lend >
                <tr>
                    <#--                    <td>${lend.id}</td>-->
                    <td>${lend.book}</td>
                    <td>${lend.reader}</td>
                    <td>${lend.issuedDate}</td>
                    <td>${lend.expectedReturnDate}</td>
                    <td>${lend.amountOfDiscount}</td>
                    <td>${lend.actualReturnDate}</td>
                    <#--                    <td>${lend.isOvertimedOrDamaged}</td>-->
                    <td>${lend.finalSum}</td>
                    <td><a class="icons" href="/ui/lends/delete/${lend.id}" title="Delete"><i
                                    class="fa fa-trash fa-2x"></i>
                        </a></td>
                    <td><a class="icons" href="/ui/lends/edit/${lend.id}" title="Edit">
                            <i class="fa fa-pencil fa-2x" aria-hidden="true"></i>
                        </a></td>
                </tr>
            </#list>
        </table>
    </div>
</div>

<#--<a href="http://localhost:8080/ui/books/add" class="create">CREATE</a>-->
</body>
</html>