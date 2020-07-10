/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"

touch ~/.vimrc
echo "syntax on" >> ~/.vimrc

echo "export CLICOLOR=1" >> ~/.zshrc
echo "export LSCOLORS=GxFxCxDxBxegedabagaced" >> ~/.zshrc
echo "export PS1=\"%d %% \"" >> ~/.zshrc

brew install starship

echo "eval \"$(starship init zsh)\"" >> ~/.zshrc
