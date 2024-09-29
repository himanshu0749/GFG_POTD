 int totalCount = 0;

        for (int num : arr) {
            int fullParts = num / k; // Number of full parts of size k
            int remainder = num % k;  // Remainder part

            // Each full part contributes 1, and we add 1 if there's a remainder
            totalCount += fullParts + (remainder > 0 ? 1 : 0);
        }

        return totalCount;
