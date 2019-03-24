import React, { Component } from "react";

class CreatedChildPage extends Component
{
    render()
    {
        return (
            <div >
               
                <form className="form-created">
                <button className = "button-created"> Create package </button>
                <div>
                    <label className="label-created">
                        No packages have been created yet
                    </label>
                </div>
                </form>
            </div>
        );
    }
}

export default CreatedChildPage;