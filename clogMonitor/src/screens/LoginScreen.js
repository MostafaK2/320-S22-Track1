import logo from '../components/logo.svg'; //change directory
import '../screens/LoginScreen.css'


const database = [
  {
    username: "Mark",
    password: "123"
  }
];

function LoginScreen() {
  return (
    <div>
      <form className="LoginScreen">
        <h1>
          Clog Monitor Login
        </h1>
        <form>
          <label>
            Username:
            <input type="text" name="name" required/>
          </label>
          <label>
            <br/>
            Password:
            <input type="text" name="pass" required/>
          </label>
        </form>
        <label>
          Remember Password?
          <input type="checkbox" name="remember" />
        </label>
        <label>
          Forgot Password?
          <input type="submit" name="Get Help" />
        </label>
        <br/>
        <input type="submit" value="Login" />
        </form>
      </div>
  );
}

export default LoginScreen;
