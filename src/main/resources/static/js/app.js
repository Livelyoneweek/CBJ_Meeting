$(document).ready(function () {
    // HTML 문서를 로드할 때마다 실행합니다.
    connect();

})

var stompClient = null;

function connect() {
    var socket = new SockJS('/cbj-main');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/message', function (message) {
            showMessage(JSON.parse(message.body));
        });
    });
}

function sendMessage() {
    stompClient.send("/app/message", {}, JSON.stringify({'content': $("#message").val().trim(),
        'username': $("#header-title-login-user").text().trim()}));
}

function showMessage(message) {
    // $("#chatting-table").append("<tr><th>" + message + "</th></tr>");
    $("#chatting-box").append(message.username+": "+message.content + "<br/>");
}
