terraform {
  backend "s3" {
    bucket  = "terraform-s3-bucket-simon"
    key     = "jenkins-class/terraform.tfstate"
    region  = "us-east-1"
    encrypt = true

  }
}