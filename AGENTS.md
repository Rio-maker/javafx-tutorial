# Git commit message conventions

When the user has made or is preparing a meaningful change, suggest a commit
message that follows the SE-EDU Git conventions:

- Write the subject in imperative mood (for example, `Add login validation`).
- Capitalize the first letter.
- Keep the subject ideally within 50 characters and never over 72 characters.
- Do not end the subject with a period.
- Add a scope or category when it makes the change clearer, such as
  `Main.java: Add chat input handling` or `bug fix: Handle empty input`.
- For non-trivial commits, include a body separated from the subject by a
  blank line. Wrap body lines at 72 characters.
- In the body, explain what changed and why; do not merely describe how the
  code was implemented.
- If suggesting a branch name, use meaningful kebab-case keywords; for an
  issue, use `issueNumber-keywords`.

After completing or reviewing a change, proactively provide one suggested
commit message (subject and, when useful, body) unless the user asks not to.

Source: https://se-education.org/guides/conventions/git.html
