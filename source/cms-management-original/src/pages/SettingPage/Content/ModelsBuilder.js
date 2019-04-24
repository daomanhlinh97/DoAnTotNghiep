import React, { Component } from "react";

class ModelsBuilder extends Component
{
    render()
    {
        return(
            <form className = "form-wel  height-300">
                <label className = "lable-header lable-common">Models Builder</label>
                <br></br>
                <lable className = "lable-common lable-10px lable-bold">ModelsBuilder is enabled, with the following configuration:</lable>
                <ul className = "a">
                    <li>The models factory is enabled.</li>
                    <li>The API is neither installed nor enabled.
                        External tools such as Visual Studio cannot use the API.</li>
                    <li>PureLive models are enabled.</li>
                    <li>Models namespace is Umbraco.Web.PublishedModels.</li>
                    <li>Static mixin getters are enabled. The pattern for getters is "Get{0}".</li>
                    <li>Tracking of out-of-date models is not enabled.</li>
                </ul>
                <button className = "button-check-all lable-common">Reload</button>
            </form>
        )
    }
}

export default ModelsBuilder;