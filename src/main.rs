mod greeter;
mod user;

fn main() {
    println!("{}", greeter::greet("Rust"));
    let user = user::User::new("Alice", 30);
    println!("{}", user);
}
