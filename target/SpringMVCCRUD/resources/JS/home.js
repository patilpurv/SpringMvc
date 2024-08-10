//Name validation
function setName(str) {

	var flag = false;

	for (var i = 0; i < str.length; i++) {
		let ascii = str.charCodeAt(i);

		let span = document.getElementById("span");
		if (!((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || (ascii == 32))) {

			flag = true;
			break;

		}
	}
	if (flag) {
		span.innerHTML = "digit our special symbol not allowed in name";
		span.style.color = "white";
	} else {
		span.innerHTML = "";
	}
}
//Password validation

function password(str) {
	let a = 0, n = 0, s = 0;
	var flag = false;
	for (let i = 0; i < str.length; i++) {
		if (str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90) {
			a++;

		}
		else if (str.charCodeAt(i) >= 48 && str.charCodeAt(i) <= 57) {
			n++;
		}
		else if (!((str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90) || (str.charCodeAt(i) >= 97 && str.charCodeAt(i) <= 122) || (str.charCodeAt(i) == 32) || (str.charCodeAt(i) >= 48 && str.charCodeAt(i) <= 57))) {
			s++;
		}
	}
	if (str.length < 6 || a < 1 || n < 1 || s < 1) {
		flag = true;

	}



	if (flag) {



		document.getElementById("s5").innerHTML = "password not valid";
		document.getElementById("s5").style.color = "white";
	}
	else {
		document.getElementById("s5").innerHTML = "";
	}
}

//Email Validation
function validateEmail(str) {

	let status = checkUpper(str);
	if (status == true) {
		document.getElementById("s").innerHTML = "Capital element not allowed";
		document.getElementById("s").style.color = "white";
	}
	else {
		let index = str.indexOf("@");
		if (index <= 0) {
			document.getElementById("s").innerHTML = "invalid email address";
			document.getElementById("s").style.color = "white";
		}
		else {
			let substr = str.substring(index, str.length);
			let ind = substr.indexOf(".");
			let count = 0;
			for (let i = 0; i < str.length; i++) {
				if (str.charAt(i) == '@') {
					++count;
				}
			}
			if (((substr.substring(ind, substr.length).length == 4) || substr.substring(ind, substr.length).length == 3) && count == 1) {
				document.getElementById("s").innerHTML = "";
			}
			else {
				document.getElementById("s").innerHTML = "invalid email address";
				document.getElementById("s").style.color = "white";
			}
		}
	}
}
//Mobile No
function setMobile(s)
   {
	  //var name=document.getElementById("n").value;
      var pattern=/^[0-9]+$/; //ab9
      var result=s.match(pattern);
        if(s.length>10)
         { document.getElementById("m").innerHTML="mobile number should be 10 digit ";
            }
             else if(result==null)
              { document.getElementById("m").innerHTML="phone number should accept digit or special symbol only alphabet allow";
                document.getElementById("m").style.color="white";
              }
                 else{
                    document.getElementById("m").innerHTML="";
                     }

                   }
                   
//setUName

function setUName(str) {

	
	var flag = false;

	for (var i = 0; i < str.length; i++) {
		let ascii = str.charCodeAt(i);

		var s = document.getElementById("u");
		if (!((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || (ascii == 32))) {

			flag = true;
			break;

		}
	}
	if (flag) {
		s.innerHTML = "digit our special symbol not allowed in name";
		s.style.color = "white";
	} else {
		s.innerHTML = "";
	}
}

//Password

function password(str) {
	let a = 0, n = 0, s = 0;
	var flag = false;
	for (let i = 0; i < str.length; i++) {
		if (str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90) {
			a++;

		}
		else if (str.charCodeAt(i) >= 48 && str.charCodeAt(i) <= 57) {
			n++;
		}
		else if (!((str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90) || (str.charCodeAt(i) >= 97 && str.charCodeAt(i) <= 122) || (str.charCodeAt(i) == 32) || (str.charCodeAt(i) >= 48 && str.charCodeAt(i) <= 57))) {
			s++;
		}
	}
	if (str.length < 6 || a < 1 || n < 1 || s < 1) {
		flag = true;

	}



	if (flag) {



		document.getElementById("s5").innerHTML = "password not valid";
		document.getElementById("s5").style.color = "white";
	}
	else {
		document.getElementById("s5").innerHTML = "";
	}
}
//Search Function
function searchname(name)
{
	//var name=document.getElementById("name").value;
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				document.getElementById("p1").innerHTML = this.responseText;
			}
		};
		xhttp.open("GET", "namesearch?n=" + name, true);
		xhttp.send();
}