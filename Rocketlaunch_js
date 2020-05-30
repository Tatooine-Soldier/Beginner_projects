let canvas;
let context;
let width;
let height;
let moveDown;
let moveLeft;
let moveRight;
let moveUp;
let changel;
let greend;
let yellow;
let red;
let ps = [];

let person = {
    x : 310,
    y : 435,
    size: 80,
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
    window.setInterval(draw, 100);

}

function draw() {
    
    context.clearRect(0,0,width,height);
    context.fillStyle = 'red';
    context.fillRect(person.x, person.y, person.size, person.size);

    let rocket = document.getElementById("nasa");
    context.drawImage(rocket, person.x, person.y, person.size, person.size);
    

    // if (moveLeft) {
    //     person.x -= 5;
    //     }
    //     //objects.x = Math.floor(Math.random() * 551);
    //     //objects.y = Math.floor(Math.random() * 301);
    // if (moveRight) {
    //     person.x += 5;
    //     }
        //objects.x = Math.floor(Math.random() * 551);
        //objects.y = Math.floor(Math.random() * 301);
 
    if (moveUp) {
        person.y -= 10;
        window.addEventListener('keypress', rain, false);
    }
    
    
    
    // if (moveDown) {
    //     person.y += 10;
    // }
    // if (changel) {
    //     context.clearRect(0,0,width,height);
    //     context.fillStyle = 'blue';
    //     context.fillRect(person.x, person.y, person.size, person.size);   
    // }
    // if (greend) {
    //     context.clearRect(0,0,width,height);
    //     context.fillStyle = 'green';
    //     context.fillRect(person.x, person.y, person.size, person.size);
    // }
    // if (yellow) {
    //     context.clearRect(0,0,width,height);
    //     context.fillStyle = 'yellow';
    //     context.fillRect(person.x, person.y, person.size, person.size);
    // }
    // if (red) {
    //     context.clearRect(0,0,width,height);
    //     context.fillStyle = 'red';
    //     context.fillRect(person.x, person.y, person.size, person.size);
    // }
    // if (changezuko) {
    //     context.clearRect(aang,0,0,width,height);
    //     let zuko = document.getElementById("firelord");
    //     context.drawImage(zuko, person.x, person.y, person.size+20, person.size+20);
    // }
    if (person.x > width || person.x < 0 || person.y < -45 || person.y > height) {
        location.reload();
    } 
    
    // if (moveLeft) {
    //     person.x -= 5;
    //     }
 
    // if (moveRight) {
    //     person.x += 5;
    //     }
    
}

function direction() {
    //let counter = 0;
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
    } else if (keyCode === 13) {
        moveDown = false;
        moveLeft = false;
        moveRight = false;
        moveUp = false;
        changel = true;
        yellow = false;
        greend = false;
        red = false
    } else if (keyCode === 76) {
        moveDown = false;
        moveLeft = false;
        moveRight = false;
        moveUp = false;
        greend = true;
        yellow = false;
        changel = false;
        red = false;
    } else if (keyCode === 89) {
        moveDown = false;
        moveLeft = false;
        moveRight = false;
        moveUp = false;
        yellow = true;
        changel = false;
        greend = false;
        red = false;
    } else if (keyCode === 82) {
        moveDown = false;
        moveLeft = false;
        moveRight = false;
        moveUp = false;
        yellow = false;
        changel = false;
        greend = false;
        red = true;
    } else if (keyCode === 90) {
        moveDown = false;
        moveLeft = false;
        moveRight = false;
        moveUp = false;
        yellow = false;
        changel = false;
        greend = false;
        red = false;
        changezuko = true;
    }
    //window.setInterval(rain, 100);

}
function rain(event) {
    if (ps.length < 80) {
        let p = {
            x : person.x+20, 
            y : person.y+60,
            size : 30,
            xChange : Math.floor(Math.random() * person.x) && -Math.floor(Math.random() * person.x),
            yChange : Math.floor(Math.random() * 400) 
        };
        ps.push(p);
    }
    window.addEventListener('keydown', direction, false);
    context.fillStyle = 'yellow';
    for (let p of ps) {
        context.fillRect(p.x, p.y, p.size, p.size);
    }
    for (let p of ps) {
        p.x = p.x + p.xChange;
        p.y = p.y + p.yChange;
        if (p.x <= -p.size) {
            p.x = width;
        } 
    }
}
