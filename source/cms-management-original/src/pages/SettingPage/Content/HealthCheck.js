import React, { Component } from "react";

class HealthCheck extends Component
{
    render()
    {
        return(
            <form className = "form-hea height-200">
               <form>
                    <label className = "lable-header lable-common">Health Check</label>
                    <br></br>
                    <p className = "lable-common lable-10px">The health checker evaluates various areas of your site for best practice settings, configuration, potential problems, etc. You can easily fix problems by pressing a button. You can add your own health checks, have a look at the documentation for more information about custom health checks.</p>
                    <button className = "button-check-all lable-common">Check All Groups</button>
                </form>
                    <table className = "table-hea">
                        <tr>
                            <td><button>Configuration</button></td>
                            <td><button>Live Environment</button></td>
                            <td><button>Permissions</button></td>
                            <td><button>Security</button></td>
                            <td><button>Service</button></td>
                        </tr>
                    </table>
                
            </form>
        )
    }
}

export default HealthCheck;