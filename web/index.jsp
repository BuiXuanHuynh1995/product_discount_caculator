<html>
<head>
  <title>Calculator</title>
  <style>
    head{
      display: none;
    }
    body{
      display: block;
      margin: 8px;sfsdfsdf
    }
    #content{
      width: 450px;
      margin: 0 auto;
      padding: 0px 20px 20px;
      background: white;
      border: 2px solid navy;
    }
    form{
      display: block;
      margin-top: 0em;
      margin-block-end: 1em;
    }
    div{
      display: block;
    }
    label{
      width: 10em;
      padding-right: 1em;
      float: left;
      cursor: default
    }
    #data input{
      float: left;
      width: 15em;
      margin-bottom: .5em;
    }
  </style>
</head>
<body>
<div id="content">
  <h1>Product Discount Calculator</h1>
  <form method="post" action="/caculator">
    <div id="data">
      <label>Product Description:</label>
      <input type="text" name="product_description"><br>
      <label>List Price:</label>
      <input type="text" name="list_price"><br>
      <label>Discount Percent:</label>
      <input type="text" name="discount_percent"><br>
    </div>
    <div id="buttons">
      <label>&nbsp;</label>
      <input type="submit" value="Calculate Discount">
    </div>
  </form>
</div>

</body>
</html>
