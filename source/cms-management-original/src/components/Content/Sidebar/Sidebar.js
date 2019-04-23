/* eslint-disable jsx-a11y/anchor-is-valid */
/* eslint-disable react/prop-types */
/* eslint-disable react/no-children-prop */
import React, { Component } from "react";
import { Link } from "react-router-dom";

class Sidebar extends Component {
  render() {
    return (
      <nav id="sidebar">
      <Link to = "/" className = "link-decoration">
      <div className="sidebar-header ">
          <h3>Content</h3>
      </div>
      </Link>
        

        <ul className="list-unstyled components">
          <li>
            <Link to="/" className = "link-decoration">
              <p
                href="#homeSubmenu0"
                data-toggle="collapse"
                aria-expanded="false"
                className="dropdown-toggle show-hover">
                <i class="fa fa-location-arrow arrow" aria-hidden="true" />
                <i class="fa fa-home home-content" aria-hidden="true" />
                Home
              </p>
            </Link>
            <ul className="collapse list-unstyled" id="homeSubmenu0">
              <li>
                <Link className="link-home" to="/content/home">
                  <i
                    class="fa home-content-icon fa-shopping-cart"
                    aria-hidden="true"
                  />
                  Products
                </Link>
              </li>
              <li>
                <Link className="link-home" to="/">
                  <i
                    class="fa home-content-icon fa-users home-content-icon"
                    aria-hidden="true"
                  />
                  Peoole
                </Link>
              </li>
              <li>
                <Link className="link-home" to="/">
                  <i
                    class="fa home-content-icon fa-file-o"
                    aria-hidden="true"
                  />
                  About Us
                </Link>
              </li>
              <li>
                <Link className="link-home" to="/">
                  <i class="fa home-content-icon fa-book" aria-hidden="true" />
                  Blog
                </Link>
              </li>
              <li>
                <Link className="link-home" to="/content/contact">
                  <i
                    class="fa home-content-icon fa-map-marker"
                    aria-hidden="true"
                  />
                  Contacts
                </Link>
              </li>
            </ul>
          </li>
          <li>
            <Link to="/content/recyle" className = "link-decoration">
              <p className = "show-hover">
                <i class="fa fa-trash" aria-hidden="true" />
                Recycle Bin
              </p>
            </Link>
          </li>
        </ul>
      </nav>
    );
  }
}

export default Sidebar;
