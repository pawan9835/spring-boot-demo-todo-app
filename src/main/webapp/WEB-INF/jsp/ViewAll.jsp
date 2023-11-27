<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <li><a href="/viewAllList">Todo List</a></li>
  <li style="float:right"><a class="active" href="#about">About</a></li>
</ul> 
<hr>

<div><h5>Total ToDo List</h5>
  <%--   ${todoList} --%>
</div>

<div>
<form>

            <table class="table table-bordered">
            	<tr>
            		<th>Id</th>
            		<th>Title</th>
            		<th>Date</th>
            		<th>Details</th>
            		<th>Status</th>
            	</tr>

            	<c:forEach var="todo" items="${todoList}">
                    <tr>
                    ====
                		<td>${todo.todoId} ________  </td>
                		
                		<td>${todo.title} ________  </td>
                		
                		<td>${todo.date} ________   </td>
                		
                		<td>${todo.msg} ________  </td>
                		
                		
                		<td>${todo.status} ________</td>
                		
                		<td><button type="button" class="btn btn-success">
                		    <a href="/#update/${todo.todoId}">Mark Complete</a>
                		</button></td>
                		<td><button type="button" class="btn btn-primary">
                		    <a href="/#editToDoItem/${todo.todoId}">Edit</a>
                		</button></td>
                		<td><button type="button" class="btn btn-danger">
                			<a href="/#deleteToDoItem/${todo.todoId}">Delete</a>
                		</button></td>
                	</tr>

            	</c:forEach>

            </table>

        </form>

        <button type="button" class="btn btn-primary btn-block">
        	<a href="/todo">Add New ToDo Item</a>
        </button>

    </div>