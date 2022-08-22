<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of books</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<div class="table-center">
    <div class="table-center" style="width: 80%; display: flex; align-content: center">
        <table class="table table-dark table-striped">
            <thead>
            <th> ID</th>
            <th> Title</th>
            <th> Author</th>
            <th> Deposit</th>
            <th> Price</th>
            <th> Genre</th>
            <th></th>
            <th></th>
            </thead>
            <tbody
            <#list books as book >
                <tr>
                    <td>${book.bookID}</td>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.collateralValue}</td>
                    <td>${book.rentalPrice}</td>
                    <td>${book.genres}</td>
                    <td>
                        <button type="button" class="btn btn-danger">Delete</button>
                    </td>
                    <td>
                        <button type="button" class="btn btn-info">Edit</button>
                    </td>
                </tr>
            </#list>


        </table>
    </div>
</div>

<a href="http://localhost:8080/ui/books/add">CREATE</a>
</body>
</html>