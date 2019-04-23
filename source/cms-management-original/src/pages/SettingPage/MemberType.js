import React, { Component } from "react";
import { Link } from "react-router-dom";

class MemberType extends Component
{
    render()
    {
        return(
            <div>
            <li>
            <p
              href="#homeSubmenu2"
              data-toggle="collapse"
              aria-expanded="false"
              className="dropdown-toggle">
              <i class="fa fa-location-arrow arrow" aria-hidden="true" />
              <i class="fa fa-folder home-content" aria-hidden="true" />
              Member Type
            </p>
          <ul className="collapse list-unstyled" id="homeSubmenu2">
            <li>
              <Link className="link-home" to="/">
                <i class="fa home-content-icon fa fa-user" aria-hidden="true" />
                Member
              </Link>
            </li>
          </ul>
        </li>
        </div>
        )
    }
}

export default MemberType;