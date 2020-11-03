<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>showUser</title>
</head>
<body>
<h1>用户信息</h1>
<h3>请求参数：</h3>
<p>userId = <b>${userId!"null"}</b></p>
<h3>结果：</h3>
<p>msg = <b>${msg}</b></p>
<p>
  <#if user??>
  user.userId = <b>${user.userId}</b> <br/>
  user.username = <b>${user.username}</b> <br/>
  user.password = <b>${user.password}</b> <br/>
  user.age = <b>${user.age}</b> <br/>
  <#else >
  user = null
  </#if>
</p>

</body>

</html>