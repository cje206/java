function signupFunc() {
    var form = document.getElementById('signupForm');
    axios
        .post('/practice10/signup', {
            name: form.name.value,
            userId: form.userId.value,
            pw: form.pw.value,
        })
        .then((res) => alert(res.data));
}

function loginFunc() {
    var form = document.getElementById('loginForm');
    axios
        .get(
            `/practice10/login?userId=${form.userId.value}&pw=${form.pw.value}`
        )
        .then((res) => alert(res.data));
}

function editFunc() {
    var form = document.getElementById('loginForm');
    axios
        .patch('/practice10/user', {
            userId: form.userId.value,
            pw: form.pw.value,
        })
        .then((res) => alert(res.data));
}

function deleteFunc() {
    var form = document.getElementById('loginForm');
    axios
        .delete('/practice10/user', {
            data: { userId: form.userId.value, pw: form.pw.value },
        })
        .then((res) => alert(res.data));
}
