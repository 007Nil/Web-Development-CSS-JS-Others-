// for 1st image
var randomNumber1 = Math.floor(Math.random() * 6) + 1;
// alert (randomNumber1);
var randomDiceImages = "dice" + randomNumber1 + ".png";
var randomDiceSource = "images/" + randomDiceImages;
var image1 = document.querySelectorAll("img")[0];
image1.setAttribute("src", randomDiceSource);

// For 2nd image
var randomNumber2 = Math.floor(Math.random() * 6) + 1;
var randomDiceImages = "dice" + randomNumber2 + ".png";
var randomDiceSource = "images/" + randomDiceImages;
var image2 = document.querySelectorAll("img")[1];
image2.setAttribute("src", randomDiceSource);

if (randomNumber1 > randomNumber2) {
  document.querySelector("h1").innerHTML = "player 1 wins !";
} else if (randomNumber1 == randomNumber2) {
  document.querySelector("h1").innerHTML = "Its a Draw";
} else {
  document.querySelector("h1").innerHTML = "player 2 wins !";
}
