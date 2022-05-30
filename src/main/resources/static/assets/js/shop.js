function test(){
    const quantity1 = parseInt(document.getElementById('quantity1').value) * 0.7;
    const quantity2 = parseInt(document.getElementById('quantity2').value) * 0.4;
    const quantity3 = parseInt(document.getElementById('quantity3').value) * 0.4;
    const quantity4 = parseInt(document.getElementById('quantity4').value) * 0.2;
    sumQuantity = quantity1 + quantity2 + quantity3 + quantity4;
    sumQuantity =Math.ceil(sumQuantity);

    const price1 = parseInt(document.getElementById('quantity1').value) * 199;
    const price2 = parseInt(document.getElementById('quantity2').value) * 49;
    const price3 = parseInt(document.getElementById('quantity3').value) * 89;
    const price4 = parseInt(document.getElementById('quantity4').value) * 10;
    sumPrice = price1 + price2 + price3 + price4;


    document.getElementById('display').innerHTML = sumQuantity +" and " + sumPrice;
}