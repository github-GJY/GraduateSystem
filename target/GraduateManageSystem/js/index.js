
let navUl=document.getElementById("navUl");
let li=navUl.children;
function doEnter()
{
    //console.info("enter");
    let ul=this.getElementsByClassName("submenu")[0];
    if(!ul)
    {
        return null;
    }
    //ul.style.display="block";
    ul.classList.add("show")
}
function doLeave()
{
    //console.info("leave");
    let ul=this.getElementsByClassName("submenu")[0];
    if(!ul)
    {
        return null;
    }
    //ul.style.display="none";
    ul.classList.remove("show")
}
for(let i=0;i<=li.length-1;i++)
{
    li[i].addEventListener("mouseenter",doEnter);
    li[i].addEventListener("mouseleave",doLeave);
}
