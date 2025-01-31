/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.8/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
  // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
  alias(libs.plugins.jvm)

  // Apply the java-library plugin for API and implementation separation.
  `java-library`
}

repositories {
  // Use Maven Central for resolving dependencies.
  mavenCentral()
}

configurations.testImplementation {
  exclude(group = "com.amazonaws", module = "DynamoDBLocal")
}

dependencies {
  testImplementation(testFixtures("com.squareup.misk:misk-aws-dynamodb"))

  // Use JUnit Jupiter for testing.
  testImplementation(libs.junit.jupiter)
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
  }
}

tasks.named<Test>("test") {
  // Use JUnit Platform for unit tests.
  useJUnitPlatform()
}
