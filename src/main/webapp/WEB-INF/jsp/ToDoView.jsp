
<head>
<style>
h1 {
  color: blue;
  font-family: verdana;
  font-size: 200%;
  background: orange;
}
p {
  color: red;
  font-family: courier;
  font-size: 160%;
}

div{

color: blue;
  font-family: courier;
  font-size: 100%;

}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #111;
}

.active {
  background-color: #04AA6D;
}
li {
  border-right: 1px solid #bbb;
}

li:last-child {
  border-right: none;
}
</style>
</head>
<h1>ToDo Application </h1><hr>

  <ul>
  <li><a href="/todo">Home</a></li>
  <li><a href="/todo">Add Todo</a></li>
  <li><a href="/viewALl">Todo List</a></li>
  <li style="float:right"><a class="active" href="#about">About</a></li>
</ul> 
<hr>
 <form action="/save" method="post" modelAttribute="todo">
<div>
  <h4>To Do List</h4>
  <input type="text" name = "title" id="myInput" placeholder="Title...">
  <input type="text" name = "msg" id="myInput" placeholder="Task Details..">
  <input type="text"  name = "status" id="myInput" placeholder="Status...">
  <!-- <span onclick="newElement()" class="addBtn">Add</span> -->
<button type="submit">Add</button>
</div>

<div><h5>Added To the List Task </h5>
    ${data}
</div>
</form>