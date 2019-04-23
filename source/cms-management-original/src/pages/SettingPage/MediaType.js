import React, { Component } from "react";
import { Link } from "react-router-dom";

class MediaType extends Component
{
    render()
    {
        return(
            <li>
            <li>
             <p
               href="#homeSubmenu1"
               data-toggle="collapse"
               aria-expanded="false"
               className="dropdown-toggle">
               <i class="fa fa-location-arrow arrow" aria-hidden="true" />
               <i class="fa fa-folder home-content" aria-hidden="true" />
               Media type
             </p>
             </li>
             <ul className="collapse list-unstyled" id="homeSubmenu1">
             <li>
               <Link className="link-home" to="/content/home">
                 <i
                   class="fa home-content-icon fa fa-align-justify"
                   aria-hidden="true"
                 />
                 Products
               </Link>
             </li>
             <li>
               <Link className="link-home" to="/">
                 <i
                   class="fa home-content-icon fa fa-align-justify home-content-icon"
                   aria-hidden="true"
                 />
                 Peoole
               </Link>
             </li>
             <li>
               <Link className="link-home" to="/">
                 <i
                   class="fa home-content-icon fa fa-align-justify"
                   aria-hidden="true"
                 />
                 About Us
               </Link>
             </li>
             </ul>
         </li>
        )
    }
}

export default MediaType;