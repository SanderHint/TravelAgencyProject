window.addEventListener('DOMContentLoaded', event => {

    // Navbar shrink function
    var navbarShrink = function () {
        const navbarCollapsible = document.body.querySelector('#mainNav');
        if (!navbarCollapsible) {
            return;
        }
        if (window.scrollY === 0) {
            navbarCollapsible.classList.remove('navbar-shrink')
        } else {
            navbarCollapsible.classList.add('navbar-shrink')
        }

    };

    // Search bar movement
    $(document).ready(function() {
        $('#searchToggle').click(function() {
            $('#searchBar').toggleClass('active');
        });
    });

    // Shrink the navbar 
    navbarShrink();

    // Shrink the navbar when page is scrolled
    document.addEventListener('scroll', navbarShrink);

    //  Activate Bootstrap scrollspy on the main nav element
    const mainNav = document.body.querySelector('#mainNav');
    if (mainNav) {
        new bootstrap.ScrollSpy(document.body, {
            target: '#mainNav',
            rootMargin: '0px 0px -40%',
        });
    };

    // Collapse responsive navbar when toggler is visible
    const navbarToggler = document.body.querySelector('.navbar-toggler');
    const responsiveNavItems = [].slice.call(
        document.querySelectorAll('#navbarResponsive .nav-link')
    );
    responsiveNavItems.map(function (responsiveNavItem) {
        responsiveNavItem.addEventListener('click', () => {
            if (window.getComputedStyle(navbarToggler).display !== 'none') {
                navbarToggler.click();
            }
        });
    });

});

const express = require('express');
const app = express();

// ... other middleware and configurations ...

// Define a route to handle the search
app.get('/search', (req, res) => {
    const query = req.query.q; // Get the search query from the 'q' parameter

    // Implement your search logic here
    // For demonstration, let's assume searchResults is an array of search results
    const searchResults = [
        'Result 1',
        'Result 2',
        'Result 3',
        // ... more search results ...
    ];

    res.json({ results: searchResults });
});

window.addEventListener('DOMContentLoaded', event => {
    // ... existing code ...

    // Handle search form submission
    const searchForm = document.querySelector('#searchForm');
    const searchResultsContainer = document.querySelector('#searchResults');

    searchForm.addEventListener('submit', async event => {
        event.preventDefault();

        const formData = new FormData(searchForm);
        const searchQuery = formData.get('q');

        if (searchQuery) {
            try {
                const response = await fetch(`/search?q=${searchQuery}`);
                const data = await response.json();
                const searchResults = data.results;

                // Clear previous search results
                searchResultsContainer.innerHTML = '';

                // Display search results
                searchResults.forEach(result => {
                    const resultItem = document.createElement('div');
                    resultItem.textContent = result;
                    searchResultsContainer.appendChild(resultItem);
                });
            } catch (error) {
                console.error('Error fetching search results:', error);
            }
        }
    });

    // ... rest of the code ...
});