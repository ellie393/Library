<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Add new Reader</title>
    <link rel = "icon" href =
    "https://cdn-icons-png.flaticon.com/512/29/29302.png"
          type = "image/x-icon">
    <link href="https://fonts.googleapis.com/css2?family=DynaPuff:wght@500&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">


    <style>
        body {
            margin-left: 30%;
            margin-top: 10px;
            margin-right: 30%;
            padding: 10px;
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-color: #dab3ff;
            background-position: center;
        }


        * {
            box-sizing: border-box;
        }

        input[type=text], select, textarea {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
            resize: vertical;
        }

        label {
            padding: 12px 12px 12px 0;
            display: inline-block;
        }

        input[type=submit] {
            background-color: #04AA6D;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            float: right;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }

        .container {
            background-color: #ce99ff;
            border-radius: 5px;
            padding: 20px;
            font-family: 'DynaPuff', cursive;
            font-size: medium;
        }

        .col-25 {
            float: right;
            text-align: -moz-center;
            width: 20%;
            margin-top: 6px;
            margin-left: 25px;
        }

        .col-75 {
            float: left;
            width: 75%;
            margin-top: 6px;
            font-family: 'DynaPuff', cursive;
            font-size: medium;

        }


        h1 {
            font-family: 'Gloria Hallelujah', cursive;
            color: #660066;
            font-size: 3em;
            text-align: center;
            /*float: center;*/
            margin-bottom: 30px;
            background-color: #cccccc;
            height: 60px;


        }

        a {
            width: 30%;
            float: left;
            margin-left: 3%;

            /*size: 25px;*/
        }

        /* Clear floats after the columns */
        .row:after {
            content: "";
            display: table;
            clear: both;
        }

        i {
            color: #330033;
            text-align: left;
            background-color: #ce99ff;
        }

        .glyphicon {
            margin-right: 3%;

        }
        .d-grid {
            height: 30px;
        }


    </style>
</head>

<body>

<h1>Adding new Magic Reader</h1>

<div class="container">
    <form name="book" action="" method="POST">
        <div class="row">
            <div class="col-25">
                <label for="lfirstname">First name</label>
            </div>
            <div class="col-75">
                <@spring.formInput "form.firstName" "" "text"/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label for="lmname">Middle name</label>
            </div>
            <div class="col-75">
                <@spring.formInput "form.middleName" "" "text"/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label for="llname">Last name</label>
            </div>
            <div class="col-75">
                <@spring.formInput "form.lastName" "" "text"/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label for="ltypes">Type of discount</label>
            </div>
            <div class="col-75">
                <@spring.formSingleSelect "form.types" types ""/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label for="laddress">Address</label>
            </div>
            <div class="col-75">
                <@spring.formInput "form.address" "" "text"/>
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="ltelephone">Telephone Number</label>
            </div>
            <div class="col-75">
                <@spring.formInput "form.telephoneNumber" "" "text"/>
            </div>
        </div>




        <hr>

        <div class="d-grid gap-2 d-md-block">
            <a href="http://localhost:8080/ui/readers/"><i class="fa fa-chevron-circle-left fa-2x" aria-hidden="true"></i></a>
            <button class="glyphicon glyphicon-floppy-disk" type="submit" id="submitButton" value="Create" style="float: right;">Save</button>
        </div>
    </form>
</div>

<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>