import React, { Component } from "react";
import "../PackagesSearch"
import PackagesSearch from "../PackagesSearch";
import { Route, Link } from "react-router-dom";

class PackagesChildPage extends Component
{
    render()
    {
        return (
            <div>
                <PackagesSearch/>
                <Route>
                <table className = "table-link">
                    <tr>
                        <td className = "td-table-link">
                            <button className = "button-border-radius-left">Colaboration</button>
                        </td>
                        <td className = "td-table-link">
                            <button>Backoffice extentions</button>
                        </td>
                        <td className = "td-table-link">
                            <button>Developer tools</button>
                        </td>
                        <td className = "td-table-link">
                            <button>Starter kits</button>
                        </td>
                        <td className = "td-table-link">
                            <button>Umbraco Pro</button>
                        </td>
                        <td className = "td-table-link">
                            <button className = "button-border-radius-right">Website utilities</button>
                        </td>
                    </tr>
                </table>
                </Route>
            </div>
        );
    }
}
export default PackagesChildPage;