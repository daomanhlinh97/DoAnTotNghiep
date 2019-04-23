import React, { Component } from "react";

class ContentDefaultWel extends Component
{
    render()
    {
        return(
            <form className = "form-wel">
                <label className = "lable-header lable-common">Start here</label>
                <p className = "lable-common lable-10px">This section contains the building blocks for your Umbraco site. Follow the below links to find out more about working with the items in the Settings section:</p>
                <lable className = "lable-common lable-10px lable-bold">Find out more:</lable>
                <ul className = "a">
                    <li>Read more about working with the items in Settings in the Documentation section of Our Umbraco</li>
                    <li>Download the Editors Manual for details on working with the Umbraco UI</li>
                    <li>Ask a question in the Community Forum</li>
                    <li>Watch our tutorial videos (some are free, some require a subscription)</li>
                    <li>Find out about our productivity boosting tools and commercial support</li>
                    <li>Find out about real-life training and certification opportunities</li>
                </ul>
            </form>
        )
    }
}

export default ContentDefaultWel;