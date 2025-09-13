import { test, expect } from '@playwright/test';

test('homepage has Playwright in title and get started link works', async ({ page }) => {
  await page.goto('https://playwright.dev/');
  await expect(page).toHaveTitle(/Playwright/);

  await page.getByRole('link', { name: 'Get started' }).click();
  await expect(page.locator('h1')).toContainText('Installation');
});
