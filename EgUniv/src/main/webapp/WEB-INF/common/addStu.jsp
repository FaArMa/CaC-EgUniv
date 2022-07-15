<div class="modal fade" id="addStu" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header text-bg-dark">
                <h5 class="modal-title" id="staticBackdropLabel">Add student</h5>
                <button type="button" class="btn-close btn-close-white" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="${pageContext.request.contextPath}/ServletCtrl?action=insert" method="POST" class="was-validated">
                <div class="modal-body text-bg-dark">
                    <div class="form-group">
                        <label for="name">Name</label>
                        <input type="text" maxlength="20" class="form-control text-bg-dark" name="name" required="">
                    </div>
                    <div class="form-group">
                        <label for="surname">Surname</label>
                        <input type="text" maxlength="20" class="form-control text-bg-dark" name="surname" required="">
                    </div>
                    <div class="form-group">
                        <label for="sex">Sex</label>
                        <input type="text" maxlength="1" placeholder="M or F" pattern="[MF]" class="form-control text-bg-dark" name="sex" required="">
                    </div>
                    <div class="form-group">
                        <label for="nationality">Nationality</label>
                        <input type="text" maxlength="40" class="form-control text-bg-dark" name="nationality" required="">
                    </div>
                    <div class="form-group">
                        <label for="dni">DNI</label>
                        <input type="number" min="10000000" max="99999999" class="form-control text-bg-dark" name="dni" required="">
                    </div>
                    <div class="form-group">
                        <label for="birth">Birth</label>
                        <input type="date" class="form-control text-bg-dark" name="birth" required="">
                    </div>
                </div>
                <div class="modal-footer text-bg-dark">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
        </div>
    </div>
</div>
