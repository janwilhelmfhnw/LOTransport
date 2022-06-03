<!--Author: Jan Wilhelm-->

function test(){
  //  var orderReview = [];

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


 //    orderReview.push({pquantity: sumQuantity, pprice: sumPrice,});


    document.getElementById('displaySpace').innerHTML = sumQuantity +" Palletspace";
    document.getElementById('displayPrice').innerHTML = sumPrice +"CHF";

    // document.getElementById("table").deleteRow(0);
    //
    // var cols = ['pquantity', 'pprice',];
    // for (var i = 0; i < orderReview.length; i++) {
    //     $('table').append('<tr></tr>');
    //     for (var j = 0; j < cols.length; j++) {
    //         $('table tr:last-child').append('<td>' + orderReview[i][cols[j]] + '</td>');
    //     }
    // }

}

function orderButton(){

    if (sumQuantity!== null) {
        window.localStorage.setItem('quantityProduct', JSON.stringify(sumQuantity));
        window.localStorage.setItem('costProduct', JSON.stringify(sumPrice));
        window.location.href ='customer/review';

    } else { //function myFunction() {
        alert("I am an alert box!");

    }
}
function buyOrder(){
    var date = new Date();
    window.localStorage.setItem("date", date);
}


function displayOrder(){
    JSON.parse(window.localStorage.getItem('quantityProduct'));
    JSON.parse(window.localStorage.getItem('costProduct'));
    document.getElementById('quantityProduct').innerHTML = JSON.parse(window.localStorage.getItem('quantityProduct')) +" Palletspace";
    document.getElementById('costProduct').innerHTML = JSON.parse(window.localStorage.getItem('costProduct')) + " CHF";
}

function displayPastOrders(){
    document.getElementById('quantityProduct').innerHTML = JSON.parse(window.localStorage.getItem('quantityProduct')) +" Palletspace";
    document.getElementById('costProduct').innerHTML = JSON.parse(window.localStorage.getItem('costProduct')) +" CHF";
    var date = window.localStorage.getItem("date");
    date = new Date(date);
    date.setDate(date.getDate());

    document.getElementById('date').innerHTML = date;
}

function goBack(){
window.localStorage.removeItem('quantityProduct');
window.localStorage.removeItem('costProduct');
}

function displayPastOrder(){
    document.getElementById('quantityProduct').innerHTML = JSON.parse(window.localStorage.getItem('quantityProduct')) +" Palletspace";
    document.getElementById('costProduct').innerHTML = JSON.parse(window.localStorage.getItem('costProduct')) +" Palletspace"; +"CHF";
}

function logOut(){
    window.localStorage.removeItem('quantityProduct');
    window.localStorage.removeItem('costProduct');
    window.localStorage.removeItem('date');
}

 function order(){
     setTimeout(function(){
    },5000);
     window.location.href ='/orders';
 }

function getAddress(callback) {
    $.ajax({
        type: "GET",
        dataType: "json",
        url: serviceEndpointURL + "/customer/address",
        success: function (data) {
            callback(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(jqXHR, textStatus, errorThrown);
        }
    });
}
function getProfile(callback) {
    $.ajax({
        type: "GET",
        dataType: "json",
        url: serviceEndpointURL + "/customer",
        success: function (data) {
            callback(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(jqXHR, textStatus, errorThrown);
        }
    });
}