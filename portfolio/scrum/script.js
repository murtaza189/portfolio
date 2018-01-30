function night(){
    document.getElementById("background").style.background="#070c13";
    var sun= document.getElementsByClassName("sun");
    sun[0].style.backgroundColor="white";
    sun[0].style.boxShadow="0px 0px 40px 15px";


}
function day(){
    document.getElementById("background").style.background="#4c8fde";
    var sun= document.getElementsByClassName("sun");
    sun[0].style.backgroundColor="#ff7800";
    sun[0].style.boxShadow="0px 0px 40px 15px red";

}
function credits(){
document.getElementById("tekst").style.width="150px";
document.getElementById("tekst").style.height="50px";

document.getElementById("tekst").style.border="2px solid black";
document.getElementById("tekst").style.padding="10px";
document.getElementById("tekst").innerHTML = "project gemaakt door: Bruna, Murtaza, Noman en Willem";
}