<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div class="container px-5 my-5">
    <form id="contactForm" data-sb-form-api-token="API_TOKEN" name="book" action="" method="POST">
        <div class="mb-3">
            <label class="form-label" for="title">Title</label>
            <input class="form-control" id="title" type="text" placeholder="Title" data-sb-validations="required"/>
            <div class="invalid-feedback" data-sb-feedback="title:required">Title is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="author">Author</label>
            <input class="form-control" id="author" type="text" placeholder="Author" data-sb-validations="required"/>
            <div class="invalid-feedback" data-sb-feedback="author:required">Author is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="deposit">Deposit</label>
            <input class="form-control" id="deposit" type="text" placeholder="Deposit" data-sb-validations="required"/>
            <div class="invalid-feedback" data-sb-feedback="deposit:required">Deposit is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="price">Price</label>
            <input class="form-control" id="price" type="text" placeholder="Price" data-sb-validations="required"/>
            <div class="invalid-feedback" data-sb-feedback="price:required">Price is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="genre">Genre</label>
            <select class="form-select" id="genre" aria-label="Genre">
                <option value="Fantasy">Fantasy</option>
                <option value="Science Fiction">Science Fiction</option>
                <option value="Dystopian">Dystopian</option>
                <option value="Action and Adventure">Action and Adventure</option>
                <option value="Mystery">Mystery</option>
                <option value="Horror">Horror</option>
                <option value="Thriller and Suspense">Thriller and Suspense</option>
                <option value="Historical Fiction">Historical Fiction</option>
                <option value="Romance">Romance</option>
                <option value="Contemporary Fiction">Contemporary Fiction</option>
                <option value="Literary Fiction">Literary Fiction</option>
                <option value="Magical Realism">Magical Realism</option>
                <option value="Graphic Novel">Graphic Novel</option>
                <option value="Short Story">Short Story</option>
                <option value="Biography">Biography</option>
                <option value="Self help">Self help</option>
                <option value="History">History</option>
                <option value="Travel">Travel</option>
                <option value="True Crime">True Crime</option>
                <option value="Humor">Humor</option>
                <option value="Essays">Essays</option>
                <option value="Religion">Religion</option>
                <option value="Science">Science</option>
            </select>
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
            <button class="btn btn-primary btn-lg disabled" id="submitButton" type="submit" value="Create"> Submit</button>
        </div>
    </form>
</div>
<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>