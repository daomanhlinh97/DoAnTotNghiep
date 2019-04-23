import React, { Component } from "react";
import { Link } from "react-router-dom";

class LogView extends Component
{
    render()
    {
        return(
            <li>
          <li>
              <p
                href="#homeSubmenu7"
                data-toggle="collapse"
                aria-expanded="false"
                className="dropdown-toggle">
                <i class="fa fa-eye home-content" aria-hidden="true" />
                Log View
              </p>
              </li>
          </li>
        )
    }
}

export default LogView;