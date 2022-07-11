<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section id="students">
    <div class="container">
        <div class="row">
            <div class="col-md-8">
                <!-- TODO Poner el style en un CSS y quitarle el margin-bottom al table -->
                <div class="card text-center text-white" style="background-color: #171717;">
                    <div class="card-header">
                        <h4>Students list</h4>
                    </div>
                    <table class="table table-dark table-striped table-hover table-borderless">
                        <thead class="thead-dark">
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Surname</th>
                                <th>Sex</th>
                                <th>Nationality</th>
                                <th>DNI</th>
                                <th>Birth</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="s" items="${stu}">
                                <tr>
                                    <td>${s.id}</td>
                                    <td>${s.name}</td>
                                    <td>${s.surname}</td>
                                    <td>${s.sex}</td>
                                    <td>${s.nationality}</td>
                                    <td>${s.dni}</td>
                                    <td>${s.birth}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
