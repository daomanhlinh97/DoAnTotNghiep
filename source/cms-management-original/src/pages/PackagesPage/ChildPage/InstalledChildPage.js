import React, { Component } from "react";

const menu = [
    {name: "The Starter Kit", version: "4.0.0", Link: "https://umbraco.com/", company: "Umbraco HQ"} ,
    {name: "Umbraco Forms", version: "8.0.0", Link: "https://umbraco.com/products/umbraco-forms/", company: "Umbraco HQ"}
];

class InstalledChildPage extends Component
{
    render()
    {
        return (
            <div>
                <label className = "label-installed">Installed packages</label>
                <div className = "layout">
                    <form className = "form-installed">
                        <table className = "table-installed">
                            <tr>
                                <td className = "td-installed-header">
                                    <p className = "icon-box-installed"></p>
                                </td>
                                <td className = "td-installed-body">
                                    <p className = "label-name-package">The Starter Kit</p>
                                    <div>
                                        <label className = "label-info-package pos">Ver: 4.0.0 - </label>
                                        <a href = "https://umbraco.com"> https://umbraco.com - </a>
                                        <label className = "label-info-package">Umbraco HQ</label>
                                    </div>
                                </td>
                                <td className = "td-installed-foot">
                                    <button className = "button-installed">Uninstall package</button>
                                </td>
                            </tr>
                        </table>
                    </form>
                    <div>
                    <form className = "form-installed">
                        <table className = "table-installed">
                            <tr>
                                <td className = "td-installed-header">
                                    <p className = "icon-box-installed"></p>
                                </td>
                                <td className = "td-installed-body">
                                    <p className = "label-name-package">Umbraco Forms</p>
                                    <div>
                                        <label className = "label-info-package pos">Ver: 8.0.0 - </label>
                                        <a href = "https://umbraco.com/products/umbraco-forms/"> https://umbraco.com/products/umbraco-forms/ - </a>
                                        <label className = "label-info-package">Umbraco HQ</label>
                                    </div>
                                </td>
                                <td className = "td-installed-foot">
                                    <button className = "button-installed">Uninstall package</button>
                                </td>
                            </tr>
                        </table>
                    </form>
                    </div>
                </div>
            </div>
        );
    }
}

export default InstalledChildPage;