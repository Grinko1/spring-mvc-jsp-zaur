<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<body  style="background:black;color:white">
<h2>Enter details info</h2>

<form:form action="show" modelAttribute="employee" method="get">

Name <form:input path="name"/>
<form:errors path="name"/>
<br/>
Surname <form:input path="surname"/>
<form:errors path="surname"/>
<br/>
Phone <form:input path="phone"/>
<form:errors path="phone"/>
<br/>
Email <form:input path="email"/>
<form:errors path="email"/>
<br/>
Salary <form:input path="salary"/>
<form:errors path="salary"/>
<br/>
Department <form:select path="department">
<form:options items="${employee.departments}"/>
<form:option value="dep1" label="dep1"/>
<form:option value="dep2" label="dep2"/>
<form:option value="dep3" label="dep3"/>

</form:select>
<br/>
Which car do you want?
BMW<form:radiobutton path="carBrand" value="BMW"/>
Audi<form:radiobutton path="carBrand" value="Audi"/>
Mercedes<form:radiobutton path="carBrand" value="Mercedes"/>
<br/>
Foreign language(S)
EN<form:checkbox path="languages" value="English" />
FR<form:checkbox path="languages" value="French" />
DE<form:checkbox path="languages" value="Deutch" />
<br/>
<input type="submit"/>
</form:form>
</body>
</html>
