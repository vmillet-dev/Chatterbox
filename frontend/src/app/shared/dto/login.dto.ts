export class LoginDto {
  private usernameOrEmail: string;
  private password: string;

  constructor(usernameOrEmail: string, password: string) {
    this.usernameOrEmail = usernameOrEmail;
    this.password = password;
  }
}
