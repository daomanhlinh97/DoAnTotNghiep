import React, { Component } from "react";

 class LoginPage extends Component {
  render() {
    return (
        <div  classNameName="container">
        <div  classNameName="d-flex justify-content-center h-100">
            <div  classNameName="card">
                <div  classNameName="card-header">
                    <h3>Sign In</h3>
                    <div  className="d-flex justify-content-end social_icon">
                        <span><i  className="fab fa-facebook-square"></i></span>
                        <span><i  className="fab fa-google-plus-square"></i></span>
                        <span><i  className="fab fa-twitter-square"></i></span>
                    </div>
                </div>
                <div  className="card-body">
                    <form>
                        <div  className="input-group form-group">
                            <div  className="input-group-prepend">
                                <span  className="input-group-text"><i  className="fas fa-user"></i></span>
                            </div>
                            <input type="text"  className="form-control" placeholder="username"/>
                            
                        </div>
                        <div  className="input-group form-group">
                            <div  className="input-group-prepend">
                                <span  className="input-group-text"><i  className="fas fa-key"></i></span>
                            </div>
                            <input type="password"  className="form-control" placeholder="password"/>
                        </div>
                        <div  className="row align-items-center remember">
                            <input type="checkbox"/>Remember Me
                        </div>
                        <div  className="form-group">
                            <input type="submit" value="Login"  className="btn float-right login_btn"/>
                        </div>
                    </form>
                </div>
                <div  className="card-footer">
                    <div  className="d-flex justify-content-center links">
                        Don't have an account?<a href="#">Sign Up</a>
                    </div>
                    <div  className="d-flex justify-content-center">
                        <a href="#">Forgot your password?</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    );
  }
}

export default LoginPage;