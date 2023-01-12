const canvas = document.querySelector("canvas");
const c = canvas.getContext("2d");

canvas.width = 1024;
canvas.height = 576;


c.fillRect(0,0, canvas.width, canvas.height);

class Sprite {
    constructor({position, velocity}) {
    this.position = position;
    this.velocity = velocity;
    this.height = 150;
    }
    draw() {
        c.fillStyle = 'red'
        c.fillRect(this.position.x, this.position.y, 50, 150);

    }
    update(){
        this.draw();
        this.position.y += this.velocity.y;
        if (this.position.y + this.height)
    }
}
const player = new Sprite({
    position: {
        x: 0,
        y: 10,
    },
    velocity: {
        x:0,
        y:0
    }
})
player.draw();

const enemy = new Sprite({
    position:
        {
            x: 400,
            y: 400,
        },
    velocity: {
        x: 0,
        y: 0,
    }
});

function animate(){
    window.requestAnimationFrame(animate)
    c.fillStyle = 'black';
    c.fillRect(0, 0, canvas.width, canvas.height);
    player.update();
    enemy.update();
}
animate();