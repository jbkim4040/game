function test() {
    alert("테스트");
}


async function doGet() {
    var xhr = new XMLHttpRequest();

    xhr.open('GET', 'http://localhost:1001/get/test', true);
    xhr.send();

    xhr.onload = () => {
        debugger;

        return xhr;
    }
}


async function doPost() {
    var xhr = new XMLHttpRequest();

    xhr.open('POST', 'http://localhost:1001/post/test', true);
    xhr.send();

    xhr.onload = () => {
        debugger;
        alert(xhr.responseText);

        if(xhr.status == 200) {
        }else {
            alert("API 통신중 에러가 발생했습니다.");
        }
    }
}