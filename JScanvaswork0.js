let canvas;
let context;
let width;
let height;
let moveDown;
let moveLeft;
let moveRight;
let moveUp;

let person = {
    x : 340,
    y : 500,
    size: 15,
    moveUp : false,
    moveDown : false,
    moveLeft : false,
    moveRight : false,
}


document.addEventListener('DOMContentLoaded', init, false);

function init() {
    canvas = document.querySelector('canvas');
    context = canvas.getContext('2d');
    width = canvas.width;
    height = canvas.height;
    window.addEventListener('keydown', direction, false);
    window.setInterval(draw, 33);
}

function draw() {
    context.fillStyle = 'red';
    context.fillRect(person.x, person.y, person.size, person.size);


    if (moveLeft) {
        person.x -= 8;
    }
    if (moveRight) {
        person.x += 8;
    }
    if (moveUp) {
        person.y -= 8;
    }
    if (moveDown) {
        person.y += 8;
    }
    if (person.x > width || person.x < 0 || person.y < 0 || person.y > height) {
        location.reload();
    } 
    
}

function direction() {
    let keyCode = event.keyCode;
    if (keyCode === 37) {
        moveLeft = true;
        moveDown = false;
        moveRight = false;
        moveUp = false;
    } else if (keyCode === 39) {
        moveRight = true;
        moveDown = false;
        moveLeft = false;
        moveUp = false;
    } else if (keyCode === 38) {
        moveUp = true;
        moveDown = false;
        moveLeft = false;
        moveRight = false;
    } else if (keyCode === 40) {
        moveDown = true;
        moveLeft = false;
        moveRight = false;
        moveUp = false;
    }
}
