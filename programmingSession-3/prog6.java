import java.util.Scanner;
class prog6 
{
	public static int smallest(int x, int y, int z)
	{
		int res = (x<y && x<z)?x:(y<z)?y:z;
		return res;
	}
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a= s.nextInt();
		int b=s.nextInt();
		int c= s.nextInt();
		int small = smallest(a,b,c);
		System.out.println(small);

	}
	//<i class="fa-solid fa-user"></i>  - user
	<i class="fa-regular fa-lock-keyhole"></i> - password
		<i class="fa-regular fa-envelope"></i> - email
		<i class="fa-solid fa-microphone"></i> mc
		<i class="fa-solid fa-magnifying-glass"></i> search


		<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=h1, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./font-awesome-4.7.0/css/font-awesome.min.css">
    <style>
        div {
            height: 550px;
            width: 283px;
            border: 1px solid;
            margin: 0 auto;
            background-image: url(./navy\ blue.jpg);
            /* background-color: ; */
            border-radius: 30px;
        }

        #main {
            text-align: center;
        }

        h1 {
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        h2 {
            color: rgb(39, 39, 179);
        }

        #border {
            border-radius: 25px;
            border: 2px solid black;
            padding: 15px;
            width: 200px;
            height: 10px;
        }

        #button {
            display: inline-block;
            border-radius: 25px;
            border: 2px solid;
            padding: 15px;
            width: 200px;
            /* height: 10px; */
            text-align: center;
            background-image: linear-gradient(to right, rgb(244, 90, 116), orange)
        }

        #button:hover {
            background-color: blueviolet;
        }

        #login {
            font-size: 15px;
            color: rgb(239, 116, 72);
        }

        #login1 {
            color: white;
            font-size: 15px;
        }

        .img {
            height: 60px;
            width: 60px;
            border: 1px solid;
            display: inline-block;
            margin: 0 auto;
        }

        #i1 {
            background-image: url(./cartoon-student-png.png);
            background-position: center;
            background-size: cover;
            background-repeat: no-repeat;

        }

        #i2 {
            background-image: url(./parent2.webp);
            background-position: center;
            background-size: cover;
            background-repeat: no-repeat;
        }

        #i3 {
            background-image: url(./Teacher2.jpg);
            background-position: center;
            background-size: cover;
            background-repeat: no-repeat;

        }


        #icon {
            display: inline-block;

        }

        i {
            display: flex;
            justify-content: center;
            align-items: center;
            justify-items: center;
            position: relative;
            right: 200px;
            top: 40px;
        }

        input {
            margin: 10px;
        }

        input::placeholder {
            padding: 20px;
        }

        a {
            padding: 20px;
            display: inline-block;
        }
    </style>
</head>

<body>

    <div id="main">
        <h1>Sign Up</h1>
        <h2>who you are?</h2>
        <!-- <div id="image"> -->
        <div class="img" id="i1"></div>
        <div class="img" id="i2"></div>
        <div class="img" id="i3"></div>
        <!-- </div> -->

        <!-- <div id="user"> -->
        <i class="fa fa-user" aria-hidden="true"></i>
        <input type="text" placeholder="Username" id="border">
        <label for="email"></label>
        <input type="email" name="" id="border" placeholder="Email">
        <label for="password"></label>
        <input type="password" name="" id="border" placeholder="Password">
        <label for="confirm password"></label>
        <input type="password" name="" id="border" placeholder="Confirm Password">
        <button type="submit" id="button">Sign Up</button>
        <a href="login here" id="login">login here</a>
    </div>

    </div>



</body>

</html>
}
