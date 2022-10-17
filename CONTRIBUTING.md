# How do I make a contribution?

### Steps

1. Fork the repository associated with the issue to your local GitHub organization. This means that you will have a copy of the repository under your-**GitHub-username/repository-name**.

2. Clone the repository to your local machine using git clone https://github.com/github-username/**repository-name**/java-code-samples.git.

3. Create a new branch for your fix using **git checkout -b branch-name-here**.

4. Make the appropriate changes for the issue you are trying to address or the feature that you want to add.

5. Use **git add insert-paths-of-changed-files-here** to add the file contents of the changed files to the "snapshot" git uses to manage the state of the project, also known as the index.

6. Use **git commit -m "Insert a short message of the changes made here"** to commit the contents of the index with a descriptive message.

7. Push the changes to the remote repository using **git push origin branch-name-here**.

8. Submit a pull request to the upstream repository from github.com and your forked repo.

9. Title the pull request with a short description of the changes made and the issue or bug number associated with your change. For example, you can title an issue like so "Added so and so features #1002".

9. In the description of the pull request, explain the changes that you made, any issues you think exist with the pull request you made, and any questions you have for the maintainer. The reviewer will review and share feedback if any to improve your code or artifact!

10. Wait for the pull request to be reviewed by a maintainer.

11. Make changes to the pull request if the reviewing maintainer recommends them.

Thats all !
