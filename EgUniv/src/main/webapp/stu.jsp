<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EgUniv - CRUD</title>
    </head>
    <body>
        <ul>
            <c:forEach var="s" items="${stu}">
                <li>${s.id} vs ${s.name} vs ${s.surname} vs ${s.sex} vs ${s.nationality} vs ${s.dni} vs ${s.birth}</li>
            </c:forEach>
        </ul>
    </body>
</html>
