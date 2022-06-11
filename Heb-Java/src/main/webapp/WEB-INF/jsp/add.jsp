<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>addJsp</title>
  </head>
  <body>
    <h1>商品の追加</h1>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
	<form action="inputItem" method="post">
	  <div class="form-group">
	    <label for="itemName">商品名</label>
	    <input type="text" class="form-control"  placeholder="商品名" name="itemName" required="required">
	</div>
  	
  	<div class="form-group">
	    <label for="itemPrice">価格</label>
	    <input type="number" class="form-control"  placeholder="100" name="itemPrice" min="1" required="required">
	</div>
  	
  	<button type="submit" class="btn btn-primary">商品を登録</button>
</form>
  </body>
</html>