import React, { Component } from "react";

class PackagesSearch extends Component
{
    render()
    {
        return (
            <div>
                <input className = "search-packages" type = "text" placeholder="Search for packages"></input>
            </div>
        );
    }
}

export default PackagesSearch;