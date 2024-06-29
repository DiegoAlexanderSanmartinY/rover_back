const HTTP_SERVER = "http://localhost:8080/api/";
createMap();
async function createMap() {
  await refreshRover();

  let rocks = await fetch(HTTP_SERVER + "obstacle");
  let rocksPosition = await rocks.json();
  rocksPosition.forEach((rock) => {
    createRock(rock.x, rock.y);
  });
}

async function refreshRover() {
  let rover = await fetch(HTTP_SERVER + "rover");
  let roverPosition = await rover.json();
  moveRover(roverPosition.x, roverPosition.y);
}
function moveRover(x, y) {
  playmoveSound();
  document.getElementById("rovert").style.top = y * 100 + "px";
  document.getElementById("rovert").style.left = x * 100 + "px";
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

async function sendCommand(command) {
  let requestBody = {
    commands: [`${command}`],
  };
  await fetch(HTTP_SERVER + "rover/command", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(requestBody),
  });
  await refreshRover();
}

async function btnRotateForward() {
  await sendCommand("F");
}
async function btnRotateBackward() {
  await sendCommand("B");
}
async function btnRotateLeft() {
  await sendCommand("L");
}
async function btnRotateRight() {
  await sendCommand("R");
}

function playmoveSound() {
  let audio = new Audio("sounds/move.wav");
  audio.play();
}
