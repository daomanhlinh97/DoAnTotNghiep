import React, { Component } from "react";
import { Link } from "react-router-dom";

class RelationType extends Component
{
    render()
    {
        return(
            <div>
            <li>
            <p
              href="#homeSubmenu5"
              data-toggle="collapse"
              aria-expanded="false"
              className="dropdown-toggle">
              <i class="fa fa-location-arrow arrow" aria-hidden="true" />
              <i class="fa fa-folder home-content" aria-hidden="true" />
              Relation Type
            </p>
          <ul className="collapse list-unstyled" id="homeSubmenu5">
            <li>
              <Link className="link-home" to="/">
                <i class="fa home-content-icon fa fa-refresh" aria-hidden="true" />
                Relation Document On Copy
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/">
                <i class="fa home-content-icon fa fa-refresh" aria-hidden="true" />
                Relation Parent Document On Delete
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/">
                <i class="fa home-content-icon fa fa-refresh" aria-hidden="true" />
                Relation Parent Media Folder On Delete
              </Link>
            </li>
          </ul>
        </li>
        </div>
        )
    }
}

export default RelationType;