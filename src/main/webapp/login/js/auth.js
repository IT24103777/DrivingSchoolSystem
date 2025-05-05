document.addEventListener('DOMContentLoaded', function() {
    // Shared form validation for both login/register
    const forms = document.querySelectorAll('form');

    forms.forEach(form => {
        form.addEventListener('submit', function(e) {
            // Basic client-side validation
            const inputs = this.querySelectorAll('input[required]');
            let isValid = true;

            inputs.forEach(input => {
                if (!input.value.trim()) {
                    input.style.borderColor = 'var(--error)';
                    isValid = false;
                }
            });

            if (!isValid) {
                e.preventDefault();
                alert('Please fill all required fields');
            }

            // Add password matching check for registration
            if (this.id === 'registerForm') {
                const password = this.querySelector('input[name="password"]');
                const confirmPassword = this.querySelector('input[name="confirm-password"]');

                if (password.value !== confirmPassword.value) {
                    e.preventDefault();
                    password.style.borderColor = 'var(--error)';
                    confirmPassword.style.borderColor = 'var(--error)';
                    alert('Passwords do not match');
                }
            }
        });
    });

    // Input error clearing
    document.querySelectorAll('input').forEach(input => {
        input.addEventListener('input', function() {
            this.style.borderColor = '#e9ecef';
        });
    });
});