<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <style>
        body {
            margin-left: 80px;
            margin-top: 10px;
            padding: 10px;
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-color: #dab3ff;
            background-position: center;
        }


        .container {
            width: fit-content;
            background-color: #ce99ff;
            align-content: center;
            position: center;

        }

        select, .mb-3 {
            /*width: 50%;*/
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
            resize: vertical;

        }

        .submit {
            background-color: #04AA6D;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            float: right;
        }

        .submit:hover {
            background-color: #45a049;
        }
    </style>
</head>

<body>
<div class="container">
    <form id="contactForm" data-sb-form-api-token="API_TOKEN" name="book" action="" method="POST">
        <div class="mb-3">
            Id:<@spring.formInput "form.bookID" "" "text"/>
        </div>
        <div class="mb-3">
            Title:<@spring.formInput "form.title" "" "text"/>
        </div>
        <div class="mb-3">
            Author:<@spring.formInput "form.author" "" "text"/>
        </div>
        <div class="mb-3">
            Deposit:<@spring.formInput "form.collateralValue" "" "text"/>
        </div>
        <div class="mb-3">
            Price:<@spring.formInput "form.rentalPrice" "" "text"/>
        </div>
        <div class="mb-3">
            Genre:<@spring.formSingleSelect "form.genres" genres ""/>
            <#--            <select class="form-select" id="genre" aria-label="Genre">-->
            <#--                &lt;#&ndash;<#list readertypes ></#list>&ndash;&gt;-->
            <#--                <option value=>Fantasy</option>-->
            <#--                <option value="Science Fiction">Science Fiction</option>-->
            <#--                <option value="Dystopian">Dystopian</option>-->
            <#--                <option value="Action and Adventure">Action and Adventure</option>-->
            <#--                <option value="Mystery">Mystery</option>-->
            <#--                <option value="Horror">Horror</option>-->
            <#--                <option value="Thriller and Suspense">Thriller and Suspense</option>-->
            <#--                <option value="Historical Fiction">Historical Fiction</option>-->
            <#--                <option value="Romance">Romance</option>-->
            <#--                <option value="Contemporary Fiction">Contemporary Fiction</option>-->
            <#--                <option value="Literary Fiction">Literary Fiction</option>-->
            <#--                <option value="Magical Realism">Magical Realism</option>-->
            <#--                <option value="Graphic Novel">Graphic Novel</option>-->
            <#--                <option value="Short Story">Short Story</option>-->
            <#--                <option value="Biography">Biography</option>-->
            <#--                <option value="Self help">Self help</option>-->
            <#--                <option value="History">History</option>-->
            <#--                <option value="Travel">Travel</option>-->
            <#--                <option value="True Crime">True Crime</option>-->
            <#--                <option value="Humor">Humor</option>-->
            <#--                <option value="Essays">Essays</option>-->
            <#--                <option value="Religion">Religion</option>-->
            <#--                <option value="Science">Science</option>-->
            <#--            </select>-->
        </div>
        <div class="d-none" id="submitSuccessMessage">
            <div class="text-center mb-3">
                <div class="fw-bolder">Form submission successful!</div>
            </div>
        </div>
        <div class="d-none" id="submitErrorMessage">
            <div class="text-center text-danger mb-3">Error sending message!</div>
        </div>
        <div class="d-grid">
            <button class="submit" id="submitButton" type="submit" value="Save">Save</button>
        </div>
    </form>
</div>
<button class="back"><a href="http://localhost:8080/ui/books/">Back</a></button>
<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>