import React, { Component } from "react";
import { Link } from "react-router-dom";

class DocumentType extends Component
{
    render()
    {
        return(
            <div>
            <li>
            <p
              href="#homeSubmenu0"
              data-toggle="collapse"
              aria-expanded="false"
              className="dropdown-toggle">
              <i class="fa fa-location-arrow arrow" aria-hidden="true" />
              <i class="fa fa-folder home-content" aria-hidden="true" />
              Document Types
            </p>
          <ul className="collapse list-unstyled" id="homeSubmenu0">
            <li>
              <Link className="link-home" to="/">
                <i class="fa home-content-icon fa fa-file-text-o" aria-hidden="true" />
                Blog
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/content/contact">
                <i
                  class="fa home-content-icon fa fa-file-text-o"
                  aria-hidden="true"
                />
                Blogpost
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/content/home">
                <i
                  class="fa home-content-icon fa fa-file-text-o"
                  aria-hidden="true"
                />
                contact
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/">
                <i
                  class="fa home-content-icon fa fa-file-text-o home-content-icon"
                  aria-hidden="true"
                />
                Content Page
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/">
                <i
                  class="fa home-content-icon fa fa-file-text-o"
                  aria-hidden="true"
                />
                Home
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/content/home">
                <i
                  class="fa home-content-icon fa fa-file-text-o"
                  aria-hidden="true"
                />
                People
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/">
                <i
                  class="fa home-content-icon fa fa-file-text-o home-content-icon"
                  aria-hidden="true"
                />
                Person
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/">
                <i
                  class="fa home-content-icon fa fa-file-text-o"
                  aria-hidden="true"
                />
                Product
              </Link>
            </li>
            <li>
              <Link className="link-home" to="/">
                <i
                  class="fa home-content-icon fa fa-file-text-o"
                  aria-hidden="true"
                />
                Products
              </Link>
            </li>
          </ul>
        </li>
        </div>
        )
    }
}

export default DocumentType;