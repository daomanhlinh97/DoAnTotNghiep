import React, { Component } from "react";
import { Link } from "react-router-dom";

class Macros extends Component
{
    render()
    {
        return(
            <div>
            <li>
            <p
              href="#homeSubmenu4"
              data-toggle="collapse"
              aria-expanded="false"
              className="dropdown-toggle">
              <i class="fa fa-location-arrow arrow" aria-hidden="true" />
              <i class="fa fa-folder home-content" aria-hidden="true" />
              Macros
            </p>
          <ul className="collapse list-unstyled" id="homeSubmenu4">
            <li>
              <Link className="link-home" to="/">
                <i class="fa home-content-icon fa fa-cogs" aria-hidden="true" />
                 Get Lastest Blogposts
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/">
                <i class="fa home-content-icon fa fa-cogs" aria-hidden="true" />
                 Select Featured Products
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/">
                <i class="fa home-content-icon fa fa-cogs" aria-hidden="true" />
                 Insert Form with Theme
              </Link>
            </li>
          </ul>
        </li>
        </div>
        )
    }
}

export default Macros;