import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './style.css';

function Navbar() {
    return (
        <header>
        <nav className="container">
            <div className="dsmovie-nav-content">
                <h1>DsMovie</h1>
                <a href="https://github.com/danimlds">
                    <div className="dsmovie-contact-container">
                    <GithubIcon />
                    <p className="dsmovie-contact-link">/danimlds</p>
                    </div>
                </a>
            </div>
        </nav>
    </header>
    );
}

export default Navbar;