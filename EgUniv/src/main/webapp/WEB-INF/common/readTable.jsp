<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section id="students" class="d-flex flex-column min-vh-100 justify-content-center align-items-center">
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="card text-bg-dark">
                    <div class="card-header">
                        <h4 class="d-flex justify-content-between align-items-center">
                            Students list
                            <a href="#" class="btn btn-sm btn-primary" data-bs-toggle="modal" data-bs-target="#addStu"><i class="fa-solid fa-circle-plus"></i> Add student</a>
                        </h4>
                    </div>
                    <div class="table-responsive">
                        <table class="table table-dark table-hover table-no-margin-bottom">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Surname</th>
                                    <th scope="col">Sex</th>
                                    <th scope="col">Nationality</th>
                                    <th scope="col">DNI</th>
                                    <th scope="col">Birth</th>
                                    <th scope="col">Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="s" items="${stu}">
                                    <tr>
                                        <td scope="row">${s.id}</td>
                                        <td>${s.name}</td>
                                        <td>${s.surname}</td>
                                        <td>${s.sex}</td>
                                        <td>${s.nationality}</td>
                                        <td>${s.dni}</td>
                                        <td>${s.birth}</td>
                                        <td class="table-fit">
                                            <!-- TODO Editar cuando este terminado el editStu.jsp -->
                                            <a href="#" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#editStu"><i class="fas fa-edit"></i></a>
                                            <!-- TODO Editar cuando este terminado el suprStu.jsp -->
                                            <a href="#" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#suprStu"><i class="far fa-trash-alt"></i></a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="/WEB-INF/common/addStu.jsp"/>
