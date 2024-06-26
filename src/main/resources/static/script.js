function moveRover(x, y) {
  document.getElementById("rovert").style.top = y * 100 + "px";
  document.getElementById("rovert").style.left = x * 100 + "px";
  playmoveSound();
}

function createRock(x, y) {
  let rock = document.createElement("img");
  rock.setAttribute("src", "images/rock.png");
  rock.setAttribute("class", "rock");
  const contenedorImagen = document.getElementById("container");
  contenedorImagen.appendChild(rock);

  rock.style.top = y * 100 + "px";
  rock.style.left = x * 100 + "px";
}

let posX = 0;
let posY = 0;

function btnRotateForward() {
  //alert("down");
  posY++;
  moveRover(posX, posY);
}
function btnRotateBackward() {
  alert("up");
}
function btnRotateLeft() {
  alert("left");
}
function btnRotateRight() {
  alert("right");
}

function playmoveSound() {
  let audio = new Audio("sounds/move.wav");
  audio.play();
}
