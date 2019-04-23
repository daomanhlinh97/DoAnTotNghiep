import React, { Component } from "react";
import { Link } from "react-router-dom";

class languages extends Component
{
    render()
    {
        return(
            <li>
          <li>
              <p
                href="#homeSubmenu8"
                data-toggle="collapse"
                aria-expanded="false"
                className="dropdown-toggle">
                <i class="fa fa-globe home-content" aria-hidden="true" />
                languages
              </p>
              </li>
          </li>
        )
    }
}

export default languages;