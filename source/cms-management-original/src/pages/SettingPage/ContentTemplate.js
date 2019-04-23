import React, { Component } from "react";
import { Link } from "react-router-dom";

class ContentTemplate extends Component
{
    render()
    {
        return(
            <li>
          <li>
              <p
                href="#homeSubmenu9"
                data-toggle="collapse"
                aria-expanded="false"
                className="dropdown-toggle">
                <i class="fa fa-folder home-content" aria-hidden="true" />
                Content Templates
              </p>
              </li>
          </li>
        )
    }
}

export default ContentTemplate;